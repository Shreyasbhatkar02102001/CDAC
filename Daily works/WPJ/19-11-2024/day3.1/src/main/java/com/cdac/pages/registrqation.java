package com.cdac.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

import static com.cdac.utils.DBUtils.*;

/**
 * Servlet implementation class ValidationServlet
 */
/** key = /login  
 *  whatever is in form action is should be here : /{action_name}
 *  therefore, urlPatterns = "/{action_name}"
 *  **/
@WebServlet(urlPatterns = "/voter_register",loadOnStartup = 3)
public class registrqation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	/**
	 * @see Servlet#init()
	 */
	/*
	 * Rule regarding method overriding n exc handling Overriding form of the method
	 * , CAN NOT add any NEW or BROADER CHECKED exceptions
	 * 
	 */
	// overriding form of the init() - inherited from GenericServlet
	@Override
	public void init() throws ServletException {
		try {
			System.out.println("in init");
			// open connection
			openConnection();
			// create dao instance
			// dependent = servlet, dependecy = UserDaoImpl
			// servlet is dependent on UserDaoImpl for data access logic
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// re throw the exception to the caller - WC - so that WC will mark this servlet
			// un available for further servicing
			// ( i.e )it won't continue with the remaining life cycle
			// Ctor of ServletException(String mesg,Throwable rootCause)
			throw new ServletException("err in init of " + getClass(), e);
			// reason why we use servlet exception, so that WC would know about checked exception/error
			// and init() method has failed
			// else WC will continue further execution even though initialization has failed
		}

	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
		try {
			System.out.println("in destroy");
			// dao's cleanup + close cn
			userDao.cleanUp();
			closeConnection();
		} catch (Exception e) {
			throw new RuntimeException("err in destroy " + getClass(), e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	// for every incomin request from client @public Serviice Method is the only method WC understands
	// @public service method will further call @protected service method
	// whats the difference between the arguements in public vs protected service?
	// @public service has : ServletRequest, ServleyResponse
	// @protected service has : HttpServletRequest, HttpServletResponse
	// HttpServletRequest is sub interface of ServletRequest and HttpServletResponse is sub interface of ServletResponse
	
	// is there any need to override service method? : - Not required  
	@Override // inherited from HttpServlet
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		
		try(PrintWriter pw = response.getWriter()){
			String fname = request.getParameter("fn");
			String lname = request.getParameter("ln");
			String email = request.getParameter("em");
			String pass = request.getParameter("pass");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dtpara = request.getParameter("dob");
			java.util.Date dt = sdf.parse(dtpara);
			java.sql.Date sdt = new Date(dt.getTime());

			LocalDate localDate1 = new java.sql.Date(dt.getTime()).toLocalDate();
			
			Period period = Period.between(localDate1, LocalDate.now()); 
			
			
			if (period.getYears() >= 21) {
				user.setFirstName(fname);
				user.setLastName(lname);
				user.setEmail(email);
				user.setPassword(pass);
				user.setDob(sdt);
				user.setUserRole("voter");
				
				String result = userDao.registerVoter(user);
				pw.print("<h5>"+result+"</h5>");
			}else {
				pw.print("<h5>Underage unable to register for voting</h5>");
			}
			
			
			
		} catch (Exception e) {
			// re throw the same exc to the caller(WC)
			throw new ServletException("err in doXXX of " + getClass(), e);
		}
	}

}

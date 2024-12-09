package com.cdac.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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
@WebServlet(urlPatterns = "/login",loadOnStartup = 3)
public class ValidationServlet extends HttpServlet {
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
		// 1. set cont type
		response.setContentType("text/html");
		// 2. get PW
		try (PrintWriter pw = response.getWriter()) {
			// 3. read request params sent from client to Servlet/server
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			// 4. Invoke dao's method for user authentication
			// in this servlet is calling Dao's method
			User user = userDao.authenticateUser(email, pwd);
			//5. Check if valid or invalid login
			if(user == null)
			{
				//=> invalid login->, send err mesg with a retry link to the clnt
				pw.print("<h5> Invalid Login , "
						+ "Please <a href='login.html'>Retry</a></h5>");						
			} else {
				//6. In case of successful auth , store user details in a Cookie
				//API of javax.servlet.http.Cookie(String cookieName,String cookieValue)
				
				// in text, datatype : string, transfer from server to client ?
				// instance of cookie is created on server side
				// and cookie obj/instance memory allocated in heap 
				// inshort c1 = stack memory, 
				// new Cookie("user_details", user.toString() = heap
				// and class in server-sode method area
				
				Cookie c1=new Cookie("user_details", user.toString());
				//7. Add cookie/s in resp header
				response.addCookie(c1);
				
				
				//=> authentication success --> continue to role based authorization
				/*
				 * How to redirect client to the next page ?
				 * API of HttpServletResponse
				 * public void sendRedirect(String location) throws IOException
				 * location - can relative to the current web app.
				 * 
				 */
				if(user.getUserRole().equals("admin"))
				{
					// WC does 80% work , remaining 20% happens here
					
					//admin login --> redirect the client to admin page
					response.sendRedirect("admin_page");
					/*
					 * WC - 1. clears(empties) response buffer (PW)
					 * 		2. sends temp redirect response
					 * 		( following process takes place when status code 302 : -
					 * 		  StatusCode 302- redirect, response headers - location= admin_page, content-length= 0
					 * 		  set-cookie- userd_details = user's details(String)
					 * 		  Web browser will check privacy settings 
					 * 		  if blocked - session tracking fails!!!!!!!!
					 * 		  if accepted - checks age of the cookie (expiry): -1 => stores it in cache
					 * 		  web browser automatically sends NEXT redirect request
					 * 		  URL - request http://host:port/day3.1/admin_page 
					 * 		  method by default - get therefore we need to override doget in candidatelistservelt )
					 * */
					
				} else {
					//=> voter login
					if(user.isStatus())
					{
						//=> already voted voter , redirect to logout page
						response.sendRedirect("logout");
						
					} else {
						//=> not yet voted voter , redirect the client candidate list page
						response.sendRedirect("candidate_list");
					}
				}
			}
		} catch (Exception e) {
			// re throw the same exc to the caller(WC)
			throw new ServletException("err in doXXX of " + getClass(), e);
		}
	}

}

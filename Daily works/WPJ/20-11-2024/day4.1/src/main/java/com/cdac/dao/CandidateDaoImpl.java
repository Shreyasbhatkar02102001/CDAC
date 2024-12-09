package com.cdac.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static com.cdac.utils.DBUtils.*;

import com.cdac.pojos.Candidate;

public class CandidateDaoImpl implements CandidateDao {
	//state
	private Connection connection;
	private PreparedStatement pst1,pst2,pst3;
	
	public CandidateDaoImpl() throws SQLException{
		//get cn
		connection=getConnection();
		//pst1
		pst1=connection.prepareStatement("select * from candidates");
		//pst2
		pst2=connection.prepareStatement("update candidates set votes=votes+1 where id=?");
		
		pst3 = connection.prepareStatement("select * from candidates order by desc limit 2");
	}

	@Override
	public List<Candidate> getAllCandidates() throws SQLException {
		List<Candidate> candidates=new ArrayList<>();
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
				candidates.add(new Candidate(rst.getInt(1), 
						rst.getString(2), rst.getString(3),rst.getInt(4)));
		}
		return candidates;
	}
	
	@Override
	public List<Candidate> fetchUserDetailsByRole(String role) throws SQLException {
		// 0. create empty list
		List<Candidate> users = new ArrayList<>();// size=0 , init capa=10
		// 1. set IN param
//		pst1.setString(1, role);
		// 2 exec query -> process RST
		try (ResultSet rst = pst3.executeQuery()) {
			/*
			 * int userId, String firstName, String lastName, String email, String password,
			 * Date dob, boolean status, String userRole
			 */
			// RST cursor -: before the 1st row
			while (rst.next()) {
				users.add(new Candidate(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4)));
			}
		}
		return users;// dao layer rets list of selected users --> Tester
	}
	

	@Override
	public String incrementVotes(int candidateId) throws SQLException {
		//set In param : candidate id
		pst2.setInt(1, candidateId);
		int rowCount=pst2.executeUpdate();
		if(rowCount==1)
			return "Incremented votes !";
		return "Incrementing votes failed !!!!!";
	}

	@Override
	public void cleanUp() throws SQLException {
		if(pst1 != null)
			pst1.close();
		if(pst2 != null)
			pst2.close();
		System.out.println("candidate dao cleaned up !");
		
	}
	
	

}

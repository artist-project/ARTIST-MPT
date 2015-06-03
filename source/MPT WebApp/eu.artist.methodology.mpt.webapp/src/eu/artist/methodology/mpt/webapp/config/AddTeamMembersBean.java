/*******************************************************************************
 *  Copyright (c) 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 * 				 Liagouras Georgios Andreas
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.webapp.config;

import java.io.File;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import eu.artist.methodology.mpt.webapp.login.CurrentSession;
import eu.artist.methodology.mpt.webapp.login.DatabaseConnection;
import eu.artist.methodology.mpt.webapp.login.LoginBean;
import eu.artist.methodology.mpt.webapp.login.RegisterBean;
import eu.artist.methodology.mpt.webapp.ruleEngine.RuleEngine;


public class AddTeamMembersBean extends ProjectBean {
	
	private static Logger logger = Logger.getLogger(AddTeamMembersBean.class);

	private String selectedProject;
private String selectedUser;

private String username;
private String password;





public List<String> getAvailableUsers() throws SQLException, Exception {
	
	
	PreparedStatement ps = DatabaseConnection
			.Get_Connection()
			.prepareStatement(
					"SELECT username FROM users WHERE role!='" + "Admin" + "'");
	
	
	ResultSet rs = ps.executeQuery();
	
	ArrayList<String> availableUsers = new ArrayList<String>();

	while(rs.next())
	{
		availableUsers.add(rs.getString(1));
		
		
	}
	
	
	
	return availableUsers;
	
	
}



public void chooseProject (){
	
	FacesContext context = FacesContext.getCurrentInstance();
	
	context.addMessage("null", new FacesMessage("Project Selected is" + getSelectedProject()));


}


public void addExistingUser() throws SQLException, Exception
{
	
	if(!(getSelectedProject() == null))
	addUser(getSelectedProject(), getSelectedUser());
	else
	{
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage("null", new FacesMessage("Please select a project from the available ones" ));
	}
	
		//context.addMessage("null", new FacesMessage("User added"));

	
//	else
//	{
//		context.addMessage("null", new FacesMessage("Problem in adding user"));
//
//		
//	}
	

}
	
	



public void register() throws SQLException, Exception {


	
	
	
	if (RegisterBean.Register(getUsername(), getPassword())  )
		{
		
		if(!(getSelectedProject() == null))
			addUser(getSelectedProject(), getUsername());
			//context.addMessage("null", new FacesMessage("User added in project"));

		else
		{
			FacesContext context = FacesContext.getCurrentInstance();

			context.addMessage("null", new FacesMessage("Please select a project from the available ones" ));
		}
		
			
		}
		
//		else
//		{
//			context.addMessage("null", new FacesMessage("Problem in adding user"));
//
//			
//			
//			
//		}
//	
	
	
	

}


public  boolean addUser(String selectedProject, String username)
		throws SQLException, Exception {

	PreparedStatement ps = DatabaseConnection
			.Get_Connection()
			.prepareStatement(
					"SELECT * FROM projectmembers WHERE membername='" + username + "' AND   projectname='" + selectedProject +"'");
	
	FacesContext context = FacesContext.getCurrentInstance();
	FacesContext context2 = FacesContext.getCurrentInstance();

	ResultSet rs = ps.executeQuery();

	if (rs.next())

	{

		logger.debug("User already in project");
		context.addMessage(null, new FacesMessage("User Already Exists."));
		return false;

	}

	else {

		String sql = "INSERT INTO projectmembers (projectname, membername) VALUES('"
				+ selectedProject + "','" + username + "')";

		DatabaseConnection.Get_Connection().prepareStatement(sql)
				.executeUpdate();

		context2.addMessage(null, new FacesMessage("User added in project."));
		logger.debug("User registered");

		return true;

	}

}


	public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



public String getSelectedProject() {
	return selectedProject;
}

public void setSelectedProject(String selectedProject) {
	this.selectedProject = selectedProject;
}

public String getSelectedUser() {
	return selectedUser;
}

public void setSelectedUser(String selectedUser) {
	this.selectedUser = selectedUser;
}




	
	
	

}

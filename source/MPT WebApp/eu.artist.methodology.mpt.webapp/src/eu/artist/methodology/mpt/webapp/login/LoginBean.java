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
 *  Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.webapp.login;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import eu.artist.methodology.mpt.webapp.login.DatabaseConnection;
import eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {

	private String username;
	private String password;
	private boolean isUserLoggedIn = false;
	private boolean showRegistrationForm = false;
	private boolean showUpdateForm = false;
	
	/**
	 * @return Connection
	 * @throws Exception
	 */

	/**
	 * @return Connection
	 * @throws SQLException
	 * @throws Exception
	 */

	public void register() throws SQLException, Exception {

		if (this.showRegistrationForm == false) {
			showRegistrationForm = true;
		}

		else {
			if (RegisterBean.Register(getUsername(), getPassword()))
				showRegistrationForm = false;

		}

	}

	public void update() throws SQLException, Exception {
		if (!showUpdateForm) {

			showUpdateForm = true;

		}

		else {
			UpdatePasswordBean.Update(getUsername(), getPassword());
			showUpdateForm = false;
		}
	}

	public void login() throws Exception {

		PreparedStatement ps = DatabaseConnection.Get_Connection()
				.prepareStatement(
						"SELECT * FROM users WHERE username='" + this.username
								+ "'  AND  password='" + this.password + "'");

		FacesContext context = FacesContext.getCurrentInstance();

		ResultSet rs = ps.executeQuery();

		if (rs.next())

		{
			CurrentSession.getSession().setAttribute("username", getUsername());
			CurrentSession.getSession().setAttribute("defaultProject","");

			isUserLoggedIn = true;
			context.addMessage("null", new FacesMessage("Login succesful."));

		}

		else {

			context.addMessage("null", new FacesMessage("Login failed."));

		}

	}

	public void logout() {

		showRegistrationForm = false;
		showUpdateForm = false;
		
		

		CurrentSession.getSession().invalidate();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Logout Succesful"));

		goToHomePage();

	}

	public void goToHomePage() {
		showRegistrationForm = false;
		showUpdateForm = false;
		
		
		try {
			CurrentSession.getExternalContext().redirect(
					CurrentSession.getExternalContext().getRequestContextPath()
							+ "/mpthome.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Logout UnSuccesful"));

			e.printStackTrace();
		}

	}
	
	

	


	public void checkPropertiesFile(String pathToPropertiesFile) {
		File file = new File(pathToPropertiesFile);
		if (!file.exists()) {
			try {

				if (file.createNewFile()) {

					FacesContext.getCurrentInstance()
							.addMessage(
									"null",
									new FacesMessage(
											"New properties file is created."));

				}

			} catch (IOException e) {

				FacesContext
						.getCurrentInstance()
						.addMessage(
								"null",
								new FacesMessage(
										"An error occured while trying to create new properties file."));

			}

		}

	}

	// if file doesnt exists, then create it

	public Properties getMptProperties() {
		Properties mptProps = new Properties();
		InputStream in = MPTProcessorBean.class
				.getResourceAsStream("/mpt.properties");

		try {

			mptProps.load(in);
			in.close();

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return mptProps;
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

	public boolean isUserLoggedIn() {
		return isUserLoggedIn;
	}

	public void setUserLoggedIn(boolean isUserLoggedIn) {
		this.isUserLoggedIn = isUserLoggedIn;
	}

	public boolean isShowRegistrationForm() {
		return showRegistrationForm;
	}
	
	public boolean isDefaultProjectExists(){
		
		return !CurrentSession.getDefaultProject().isEmpty();
	}


	public void setShowRegistrationForm(boolean showRegistrationForm) {
		this.showRegistrationForm = showRegistrationForm;
	}

	public String getUser() {
		return CurrentSession.getUserName() != null ? CurrentSession
				.getUserName() : "";

	}
	
	public String getProject(){
		return  CurrentSession
				.getDefaultProject();

	}
	
	
	public boolean isUserAdmin() throws SQLException, Exception
	{
		PreparedStatement ps = DatabaseConnection.Get_Connection()
				.prepareStatement(
						"SELECT * FROM users WHERE username='" + CurrentSession.getUserName()
								+ "'  AND  role='" + "Admin" + "'");
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
		
		
		return false;
		
	}

	

	public boolean isShowUpdateForm() {
		return showUpdateForm;
	}

	public void setShowUpdateForm(boolean showUpdateForm) {
		this.showUpdateForm = showUpdateForm;
	}
	



	
}

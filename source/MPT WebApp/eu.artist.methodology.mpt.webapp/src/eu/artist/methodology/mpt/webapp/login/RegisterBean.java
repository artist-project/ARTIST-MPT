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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.apache.log4j.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class RegisterBean extends LoginBean {

	private static Logger logger = Logger.getLogger(RegisterBean.class);

	public static boolean Register(String username, String password)
			throws SQLException, Exception {

		PreparedStatement ps = DatabaseConnection
				.Get_Connection()
				.prepareStatement(
						"SELECT * FROM users WHERE username='" + username + "'");

		FacesContext context = FacesContext.getCurrentInstance();

		ResultSet rs = ps.executeQuery();

		if (rs.next())

		{

			logger.debug("User exists");
			context.addMessage(null, new FacesMessage("User Already Exists."));
			return false;

		}

		else {

			String sql = "INSERT INTO users(username, password,role) VALUES('"
					+ username + "','" + password + "', '" + "user" +"')";

			DatabaseConnection.Get_Connection().prepareStatement(sql)
					.executeUpdate();

			context.addMessage(null, new FacesMessage("User Registered."));
			logger.debug("User registered");

			return true;

		}

	}

}

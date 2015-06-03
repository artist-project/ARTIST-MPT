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
import eu.artist.methodology.mpt.webapp.ruleEngine.RuleEngine;


public class ProjectBean extends LoginBean 

{
	
	private static Logger logger = Logger.getLogger(ProjectBean.class);

	
	private String previewsProject;
	private String selectedProject;

	private String projectName;
	
	
	
	public List<String> get�vailableProjects(){
		
		String path_to_projects=getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\mat";
				+ File.separator + "Projects";
		
		File[] files = new File(path_to_projects).listFiles();

		ArrayList<String> projectNames = new ArrayList<String>();
	

		if (files != null) {

			for (File file : files) {
				if (file.isDirectory()) {
					projectNames.add(file.getName());
				}
			}

		}
		


		return projectNames;
		
	}
	
	
public List<String> get�vailableProjectsForUser() throws SQLException, Exception{
		

	
	PreparedStatement ps = DatabaseConnection
			.Get_Connection()
			.prepareStatement(
					"SELECT projectname FROM projectmembers WHERE membername='" + CurrentSession.getUserName() + "'");
	
	
	ResultSet rs = ps.executeQuery();
	
	ArrayList<String> projectNames = new ArrayList<String>();


	while(rs.next() && !rs.wasNull())
	{
		projectNames.add(rs.getString(1));
		
		
	}
	
	
	

		return projectNames;
		
	}
	
	
	
	
	
	
	
	
	public void createProject() throws SQLException, Exception{
		
		FacesContext context2 = FacesContext.getCurrentInstance();

	
			
		
		String path_to_projects=getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\mat";
				+ File.separator + "Projects" +  File.separator + projectName;
		
		File checkDir = new File(path_to_projects);

		if (!checkDir.exists()) {
			checkDir.mkdirs();
		}

		
		if (!isUserAdmin())
		{
			
			PreparedStatement ps = DatabaseConnection
					.Get_Connection()
					.prepareStatement(
							"SELECT * FROM projectmembers WHERE membername='" + CurrentSession.getUserName() + "' AND   projectname='" + projectName +"'");
			
			FacesContext context = FacesContext.getCurrentInstance();

			ResultSet rs = ps.executeQuery();

			if (rs.next())

			{

				logger.debug("User already in this project");
				context.addMessage(null, new FacesMessage("User Already Exists."));

			}

			else {

				String sql = "INSERT INTO projectmembers (projectname, membername) VALUES('"
						+ projectName + "','" + CurrentSession.getUserName() + "')";

				DatabaseConnection.Get_Connection().prepareStatement(sql)
						.executeUpdate();

				context.addMessage(null, new FacesMessage("Project Created"));
				logger.debug("Project Created");


			}
			
		}
			
		//selectedProject=projectName;
		//CurrentSession.getSession().setAttribute("defaultProject", getSelectedProject());

		context2.addMessage("null", new FacesMessage("Project Created  is " + getProjectName(), "please select it from the available ones"));
		
		
		
		
		
		
		
	}
	
	

	public void chooseProject (){
		
		FacesContext context = FacesContext.getCurrentInstance();

		if (previewsProject!=getSelectedProject())
		{
		
		CurrentSession.getSession().setAttribute("defaultProject", getSelectedProject());
		context.addMessage("null", new FacesMessage("Project Selected is" + getSelectedProject()));

	RuleEngine.INSTANCE.removeRules();
		}
		
	

	previewsProject=getSelectedProject();


	}
	
	
	
	public boolean isProjectExists(){
		return !get�vailableProjects().isEmpty();
	}

	public String getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(String selectedProject) {
		this.selectedProject = selectedProject;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}







	public String getPreviewsProject() {
		return previewsProject;
	}







	public void setPreviewsProject(String previewsProject) {
		this.previewsProject = previewsProject;
	}
	
	
	

}

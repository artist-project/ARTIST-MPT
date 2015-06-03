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
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.drools.command.runtime.rule.GetAgendaEventListenersCommand;
import org.primefaces.context.RequestContext;

import eu.artist.methodology.mpt.webapp.login.CurrentSession;
import eu.artist.methodology.mpt.webapp.login.LoginBean;

public class ListFileHandlerBean extends LoginBean {

	private static Logger logger = Logger.getLogger(ListFileHandlerBean.class);

	private String selectedFile;

	

	public List<String> getFiles(String path_to_reports) {

		File[] files = new File(path_to_reports).listFiles();

		ArrayList<String> fileNames = new ArrayList<String>();

		if (files != null) {

			for (File file : files) {
				if (file.isFile()) {
					fileNames.add(file.getName());
				}
			}

		}

		return fileNames;
	}
	
	
	

	public List<String> getMatFiles() {

		String path_to_tft_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\mat";
				+ File.separator + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "mat";

		return getFiles(path_to_tft_reports);
	}

	public List<String> getTftFiles() {

		String path_to_tft_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\tft";
				+ File.separator + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "tft";

		return getFiles(path_to_tft_reports);
	}

	public List<String> getBftFiles() {

		String path_to_tft_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\bft";
				+ File.separator + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "bft";

		return getFiles(path_to_tft_reports);
	}

	public List<String> getMigFiles() {

		String path_to_tft_reports = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\" + CurrentSession.getUserName() + "\\mig";
				+ File.separator + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "mig";

		return getFiles(path_to_tft_reports);
	}

	
	public void save() throws IOException {

		String path_to_properties_file = getMptProperties().getProperty(
				"path_to_reports")
				//+ "\\"
				+ File.separator
				+ "Projects" + File.separator + CurrentSession.getDefaultProject()
				//+ "\\mpt"
				+ File.separator + "mpt"
				+ CurrentSession.getUserName() + ".properties";

		checkPropertiesFile(path_to_properties_file);

		logger.debug("Path to properties file is " + path_to_properties_file);

		try {

			File f = new File(path_to_properties_file);

			URL url = f.toURI().toURL();

			logger.debug("File URL is " + url.toString());

			logger.info("Configuration saved");
			logger.debug("Selected file is " + selectedFile);
			PropertiesConfiguration config = new PropertiesConfiguration(url);

			String chosenButton = CurrentSession.getExternalContext()
					.getRequestParameterMap().get("button");
			String propertyToSet = null;

			if ("mat".equalsIgnoreCase(chosenButton)) {
				propertyToSet = "mat_report";
			} else if ("tft".equalsIgnoreCase(chosenButton)) {
				propertyToSet = "tft_report";
			} else if ("bft".equalsIgnoreCase(chosenButton)) {
				propertyToSet = "bft_report";
			}else if ("mig".equalsIgnoreCase(chosenButton)) {
				propertyToSet = "mig_report";
			}

			//config.setProperty(propertyToSet, "\\" + selectedFile);
			config.setProperty(propertyToSet, File.separator + selectedFile);
			config.save();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Configuration saved"));

		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Configuration failed"));

			logger.error("Configuration not saved");

			e.printStackTrace();

		}
	}
	
	

	



	public String getSelectedFile() {
		return selectedFile;
	}

	public void setSelectedFile(String selectedFile) {
		this.selectedFile = selectedFile;
	}

	public boolean isMatFileExists() {
		return !getMatFiles().isEmpty();
	}

	public boolean isTftfileExists() {
		return !getTftFiles().isEmpty();
	}

	public boolean isBftFileExists() {
		return !getBftFiles().isEmpty();
	}

	public boolean isMigFileExists() {
		return !getMigFiles().isEmpty();
	}
	

	
}

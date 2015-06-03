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
package eu.artist.methodology.mpt.webapp.mat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.awt.*;
import java.applet.*;

import org.apache.log4j.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import eu.artist.methodology.mpt.model.GlobalVariable;
import eu.artist.methodology.mpt.model.Result;
import eu.artist.methodology.mpt.webapp.login.CurrentSession;
import eu.artist.methodology.mpt.webapp.login.LoginBean;
import eu.artist.methodology.mpt.webapp.ruleEngine.RuleEngine;

public class MPTProcessorBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6036721730129280083L;

	private static Logger logger = Logger.getLogger(MPTProcessorBean.class.toString());
	
	private  String  targetplat;
	private  boolean technicalLevelRule;
	private  boolean businessGoalsLevelRule;
	private  boolean rule3;
	private static ArrayList <String> helper = new ArrayList <String>();

	private  String  tdatabasereq;
	
	@ManagedProperty(value="#{loginBean}") 
	LoginBean loginBean;
	
	public boolean isTechnicalLevelRule() {
		
		technicalLevelRule=false;
		
	

		//logger.debug("rulesVariavble is " + CurrentSession.getSession().getAttribute("rulesVariable"));
		

	try{

		ArrayList <String> rulesVariable = (ArrayList<String>) CurrentSession.getSession().getAttribute("rulesVariable");
		

		
		if (rulesVariable.contains("RULE_1_RETURNS_TRUE"))
		{
			technicalLevelRule=true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	       
	  } 
	


		

		
		return technicalLevelRule;		
	}
	
	
	//RULES
	
	public boolean isEMREQA3Visible() {
		
		logger.debug("helper is " + helper);
	
	try{

	//	ArrayList <String> rulesVariable = (ArrayList<String>) CurrentSession.getSession().getAttribute("rulesVariable");
		

		if (helper.contains("TECH_2_1") || helper.contains("TECH_2_2"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	       
	  } 
	
	return false;		
	}
	
	
	
	public boolean isEMREQA4Visible() {
		
		logger.debug("helper is " + helper);

		try{

			//ArrayList <String> rulesVariable = (ArrayList<String>) CurrentSession.getSession().getAttribute("rulesVariable");
			

			if (helper.contains("TECH_2_3"))
			{
				return true;
			}
			
		}
		catch (Exception ex) {
			  
		       ex.printStackTrace();
		       
		  } 
		
		return false;		
		}
	
	
	
	public boolean isTEBENCHVisible() {
		
		logger.debug("helper is " + helper);

		try{

			if (!helper.contains("TECH_3") && !helper.contains("TECH_5"))
			{
				return true;
			}
			
		}
		catch (Exception ex) {
			  
		       ex.printStackTrace();
		  } 
		
		return false;		
		}
	
	
public boolean isTEMPOPVisible() {
		
		logger.debug("helper is " + helper);

		try{

			if (!helper.contains("TECH_3") && !helper.contains("TECH_5"))
			{
				return true;
			}
			
		}
		catch (Exception ex) {
			  
		       ex.printStackTrace();
		  } 
		
		return false;		
		}


public boolean isAPAPUPVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("TECH_3") && !helper.contains("TECH_5") && !helper.contains("TECH_4"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isAPACLASVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("TECH_3") && !helper.contains("TECH_5") && !helper.contains("TECH_4"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isSCTARGETVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("TECH_3"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isSCTARGETA2A3Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("TECH_5"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isGSCODEVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("TECH_6"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isGDEPLVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("TECH_7"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isVERBETCOptional() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("TECH_8"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isMCRPVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("PROC_1_0") || helper.contains("BUS_10") || helper.contains("BUS_9"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isMCRPA1Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_1_1"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isMCRPA7Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_2"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


//public boolean isIMRPVisible() {
//	
//	logger.debug("helper is " + helper);
//
//	try{
//
//		if (!helper.contains("PROC_3"))
//		{
//			return true;
//		}
//		
//	}
//	catch (Exception ex) {
//		  
//	       ex.printStackTrace();
//	  } 
//	
//	return false;		
//	}
//	
	
	
public boolean isSLAMPA1Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_4"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}
	

public boolean isSLAMPA2Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_4"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isSLAMPA3Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_5"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isSLAMPA6Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_6"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isSLAMPA4Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_7"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isSLAMPA5Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_7"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}
	

//CPMP

public boolean isOPERATIONALA1Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_9"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}



public boolean isRAPVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_9"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isDPVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_10_2"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isUMPVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if (!helper.contains("PROC_11"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}



public boolean isFINANCIALA1Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("BUS_1"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isFINANCIALA2Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("BUS_1") || helper.contains("BUS_2") || helper.contains("BUS_3"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isFINANCIALA3Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("BUS_1") || helper.contains("BUS_2") )
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

public boolean isFINANCIALA4Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if (helper.contains("BUS_1") || helper.contains("BUS_2") || helper.contains("BUS_7") )
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isOPERATIONALA2Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if ( helper.contains("BUS_2") )
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isOPERATIONALA3Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if ( helper.contains("BUS_2") || helper.contains("BUS_3"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isOPERATIONALA5Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if ( helper.contains("BUS_2"))
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}
		


public boolean isVALPROVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if ( helper.contains("BUS_5") || helper.contains("BUS_8_2") )
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}




public boolean isCUSTOMERVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if ( helper.contains("BUS_5") )
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}


public boolean isSLAMPVisible() {
	
	logger.debug("helper is " + helper);

	try{

		if ( helper.contains("BUS_6") )
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}



public boolean isCUSTOMERA5Visible() {
	
	logger.debug("helper is " + helper);

	try{

		if ( helper.contains("BUS_8_1") || helper.contains("BUS_8_2") )
		{
			return true;
		}
		
	}
	catch (Exception ex) {
		  
	       ex.printStackTrace();
	  } 
	
	return false;		
	}

	
	public static boolean customizeEMREQ_task() {
		
		return true;		
	}
	
	public static boolean customizeOPTAPPFEA_task() {
		
		return true;		
	}
	
	public String viewMethodology() {
		logger.debug("entering view methodology");

		if (loginBean!=null) {
			
			
			logger.debug("login bean is not null");
			CurrentSession.getSession().removeAttribute("rulesVariable");
			helper.clear();
			//helper = new ArrayList <String>();
			try {
			
				// Initialise MPT properties 
			    Properties mptProps2 = new Properties();
			  
				//String path_to_properties_file =  loginBean.getMptProperties().getProperty("path_to_reports")+"\\"+CurrentSession.getUserName()+"\\mpt"+CurrentSession.getUserName()+".properties";
				
				String path_to_properties_file =  loginBean.getMptProperties().getProperty("path_to_reports") + File.separator + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "mpt"+CurrentSession.getUserName()+".properties";
				
				InputStream in2 = new FileInputStream(path_to_properties_file);
		 		
		 		try {
		 			
					mptProps2.load(in2);
					in2.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String username = loginBean.getUsername();
				
				logger.debug("Username is " + username);
				
				if (username==null) username = "default";
				
				

				//File xmlMatFile = new File(loginBean.getMptProperties().getProperty("path_to_reports") + "\\"  + username + "\\mat"+ mptProps2.getProperty("mat_report")); 
				//File csvTftFile = new File(loginBean.getMptProperties().getProperty("path_to_reports") + "\\"  + username + "\\tft"+ mptProps2.getProperty("tft_report")); 
				//File xmlMigFile = new File(loginBean.getMptProperties().getProperty("path_to_reports") + "\\"  + username + "\\mig"+ mptProps2.getProperty("mig_report")); 

				File xmlMatFile = new File(loginBean.getMptProperties().getProperty("path_to_reports") + File.separator  + "Projects"+ File.separator + CurrentSession.getDefaultProject() + File.separator + "mat"+ mptProps2.getProperty("mat_report")); 
				File csvTftFile = new File(loginBean.getMptProperties().getProperty("path_to_reports") + File.separator + "Projects"+ File.separator + CurrentSession.getDefaultProject() + File.separator + "tft"+ mptProps2.getProperty("tft_report")); 
				File xmlMigFile = new File(loginBean.getMptProperties().getProperty("path_to_reports") + File.separator  + "Projects" + File.separator + CurrentSession.getDefaultProject() + File.separator + "mig"+ mptProps2.getProperty("mig_report")); 


				if (xmlMatFile.exists())
				{
				try
				{
					RuleEngine.INSTANCE.loadNewMATReport(xmlMatFile);

				}
				catch (Exception ex) {
					  
				       ex.printStackTrace();
				       
				  } 
				}
				
				if (csvTftFile.exists())
				{
				
				try
				{
					RuleEngine.INSTANCE.loadTFTReport(csvTftFile);

				}
				catch (Exception ex) {
					  
				       ex.printStackTrace();
				       
				  } 
				}
				
				if (xmlMigFile.exists())
				{
				
				try
				{
					RuleEngine.INSTANCE.loadMATReport(xmlMigFile);

				}
				catch (Exception ex) {
					  
				       ex.printStackTrace();
				       
				  } 
				
				}

				URL url = MPTProcessorBean.class.getResource("/resource/RuleSet_1.drl");
				
				File f = new File(url.toURI());
				
				RuleEngine.INSTANCE.setRuleFile(f);

				GlobalVariable r_variable = new GlobalVariable("rulesVariable", new RulesVariable());
				List<GlobalVariable> variables = new ArrayList<GlobalVariable>();
				variables.add(r_variable);
				
				RuleEngine.INSTANCE.fireRules(variables);
				Result result = new Result();
					result=	RuleEngine.INSTANCE.getResult();
				
				
		    	CurrentSession.getSession().setAttribute("rulesVariable", ((RulesVariable)r_variable.getVariable()).getRuleString());
				variables.clear();
				logger.debug("Result: " + result.getStringResult());
				//logger.debug("MAT REPORT IS " + mptProps2.getProperty("mat_report"));
				logger.debug("gia na doume" + (ArrayList<String>) CurrentSession.getSession().getAttribute("rulesVariable"));

			
				logger.debug("exit");
				
				if (result.getStringResult() == null )
				{
					FacesContext.getCurrentInstance().addMessage("null", new FacesMessage("File format is wrong"));
				}
				
				
				 helper = (ArrayList<String>) CurrentSession.getSession().getAttribute("rulesVariable");

				
				
				return "index.xhtml";
				
				
				
			
			} catch (Exception ex) {
				  
			       ex.printStackTrace();
			       
			  } 
			
		}
		return null;
		
		
		
		 
	}
	  
	public LoginBean getLoginBean() {
		return loginBean;
	}
	
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
		
	}

	public void setTechnicalLevelRule(boolean technicalLevelRule) {
		this.technicalLevelRule = technicalLevelRule;
	}

	public String getTargetplat() {
		return targetplat;
	}

	public void setTargetplat(String targetplat) {
		this.targetplat = targetplat;
	}

	public String getTdatabasereq() {
		return tdatabasereq;
	}

	public void setTdatabasereq(String tdatabasereq) {
		this.tdatabasereq = tdatabasereq;
	}


	public void setBusinessGoalsLevelRule(boolean businessGoalsLevelRule) {
		this.businessGoalsLevelRule = businessGoalsLevelRule;
	}

	

	public void setRule3(boolean rule3) {
		this.rule3 = rule3;
	}

	/**
	 * @param eMREQA3Visible the eMREQA3Visible to set
	 */

	
}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="eu.artist.methodology.mpt.webapp.mat.MPTProcessorBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Contents</title>
<style type="text/css">
/*******************************************************************************
 * Copyright (c) 2000, 2004, 2005 IBM Corporation. All Rights Reserved. 
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

* {
	font-family: arial, helvetica, sans-serif;
	font-size: 9pt;
	margin: 0;
	padding: 0;
}

BODY {
	background-color: Window;
	font: icon;
	margin:0;
	padding:0;
	border:0;
}

UL {
	border-width:0;
	margin-left:15px;
}

#root {
	margin-top:5px;
	margin-left:5px;
}

UL.expanded {
	display:block;
}

UL.collapsed {
	display: none;
}

LI {
	margin-top:3px;
	list-style-image:none;
	list-style-type:none;
		white-space: nowrap;
}

IMG {
	vertical-align: top;
	border:0px;
	margin:0px;
	padding:0px;
	margin-right:4px;
}


A {
	text-decoration:none;
	color:#258
	padding-right:2px;
	/* this works in ie5.5, but not in ie5.0  */
	white-space: nowrap;
}

A:hover{
	text-decoration:underline;
}

A.active{
	background:Highlight;
	color:HighlightText;
	width:100%;
}

A.active:hover{
	text-decoration:underline;
	background:Highlight;
	color:HighlightText;
	width:100%;
}



.h {
	visibility:hidden;
}

</style>
<base target="ory_doc"/>
<script language="JavaScript">

// Preload images
minus = new Image();
minus.src = "images"+"/minus.gif";
plus = new Image();
plus.src = "images"+"/plus.gif";
altTopicClosed = "Topic\u0020closed";
altTopicOpen = "Topic\u0020open";
</script><script language="JavaScript" src="toc.js"></script><script language="JavaScript" src="tree.js"></script>
</head>
<body dir="ltr" onload="setLoaded(); checkTasks() ">

<% MPTProcessorBean Task = new MPTProcessorBean(); %>


<script language="JavaScript" type="text/javascript">
function checkTasks() {
	

	if (<%= Task.isTEBENCHVisible()%> == false)
		document.getElementById("1c4b6fd1").style.display = 'none';
	
	if (<%= Task.isTEMPOPVisible()%> == false)
		document.getElementById("666ffe19").style.display = 'none';
	
	if (<%= Task.isAPAPUPVisible()%> == false)
		document.getElementById("c16c323d").style.display = 'none';
	
	if (<%= Task.isAPACLASVisible()%> == false)
		document.getElementById("1e2bc6c8").style.display = 'none';
	
	if (<%= Task.isSCTARGETVisible()%> == false)
		document.getElementById("692f86a7").style.display = 'none';
	
	if (<%= Task.isGSCODEVisible()%> == false)
		document.getElementById("63febbc8").style.display = 'none';
	
	if (<%= Task.isGDEPLVisible()%> == false)
		document.getElementById("c03d0278").style.display = 'none';
	
	if (<%= Task.isVERBETCOptional()%> == true)
		alert("VERBETC is optional");

	if (<%= Task.isMCRPVisible()%> == false)
		document.getElementById("c3d8aa72").style.display = 'none';
	
	if (<%= Task.isRAPVisible()%> == false)
		document.getElementById("1f9a2da1").style.display = 'none';
	
	if (<%= Task.isDPVisible()%> == false)
		document.getElementById("c5955f28").style.display = 'none';
	
	if (<%= Task.isUMPVisible()%> == false)
		document.getElementById("1b5b7c77").style.display = 'none';
	
	if (<%= Task.isVALPROVisible()%> == false)
		document.getElementById("6d5e107f").style.display = 'none';
	
	if (<%= Task.isCUSTOMERVisible()%> == false)
		document.getElementById("18d34017").style.display = 'none';
	
	if (<%= Task.isSLAMPVisible()%> == false)
		document.getElementById("c16d2f4a").style.display = 'none';
	
	
	
	
	
	  }	
				
			</script>	


<ul dir="ltr" class="expanded" id="root">
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="6e613398" parentId="" guid="_boyq0RvEEeSVgNVCd9uEdQ" href="./../ARTIST Methodology M30/capabilitypatterns/Artist methodology M30_4F33D3E.jsp?nodeId=6e613398"><img src="./images/CapabilityPattern.gif" alt="" title="">Artist methodology M30</a>
<ul class="collapsed">
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="7b6c0d19" parentId="6e613398" guid="_5NwTMMcbEeSwnqs8HmEXvQ" href="./../ARTIST Methodology M30/capabilitypatterns/Premigration_3BDB4933.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ&amp;nodeId=7b6c0d19"><img src="./images/Phase.gif" alt="" title="">Premigration</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c4a53a45" parentId="7b6c0d19" guid="_eIhV0cccEeSwnqs8HmEXvQ" href="./../ARTIST Methodology M30/capabilitypatterns/Technical Evaluation_42B89043.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ,_eIhV0cccEeSwnqs8HmEXvQ&amp;nodeId=c4a53a45"><img src="./images/Activity.gif" alt="" title="">TECHEVA</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="74723dde" parentId="7b6c0d19" guid="_GETiQcf1EeS9jsuCsUMFrg" href="./../ARTIST Methodology M30/capabilitypatterns/Migration Goals definition_8C0A9E5C.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ,_GETiQcf1EeS9jsuCsUMFrg&amp;nodeId=74723dde"><img src="./images/Activity.gif" alt="" title="">MGDEF</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="72fac09e" parentId="7b6c0d19" guid="_WfI9Acf1EeS9jsuCsUMFrg" href="./../ARTIST Methodology M30/capabilitypatterns/Business Evaluation_C71941B8.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ,_WfI9Acf1EeS9jsuCsUMFrg&amp;nodeId=72fac09e"><img src="./images/Activity.gif" alt="" title="">BUSEVA</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="16754439" parentId="7b6c0d19" guid="_tCcx4cf1EeS9jsuCsUMFrg" href="./../ARTIST Methodology M30/capabilitypatterns/Technical Feasibility_734B2DAA.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ,_tCcx4cf1EeS9jsuCsUMFrg&amp;nodeId=16754439"><img src="./images/Activity.gif" alt="" title="">TECHFEAS</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="6e5408b6" parentId="7b6c0d19" guid="_R1m7Mcf3EeS9jsuCsUMFrg" href="./../ARTIST Methodology M30/capabilitypatterns/Business Feasibility_6CCC98B8.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ,_R1m7Mcf3EeS9jsuCsUMFrg&amp;nodeId=6e5408b6"><img src="./images/Activity.gif" alt="" title="">BUSFEAS</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1c4526eb" parentId="7b6c0d19" guid="_HUAIMMf4EeS9jsuCsUMFrg" href="./../ARTIST Methodology M30/capabilitypatterns/Evaluate the migration_282320F.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ,_HUAIMMf4EeS9jsuCsUMFrg&amp;nodeId=1c4526eb"><img src="./images/Activity.gif" alt="" title="">MIGRAT</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="74afd5f8" parentId="7b6c0d19" guid="_IgDPIcf5EeS9jsuCsUMFrg" href="./../ARTIST Methodology M30/capabilitypatterns/Methodology Customization_F88454FF.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_5NwTMMcbEeSwnqs8HmEXvQ,_IgDPIcf5EeS9jsuCsUMFrg&amp;nodeId=74afd5f8"><img src="./images/Activity.gif" alt="" title="">METHCUST</a>
</li>
</ul>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="6b6455f8" parentId="6e613398" guid="_lipZ8RvGEeSVgNVCd9uEdQ" href="./../ARTIST Methodology M30/capabilitypatterns/Migration_33DD5A3A.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ&amp;nodeId=6b6455f8"><img src="./images/Phase.gif" alt="" title="">Migration</a>
<ul class="collapsed">
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="6b17e36c" parentId="6b6455f8" guid="_mw4HoRvGEeSVgNVCd9uEdQ" href="./../ARTIST Methodology M30/capabilitypatterns/Application Discovery Understanding_E62EF8BA.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ&amp;nodeId=6b17e36c"><img src="./images/Phase.gif" alt="" title="">Application Discovery &amp; Understanding</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="705f9945" parentId="6b17e36c" guid="_yM6kgRxzEeSWnujewVDp6Q" href="./../ARTIST Methodology M30/capabilitypatterns/Model Discovery_B5A377C1.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_yM6kgRxzEeSWnujewVDp6Q&amp;nodeId=705f9945"><img src="./images/Activity.gif" alt="" title="">MODELDISCO</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="7537752d" parentId="6b17e36c" guid="_MDHGcRx0EeSWnujewVDp6Q" href="./../ARTIST Methodology M30/capabilitypatterns/Model Understanding_76FDD728.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_mw4HoRvGEeSVgNVCd9uEdQ,_MDHGcRx0EeSWnujewVDp6Q&amp;nodeId=7537752d"><img src="./images/Activity.gif" alt="" title="">MODELUNDER</a>
</li>
</ul>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="18e03dcd" parentId="6b6455f8" guid="_twp9MRvGEeSVgNVCd9uEdQ" href="./../ARTIST Methodology M30/capabilitypatterns/Target Environment Specification_B5698EEA.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ&amp;nodeId=18e03dcd"><img src="./images/Phase.gif" alt="" title="">Target Environment Specification</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1c4b6fd1" parentId="18e03dcd" guid="_hM7koRvLEeSzI-OEcHu3kw" href="./../ARTIST Methodology M30/capabilitypatterns/Target Environment Benchmarking_8F721461.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_hM7koRvLEeSzI-OEcHu3kw&amp;nodeId=1c4b6fd1"><img src="./images/Activity.gif" alt="" title="">TEBENCH</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="666ffe19" parentId="18e03dcd" guid="_ljlb0RvLEeSzI-OEcHu3kw" href="./../ARTIST Methodology M30/capabilitypatterns/Target Environment Model Population_707A1ABB.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_ljlb0RvLEeSzI-OEcHu3kw&amp;nodeId=666ffe19"><img src="./images/Activity.gif" alt="" title="">TEMPOP</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c16c323d" parentId="18e03dcd" guid="_prVUURvLEeSzI-OEcHu3kw" href="./../ARTIST Methodology M30/capabilitypatterns/Application Components Performance and Usage profiling_FEDEFCC3.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_prVUURvLEeSzI-OEcHu3kw&amp;nodeId=c16c323d"><img src="./images/Activity.gif" alt="" title="">APAPUP</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1e2bc6c8" parentId="18e03dcd" guid="_QUZB8W8UEeSGk70TEZZiGw" href="./../ARTIST Methodology M30/capabilitypatterns/Application Artefacts Classification_5E40F31F.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_twp9MRvGEeSVgNVCd9uEdQ,_QUZB8W8UEeSGk70TEZZiGw&amp;nodeId=1e2bc6c8"><img src="./images/Activity.gif" alt="" title="">APACLAS</a>
</li>
</ul>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="7731ae31" parentId="6b6455f8" guid="_zd3-sRvGEeSVgNVCd9uEdQ" href="./../ARTIST Methodology M30/capabilitypatterns/Modernization_454C9CFC.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ&amp;nodeId=7731ae31"><img src="./images/Phase.gif" alt="" title="">Modernization</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c5af433a" parentId="7731ae31" guid="_k1aiEW8sEeSpifzI2SXP8A" href="./../ARTIST Methodology M30/capabilitypatterns/Express Migration Requirements_38D49CE5.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_k1aiEW8sEeSpifzI2SXP8A&amp;nodeId=c5af433a"><img src="./images/Activity.gif" alt="" title="">EMREQ</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="692f86a7" parentId="7731ae31" guid="_EihmEW_HEeSHL-dlvDvGPg" href="./../ARTIST Methodology M30/capabilitypatterns/Select Cloud Target_A1FE6C17.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_EihmEW_HEeSHL-dlvDvGPg&amp;nodeId=692f86a7"><img src="./images/Activity.gif" alt="" title="">SCTARGET</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c09e0fd9" parentId="7731ae31" guid="_W_cMUW_SEeSHL-dlvDvGPg" href="./../ARTIST Methodology M30/capabilitypatterns/Cloudify and Optimize application features_83823EFB.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_W_cMUW_SEeSHL-dlvDvGPg&amp;nodeId=c09e0fd9"><img src="./images/Activity.gif" alt="" title="">OPTAPPFEA</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c1d58062" parentId="7731ae31" guid="_DLzs8W_WEeSHL-dlvDvGPg" href="./../ARTIST Methodology M30/capabilitypatterns/Non-functional goals validation model level_11F6FD4B.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_DLzs8W_WEeSHL-dlvDvGPg&amp;nodeId=c1d58062"><img src="./images/Activity.gif" alt="" title="">NFVALML</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="63febbc8" parentId="7731ae31" guid="_XcS74W_cEeSHL-dlvDvGPg" href="./../ARTIST Methodology M30/capabilitypatterns/GSCODE_5C928129.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_XcS74W_cEeSHL-dlvDvGPg&amp;nodeId=63febbc8"><img src="./images/Activity.gif" alt="" title="">GSCODE</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c03d0278" parentId="7731ae31" guid="_h7XbcW_fEeSHL-dlvDvGPg" href="./../ARTIST Methodology M30/capabilitypatterns/Generate Deployment_D0C656A7.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_zd3-sRvGEeSVgNVCd9uEdQ,_h7XbcW_fEeSHL-dlvDvGPg&amp;nodeId=c03d0278"><img src="./images/Activity.gif" alt="" title="">GDEPL</a>
</li>
</ul>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="1f8c84dc" parentId="6b6455f8" guid="_96FfEXFeEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/Process related tasks_3E4E7EF5.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug&amp;nodeId=1f8c84dc"><img src="./images/Phase.gif" alt="" title="">Process related</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c16d2f4a" parentId="1f8c84dc" guid="__6FA4XFeEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/SLAMP_6ED80D9B.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,__6FA4XFeEeSNzfNcO5_Rug&amp;nodeId=c16d2f4a"><img src="./images/Activity.gif" alt="" title="">SLAMP</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1b5b7c77" parentId="1f8c84dc" guid="_BJzjYXFfEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/UMP_EDBF639D.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_BJzjYXFfEeSNzfNcO5_Rug&amp;nodeId=1b5b7c77"><img src="./images/Activity.gif" alt="" title="">UMP</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1c453298" parentId="1f8c84dc" guid="_D0kggXFfEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/CPMP_77C1929F.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_D0kggXFfEeSNzfNcO5_Rug&amp;nodeId=1c453298"><img src="./images/Activity.gif" alt="" title="">CPMP</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="15a8c04b" parentId="1f8c84dc" guid="_FWoJIXFfEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/IMRP_B93C3581.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_FWoJIXFfEeSNzfNcO5_Rug&amp;nodeId=15a8c04b"><img src="./images/Activity.gif" alt="" title="">IMRP</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c3d02650" parentId="1f8c84dc" guid="_GqN38XFfEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/MP_236F7095.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_GqN38XFfEeSNzfNcO5_Rug&amp;nodeId=c3d02650"><img src="./images/Activity.gif" alt="" title="">MP</a>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="c3d8aa72" parentId="1f8c84dc" guid="_HuxFMXFfEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/MCRP_4082FAAC.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug&amp;nodeId=c3d8aa72"><img src="./images/Activity.gif" alt="" title="">MCRP</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="6e5bef62" parentId="c3d8aa72" guid="_hc4h23FiEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/IMRP_A1BF6539.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_HuxFMXFfEeSNzfNcO5_Rug,_hc4h23FiEeSNzfNcO5_Rug&amp;nodeId=6e5bef62"><img src="./images/Activity.gif" alt="" title="">IMRP</a>
</li>
</ul>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1f9a2da1" parentId="1f8c84dc" guid="_JxTksXFfEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/RAP_C7DEDC90.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_JxTksXFfEeSNzfNcO5_Rug&amp;nodeId=1f9a2da1"><img src="./images/Activity.gif" alt="" title="">RAP</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c5955f28" parentId="1f8c84dc" guid="_M2J1wXFfEeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/DP_56F7EE33.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_96FfEXFeEeSNzfNcO5_Rug,_M2J1wXFfEeSNzfNcO5_Rug&amp;nodeId=c5955f28"><img src="./images/Activity.gif" alt="" title="">DP</a>
</li>
</ul>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="228ae531" parentId="6b6455f8" guid="_0Gq64XF3EeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/Business Model Definition_177525F3.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug&amp;nodeId=228ae531"><img src="./images/Phase.gif" alt="" title="">Business Model Definition</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="6d5e107f" parentId="228ae531" guid="_2CgVcXF3EeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/Value Proposition_B1DF2148.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_2CgVcXF3EeSNzfNcO5_Rug&amp;nodeId=6d5e107f"><img src="./images/Activity.gif" alt="" title="">VALPRO</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="18d34017" parentId="228ae531" guid="_f1PMkXF4EeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/Customer interface_962A8F69.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_f1PMkXF4EeSNzfNcO5_Rug&amp;nodeId=18d34017"><img src="./images/Activity.gif" alt="" title="">CUSTOMER</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="66b7a717" parentId="228ae531" guid="_pJphwXF5EeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/Operational infrastructure_4838F228.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_pJphwXF5EeSNzfNcO5_Rug&amp;nodeId=66b7a717"><img src="./images/Activity.gif" alt="" title="">OPERATIONAL</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="7b35e21d" parentId="228ae531" guid="_ezFhIXF6EeSNzfNcO5_Rug" href="./../ARTIST Methodology M30/capabilitypatterns/Financial Management_E43F929C.jsp?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_lipZ8RvGEeSVgNVCd9uEdQ,_0Gq64XF3EeSNzfNcO5_Rug,_ezFhIXF6EeSNzfNcO5_Rug&amp;nodeId=7b35e21d"><img src="./images/Activity.gif" alt="" title="">FINANCIAL</a>
</li>
</ul>
</li>
</ul>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="1c68c7af" parentId="6e613398" guid="_2RlMIMi_EeS7wJTzzHxtQg" href="./../ARTIST Methodology M30/capabilitypatterns/Postmigration_9A152E77.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_2RlMIMi_EeS7wJTzzHxtQg&amp;nodeId=1c68c7af"><img src="./images/Phase.gif" alt="" title="">Postmigration</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1ac120ca" parentId="1c68c7af" guid="_4kEMIci_EeS7wJTzzHxtQg" href="./../ARTIST Methodology M30/capabilitypatterns/Verification of the behavioural equivalence with test cases_870208EB.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_2RlMIMi_EeS7wJTzzHxtQg,_4kEMIci_EeS7wJTzzHxtQg&amp;nodeId=1ac120ca"><img src="./images/Activity.gif" alt="" title="">VERBETC</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="78af196b" parentId="1c68c7af" guid="_GD21QcjEEeS7wJTzzHxtQg" href="./../ARTIST Methodology M30/capabilitypatterns/Verification of the behavioural equivalence with end user based _CDD40625.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_2RlMIMi_EeS7wJTzzHxtQg,_GD21QcjEEeS7wJTzzHxtQg&amp;nodeId=78af196b"><img src="./images/Activity.gif" alt="" title="">VERBEUBT</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="1f8a6965" parentId="1c68c7af" guid="_9sZYoclTEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Non-functional goals validation - code level_7176DDD3.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_2RlMIMi_EeS7wJTzzHxtQg,_9sZYoclTEeSF8-J5ZzwGkg&amp;nodeId=1f8a6965"><img src="./images/Activity.gif" alt="" title="">NFVALCL</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="64129075" parentId="1c68c7af" guid="_D_DpgclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Cloud Deployment Availability Auditing_4F56A0A.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_2RlMIMi_EeS7wJTzzHxtQg,_D_DpgclUEeSF8-J5ZzwGkg&amp;nodeId=64129075"><img src="./images/Activity.gif" alt="" title="">CLODEPAVAUD</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="14b2ddf7" parentId="1c68c7af" guid="_KfZxEclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Certificate the SaaS provider_44A7ACFE.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_2RlMIMi_EeS7wJTzzHxtQg,_KfZxEclUEeSF8-J5ZzwGkg&amp;nodeId=14b2ddf7"><img src="./images/Activity.gif" alt="" title="">CERT</a>
</li>
</ul>
</li>
<li>
<img src="images/plus.gif" class="collapsed" alt="" title="" showIcon="true"><a id="63cc3a69" parentId="6e613398" guid="_O2CaIclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Migration Artefacts Reuse Evolution_981B36E2.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg&amp;nodeId=63cc3a69"><img src="./images/Phase.gif" alt="" title="">Migration Artefacts Reuse &amp; Evolution</a>
<ul class="collapsed">
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="209c9bee" parentId="63cc3a69" guid="_RlEMMclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Submit artefacts_D68F981F.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg,_RlEMMclUEeSF8-J5ZzwGkg&amp;nodeId=209c9bee"><img src="./images/Activity.gif" alt="" title="">SUBMIT</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="6d6cccb3" parentId="63cc3a69" guid="_VLzpYMlUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Process for Evolution_B89216E7.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg,_VLzpYMlUEeSF8-J5ZzwGkg&amp;nodeId=6d6cccb3"><img src="./images/Activity.gif" alt="" title="">PROCESS</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="6e6abb73" parentId="63cc3a69" guid="_XUNgUclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Consume the output of the evolution support service_881712B.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg,_XUNgUclUEeSF8-J5ZzwGkg&amp;nodeId=6e6abb73"><img src="./images/Activity.gif" alt="" title="">CONSUME</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="78c67d36" parentId="63cc3a69" guid="_bZmBUclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Identify Reusable Artefacts_DBB05B82.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg,_bZmBUclUEeSF8-J5ZzwGkg&amp;nodeId=78c67d36"><img src="./images/Activity.gif" alt="" title="">REUSEID</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="2276f2db" parentId="63cc3a69" guid="_eThb0clUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Publish and Maintain Reusable Artefacts_E9B92423.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg,_eThb0clUEeSF8-J5ZzwGkg&amp;nodeId=2276f2db"><img src="./images/Activity.gif" alt="" title="">REUSEPUB</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="719fa225" parentId="63cc3a69" guid="_jLM8cclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Collect Data for Evolution Support_229883B4.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg,_jLM8cclUEeSF8-J5ZzwGkg&amp;nodeId=719fa225"><img src="./images/Activity.gif" alt="" title="">EVOCOLLECT</a>
</li>
<li>
<img src="images/noplus.gif" class="collapsed" alt="" title="" showIcon="false"><a id="c7f3c349" parentId="63cc3a69" guid="_ppt4AclUEeSF8-J5ZzwGkg" href="./../ARTIST Methodology M30/capabilitypatterns/Use collected Data for Evolution Support_6DB82E9.html?proc=_boyq0RvEEeSVgNVCd9uEdQ&amp;path=_boyq0RvEEeSVgNVCd9uEdQ,_O2CaIclUEeSF8-J5ZzwGkg,_ppt4AclUEeSF8-J5ZzwGkg&amp;nodeId=c7f3c349"><img src="./images/Activity.gif" alt="" title="">EVOUSE</a>
</li>
</ul>
</li>
</ul>
</li>
</ul>
</body>
</html>

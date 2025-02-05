package com.basic;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class cube extends TagSupport {

	
	private int nu;
	private String col;
	
	
	public  int getNu() {
		return nu;
	}


	public void setNu(int nu) {
		this.nu = nu;
	}


	public String getCol() {
		return col;
	}


	public void setCol(String col) {
		this.col = col;
	}

public int spit() {
	JspWriter out=pageContext.getOut();
	try {
		out.print("<font color="+col+">");
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return SKIP_BODY;
	
	
}
}

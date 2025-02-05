package com.basic;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


	public class chusta extends TagSupport {

		public chusta() {
			
		}
		
		public int doStartTag() {
			JspWriter out=pageContext.getOut();
			try {
				out.print("<h1>Test</h1>");
			} catch (Exception e) {
				// TODO: handle exception
			}
			return SKIP_BODY;
			
			
		}
}

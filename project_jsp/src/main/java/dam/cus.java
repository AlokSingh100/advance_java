package dam;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class cus extends TagSupport {

	public cus() {
		
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

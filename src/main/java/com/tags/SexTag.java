package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class SexTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException{
        JspWriter out = getJspContext().getOut();
        out.print("<div>");
        out.print("<input type='radio' name='sex' value='male'");
        out.print("<input type='radio' name='sex' value='female'");
        out.print("</div>");
    }
}

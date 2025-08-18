package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport
import java.io.IOException;

public class SubmitTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.print("<input type='submit' name='submit' value='OK'>");
        out.print("<input type='submit' name='submit' value='Cancel'>");
    }
}
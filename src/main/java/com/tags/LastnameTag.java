package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class LastnameTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException{
        JspWriter out = get.JspContext().getOut();
        out.print("<input type='text' name='lastname' placeholder='Lastname' required>");
    }
}

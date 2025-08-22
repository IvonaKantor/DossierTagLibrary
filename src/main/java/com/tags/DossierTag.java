package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.BodyContent;
import java.io.IOException;

public class DossierTag extends BodyTagSupport {
    @Override
    public int doAfterBody() throws JspException {
        try{
            BodyContent bc = getBodyContent();
            String body = bc.getString();
            JspWriter out = bc.getEnclosingWriter();

            out.print("<form method='POST'>" + body + "</form>");
        }catch(IOException e){
            throw new JspException(e)
        }
        return SKIP_BODY;
    }
}
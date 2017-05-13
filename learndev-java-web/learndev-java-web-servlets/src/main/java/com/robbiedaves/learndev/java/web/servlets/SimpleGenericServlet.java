package com.robbiedaves.learndev.java.web.servlets;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

    public class SimpleGenericServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
    
        resp.getWriter().write(
                "<html><body>This is from the SimpleGenericServlet</body></html>"
        );
        
        
    }
    
}

/**
 * 
 */
package com.javacambodia.myweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author pongs
 *
 */
public class SimpleServlet extends HttpServlet {

    /**  */
    private static final long serialVersionUID = 4188999729758679938L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.getWriter().println("Hello World!");
    }

    @Override
    public void destroy() {
	System.out.println("Servlet " + this.getServletName() + " has stopped");
    }

    @Override
    public void init() throws ServletException {
	System.out.println("Servlet " + this.getServletName() + " has started");
    }

    
}

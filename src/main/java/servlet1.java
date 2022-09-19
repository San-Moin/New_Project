

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet1
 */

public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    String n=request.getParameter("username");
	   
	    out.print("Welcome:"+n);
	    
	
	    
	    HttpSession session=request.getSession();
	    session.setAttribute("uname", n);
	    
	    
	    out.print("<a href='Servlet2'> Visit</a>");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /*    //Example with Cookies
	    
	//    Cookie ck=new Cookie("uname",n);//creating cookie object  
 	//    response.addCookie(ck);//adding cookie in the response   
	  
	    
	    
	    out.print("<form action='Servlet2' method='GET'>");  
	    
	  //  out.print("<input type='hidden' name='uname' value='"+n+"'>");      // Example of Hidden form field
	  
	    out.print("<input type='submit' value='go'>"); 
	   
	    out.print("</form>");  
	    
 	  */
	    
 	  //out.print("<a href='Servlet2?uname="+n+"'><br>visit</a>");           // Example of Url rewritting 
	  
 	  out.close();  
	}

}

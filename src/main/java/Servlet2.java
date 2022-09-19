

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    //Getting the value from the hidden field  
  //  String n=request.getParameter("uname");  
//    out.print("Hello "+n);  

    
    
    HttpSession session=request.getSession(false);
    String n=(String)session.getAttribute("uname");
    
    out.print("Hello" +n);
    
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 try{  
			  
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			      
			   Cookie ck[]=request.getCookies();  
			   out.print("Hello "+ck[0].getValue());  
			
			   		  
			    out.close();  
			  
			         }catch(Exception e){System.out.println(e);}  
			  
			    
			    } 
	}
	


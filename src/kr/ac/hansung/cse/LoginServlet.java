package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read form data
		//request : HttpServletRequest의 객체  / response : HttpServletResponse의 객체
		//객체가 만들어져서 주소가 들어온다 , 우리는 단순히 주소값만 바탕으로 객체를 사용해주면 된다
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Process : access to database, perform business logic ...
		
		
		// Build HTML code
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2> Your username is " + username + "<br/>";
		htmlResponse += "<h2> Your password is " + password + "<h2/>";
		htmlResponse += "</html>";
		// 동적인 웹페이지 : 왜? 사용자가 입력한 정보에 따라 항상 다른 페이지가 만들어진다.
		
		out.println(htmlResponse);
		
	
	}

}

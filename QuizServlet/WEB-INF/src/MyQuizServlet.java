import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyQuizServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException{
		
		String name = request.getParameter("name");
		String answer1 = request.getParameter("ans1");
		String answer2 = request.getParameter("ans2");
		String answer3 = request.getParameter("ans3");
		String answer4 = request.getParameter("ans4");
		String answer5 = request.getParameter("ans5");
		
		double vote = 0;
		if (answer1.equalsIgnoreCase("Squid Games"))
		{
			vote++;
		}
		
		if (answer2.equalsIgnoreCase("3"))
		{
			vote++;
		}

		if (answer3.equalsIgnoreCase("True"))
		{
			vote++;
		}

		if (answer4.equalsIgnoreCase("2013"))
		{
			vote++;
		}

		if (answer5.equalsIgnoreCase("Delta"))
		{
			vote++;
		}

		double right = (vote / 5) * 100;

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Congratulations "+name+"s you finished the quiz</body></html>");
		out.println("<html><body><p>Your quiz results are: " + right +"%</p></body></html>");
		out.println("<html><body><p>Q1. "+ answer1 +"</p></body></html>");
		out.println("<html><body><p>Q2. "+ answer2 +"</p></body></html>");
		out.println("<html><body><p>Q3. "+ answer3 +"</p></body></html>");
		out.println("<html><body><p>Q4. "+ answer4 +"</p></body></html>");
		out.println("<html><body><p>Q5. "+ answer5 +"</p></body></html>");

		
		
	}

}

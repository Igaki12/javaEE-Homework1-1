package servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Data;
import model.Judge;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException {
		File fGet = new File("/WEB-INF/jsp/form.jsp");
		String forwardPath = fGet.getPath();
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
	throws ServletException,IOException {
		String strPoint = request.getParameter("point");
		
		Data data = new Data(strPoint);
		request.setAttribute("data", data);
		Judge j = new Judge();
		String comment = j.Judge(strPoint);
		data.setComment(comment);
		
		File fPost = new File("WEB-INF/jsp/Confirm.jsp");
		String forwardPath2 = fPost.getPath();
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath2);
		dispatcher.forward(request, response);
		
	}
}
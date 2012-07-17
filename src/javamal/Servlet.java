package javamal;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.imageio.*;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String init = request.getParameter("init");
		String grammar = request.getParameter("grammar");
		int depth = Integer.parseInt(request.getParameter("depth"));
		double angle = Double.parseDouble(request.getParameter("angle"));
		Tree myTree = new Tree(init,grammar,depth,angle);
		response.setContentType("image/gif");
		ImageIO.write(myTree.getBufferedImage(),"GIF",response.getOutputStream());
		//response.getOutputStream().println(myTree.finalPath);
	}
}

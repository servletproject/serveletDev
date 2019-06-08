package todo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseServlet
 */
@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int cnt;
	private static ArrayList<String> list;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResponseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = (String) request.getAttribute("userName");

		//使用名のNULL、又は空の場合
		if (name == null || name.isEmpty()) {
			request.setAttribute("userName", "Guest");
		}

		// JSPに転送をする
		String viewJsp = "/WEB-INF/view/index.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewJsp);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		//文字コードの指定
		request.setCharacterEncoding("utf-8");

		// formから値を取得
		String name = request.getParameter("name");

		//　名前をセット
		request.setAttribute("userName", name);
		doGet(request, response);
	}
}

package dept.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dao.DeptDao;
import dept.dao.DeptDaoImpl;
import dept.dto.Dept;

@WebServlet("/dept/insert")
public class DeptInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DeptDao deptDao = new DeptDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/dept/insert -[GET]");
		
		req.getRequestDispatcher("/WEB-INF/views/dept/insert.jsp")
			.forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		
		String param =req.getParameter("deptno");
		int deptno = 0;
		if(param != null && !"".equals(param)) {
			deptno = Integer.parseInt(param);
		}
		String param2 = req.getParameter("dname");
		String param3 = req.getParameter("loc");

		Dept dept = new Dept();
		dept.setDeptno(deptno);
		dept.setDname(param2);
		dept.setLoc(param3);
		
		if(deptno != 0) {
			deptDao.join(dept);
		}

		
		resp.sendRedirect("/dept/list");
		
	
	}
	
	
}

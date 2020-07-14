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

@WebServlet("/dept/detail")
public class DeptDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DeptDao deptDao = new DeptDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String param =req.getParameter("deptno");
		int deptno = 0;
		if(param != null && !"".equals(param)) {
			deptno = Integer.parseInt(param);
		}
		
		Dept dept = new Dept();
		dept.setDeptno(deptno);
		
		Dept result = deptDao.selectInfo(dept);
		
		req.setAttribute("result", result);
		
		req.getRequestDispatcher("/WEB-INF/views/dept/detail.jsp")
		.forward(req, resp);
		
	}
}

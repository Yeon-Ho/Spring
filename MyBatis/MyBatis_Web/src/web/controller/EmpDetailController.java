package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dto.Emp;
import web.service.EmpService;
import web.service.EmpServiceImpl;

@WebServlet("/emp/detail")
public class EmpDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmpService empService = new EmpServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("emp/detail - [GET] ");
		
		Emp param = empService.getEmpnoParam(req);
		System.out.println(param);
		
		Emp view = empService.detail(param);
		req.setAttribute("view", view);
		
		req.getRequestDispatcher("/WEB-INF/views/emp/detail.jsp").forward(req, resp);
		
		
	}
	
}

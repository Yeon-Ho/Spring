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

@WebServlet("/emp/insert")
public class EmpInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmpService empService = new EmpServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("emp/insert - [GET]");
		
		req.getRequestDispatcher("/WEB-INF/views/emp/insert.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("emp/insert - [POST] ");
		
		//요청 파라미터 정보 얻기
		Emp emp = empService.getEmpParam(req);
		System.out.println(emp);
		
		empService.join(emp);
		
		//결과 화면 이동 - 목록 페이지로 이동
		resp.sendRedirect("/emp/list");
	}
	
}

package web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dao.DeptDao;
import web.dto.Dept;
import web.service.DeptService;

@Controller
public class DeptController {

	private Logger logger = LoggerFactory.getLogger(DeptController.class);
	
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private DeptDao deptDao;
	
	@RequestMapping(value="/dept/list" , method=RequestMethod.GET)
	public void deptlist( Model model ) {
//		System.out.println("/dept/list ");
		
		logger.info("/dept/list [GET]");
		
		//부서 정보 전체 조회
		List<Dept> list = deptService.getList();
		
		//모델값 전달
		model.addAttribute("list" , list);
//		req.setAttribute("list",list); 와 같은 기능
	}
	
	@RequestMapping(value="/dept/detail" , method=RequestMethod.GET)
	public void deptDetail(int deptno, Dept param, Model model) {
		
		logger.info("deptno : {}", deptno);
		logger.info("param : {}", param);
		
		Dept dept = deptService.getOne(deptno);
		
		model.addAttribute("dept", dept);
	}
	
	
	
	
}

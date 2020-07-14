package web.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Emp;

public interface EmpService {

	// 전체 조회
	public List<Emp> getList();

	//empno 전달파라미터 얻기
	public Emp getEmpnoParam(HttpServletRequest req);

	//사원정보 상세 조회
	public Emp detail(Emp param);
	
	//요청정보 얻기
	public Emp getEmpParam(HttpServletRequest req);

	//신규사원 추가
	public void join(Emp emp);




}

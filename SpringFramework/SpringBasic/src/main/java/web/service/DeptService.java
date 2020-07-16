package web.service;

import java.util.List;

import web.dto.Dept;


public interface DeptService {

	// 부서 정보 전체조회
	public List<Dept> getList();

	public Dept getOne(int deptno);
	
	
}

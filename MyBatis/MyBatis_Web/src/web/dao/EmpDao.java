package web.dao;

import java.util.List;

import web.dto.Emp;

public interface EmpDao {

	//전체 조회
	public List<Emp> selectAll();

	public Emp selectOne(Emp param);

	public void insert(Emp emp);


	
	
}

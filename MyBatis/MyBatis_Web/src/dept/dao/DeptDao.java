package dept.dao;

import java.util.List;

import dept.dto.Dept;

public interface DeptDao {

	//전체 조회
	public List<Dept> selectAll();

	//지정된 부서 정보 조회
	public Dept selectInfo(Dept dept);

	//신규 부서 추가
	public void join(Dept dept);

	
	

}

package dept.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dept.dto.Dept;
import mybatis.MyBatisConnectionFactory;

public class DeptDaoImpl implements DeptDao {

	//마이바티스 객체 생성
	private SqlSessionFactory factory = MyBatisConnectionFactory.getSqlSessionFactory();
	
	private String namespace = "dept.dao.DeptDao.";
	
	@Override
	public List<Dept> selectAll() {

		//마이바티스 수행 객체
		SqlSession sqlSession = factory.openSession();
		
		//DB조회 결과
		List<Dept> deptList = sqlSession.selectList(namespace+"selectAll");
		
		sqlSession.close();
		
		return deptList;
	}

	@Override
	public Dept selectInfo(Dept deptno) {
		//마이바티스 수행 객체
		SqlSession sqlSession = factory.openSession();
		
		Dept result = sqlSession.selectOne(namespace+"selectInfo",deptno);
		
		sqlSession.close();
		
		return result;
	}

	@Override
	public void join(Dept dept) {
		SqlSession sqlSession = factory.openSession(true);
		
		//SqlSession.insert 는 테이블의 영향받은 행 수를 반환한다
		//	update, delete 도 마찬가지
		int res = sqlSession.insert(namespace+"join",dept);
		
		if(res >0) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}
		
	}

}

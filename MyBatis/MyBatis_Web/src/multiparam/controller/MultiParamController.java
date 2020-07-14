package multiparam.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dynamic.dao.DynamicQueryDao;
import multiparam.dao.MultiParamDao;
import mybatis.MyBatisConnectionFactory;
import web.dto.Emp;

@WebServlet("/multi/param")
public class MultiParamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//마이바티스 연결 객체
	private SqlSessionFactory factory 
	= MyBatisConnectionFactory.getSqlSessionFactory();
	
	//마이바티스 수행 객체
	private SqlSession sqlSession;
	
	private MultiParamDao multiParamDao;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		sqlSession = factory.openSession(true);
		multiParamDao = sqlSession.getMapper(MultiParamDao.class);
	
		System.out.println("/multi/param - [GET] ");
		//--------------------------------------------------------
		//DTO를 이용한 파라미터 전달(1)
//		Emp emp = new Emp();
//		emp.setEmpno(5013);
//		emp.setEname("qtnba");
//		emp.setJob("SALESEMAN");
//		
//		multiParamDao.insert(emp);
		//--------------------------------------------------------
		
		//여러 개의 파라미터 전달(2)
//		multiParamDao.insert2(5641 , "DAAWQ" , null);
		
		//--------------------------------------------------------
		
		//HashMap을 이용해 파라미터 전달하는 방법
		HashMap<String, Object> map = new HashMap<>();
		map.put("empno", 1532 );
		map.put("ename", "woern" );
		map.put("job", "anwoen" );
		
		multiParamDao.insert3(map);
		
		
		
		
		
	}
}

package web.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.MyBatisConnectionFactory;
import web.dao.EmpDao;
import web.dto.Emp;

public class EmpServiceImpl implements EmpService{

	//마이바티스 연결 객체
	private SqlSessionFactory factory 
	= MyBatisConnectionFactory.getSqlSessionFactory();
	
	//DAO 객체 
	private EmpDao empDao;
	
	@Override
	public List<Emp> getList() {
		
		//마이바티스 수행 객체
		SqlSession sqlSession = factory.openSession();
		
		//매퍼를 이용한 DAO 연결
		empDao = sqlSession.getMapper(EmpDao.class);
		
		//전체리스트 조회
		List<Emp> list = empDao.selectAll();
		
//		sqlSession.commit();
//		sqlSession.rollback();
		
//		sqlSession.close();
		
		return list;
	}

	
	@Override
	public Emp getEmpnoParam(HttpServletRequest req) {
		
		String param = req.getParameter("empno");
		
		int empno = 0;
		if( param!=null && !"".equals(param)) {
		 empno = Integer.parseInt(param) ;
		}
		
		Emp res = new Emp();
		res.setEmpno(empno);
		
		return res;
	}
	
	
	@Override
	public Emp detail(Emp param) {
		//마이바티스 수행 객체
		SqlSession sqlSession = factory.openSession();
		
		//매퍼를 이용한 DAO 연결
		empDao = sqlSession.getMapper(EmpDao.class);
		
		Emp emp = empDao.selectOne(param);
		
		return emp;
	}
	

	@Override
	public Emp getEmpParam(HttpServletRequest req) {
		//마이바티스 수행 객체
		SqlSession sqlSession = factory.openSession();
		
		//매퍼를 이용한 DAO 연결
		empDao = sqlSession.getMapper(EmpDao.class);
		
		//빈 Emp 객체 생성
		Emp emp = new Emp();

		//empno  - NUMBER(4,0)
		String param = req.getParameter("empno");
		if(param!=null && !"".equals(param)) {
			emp.setEmpno(Integer.parseInt(param) );
		}

		//emame - VARCHAR2(10)
		emp.setEname(req.getParameter("ename"));
		
		//JOB - VARCHAR2(9)
		emp.setJob(req.getParameter("job"));
		
		//mgr  - NUMBER(4,0)
		param = req.getParameter("mgr");
		if(param!=null && !"".equals(param)) {
			emp.setMgr(Integer.parseInt(param) );
		}
		
		//hiredate - DATE 
		param = req.getParameter("hiredate");
		if(param!=null && !"".equals(param)) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			try {
				emp.setHiredate(format.parse(param) );
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		//sal - NUMBER(7,2)
		param = req.getParameter("sal");
		if(param!=null && !"".equals(param)) {
			emp.setSal(Double.parseDouble(param) );
		}
		
		//comm - NUMBER(7,2)
		param = req.getParameter("comm");
		if(param!=null && !"".equals(param)) {
			emp.setComm(Double.parseDouble(param) );
		}
		
		//deptno - NUMBER(2,0)
		param = req.getParameter("deptno");
		if(param!=null && !"".equals(param)) {
			emp.setDeptno(Integer.parseInt(param) );
		}
		
		return emp;
	}

	@Override
	public void join(Emp emp) {
		empDao.insert(emp);
	}




}

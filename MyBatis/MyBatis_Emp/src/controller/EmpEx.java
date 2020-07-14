package controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dao.EmpDao;
import dto.Emp;
import mybatis.MyBatisConnectionFactory;

public class EmpEx {
	public static void main(String[] args) {

		SqlSession sqlSession;
		
		SqlSessionFactory factory = MyBatisConnectionFactory.getSessionFactory();
		
		sqlSession = factory.openSession(true);
		
		EmpDao empDao = sqlSession.getMapper(EmpDao.class);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("- - - 전체 조회 - - -");
//		List<Emp> list = empDao.selectAll();
//		for(Emp emp : list) {
//			System.out.println(emp);
//		}
		//---------------------------------------------------------
		
//		System.out.println("- - - 사원 추가 - - -");
//		Emp emp = new Emp();
//		System.out.println("사원 번호 : ");
//		emp.setEmpno(sc.nextInt());
//		sc.nextLine();
//		
//		System.out.println("사원 이름 : ");
//		emp.setEname(sc.nextLine());
//		
//		System.out.println("사원 직업 : ");
//		emp.setJob(sc.nextLine());
//		
//		System.out.println("담당자 : ");
//		emp.setMgr(sc.nextInt());
//		sc.nextLine();
//		
//		System.out.println("입사 날짜 : ");
//		String day = sc.nextLine();
//		java.util.Date d;
//		try {
//			d = new java.text.SimpleDateFormat("yyyyMMdd").parse(day);
//			emp.setHiredate(d);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("급여 : ");
//		emp.setSal(sc.nextDouble());
//		sc.nextLine();
//		
//		System.out.println("상여금 : ");
//		emp.setComm(sc.nextDouble());
//		
//		System.out.println("부서번호 : ");
//		emp.setDeptno(sc.nextInt());
//		empDao.insertEmp(emp);
		//---------------------------------------------------------
		
//		System.out.println("---- 사원정보 출력- - - -");
//		System.out.println("조회할 사원번호 : ");
//		Emp selectEmp = new Emp();
//		selectEmp.setEmpno(sc.nextInt());
//		selectEmp = empDao.selectByEmpNo(selectEmp);
//		System.out.println(selectEmp);
		//---------------------------------------------------------
		
//		System.out.println("- - - 사원정보 삭제 - - -");
//		System.out.println("삭제할 사원번호 : ");
//		Emp deleteEmp = new Emp();
//		deleteEmp.setEmpno(sc.nextInt());
//		empDao.deleteByEmpNo(deleteEmp);
		//---------------------------------------------------------
		
		
	}
}

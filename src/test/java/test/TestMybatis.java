package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hl.mybatis.dao.Userdao;
import com.hl.mybatis.dto.Depart;
import com.hl.mybatis.dto.Emp;
import com.hl.mybatis.dto.User;
import com.hl.mybatis.dto.User2;


public class TestMybatis {
	
	ClassPathXmlApplicationContext context = null;
	
	@Before
	public void init(){
		String fileName = "applicationcontext.xml";
		context = new ClassPathXmlApplicationContext(fileName);
	}
	
	@After
	public void destory(){
		context.close();
	}
	
	// basic CRUD
	@Test
	public void testFindAll(){
		Userdao userdao = context.getBean(Userdao.class);
		List<User> users = userdao.findAll();
		System.out.println(users);
	}
	
	@Test
	public void testFindById(){
		Userdao userdao = context.getBean(Userdao.class);
		User user = userdao.findById("1");
		System.out.println(user);
	}
	
	@Test
	public void testUpdateById(){
		Userdao userdao = context.getBean(Userdao.class);
		User user = new User();
		user.setAge(100);
		user.setUserid("1");
		Integer count = userdao.updateById(user);
		System.out.println(count);
	}
	
	@Test
	public void testAdd(){
		Userdao userdao = context.getBean(Userdao.class);
		User user = new User();
		user.setAge(200);
		user.setUserid("4");
		user.setUsername("sarah");
		userdao.add(user);
	}
	
	@Test
	public void testDeleteById(){
		Userdao userdao = context.getBean(Userdao.class);
		int count = userdao.deleteById("1");
		System.out.println(count);
	}
	
	
	// mybatis dynamic sql
	@Test
	public void testFindById2(){
		Userdao userdao = context.getBean(Userdao.class);
		User user = new User();	
		// meet condition or not 
//		user.setUserid("3");
		List<User> list = userdao.findById2(user);
		System.out.println(list);
	}
	
	@Test
	public void testUpdateById2(){
		Userdao userdao = context.getBean(Userdao.class);
		User user = new User();	
		// meet condition or not 
		user.setUserid("2");
		user.setAge(200);
		int list = userdao.updateById2(user);
		System.out.println(list);
	}
	
	@Test
	public void testDeleteById2(){
		Userdao userdao = context.getBean(Userdao.class);
		User user = new User();	
		// meet condition or not 
		user.setUserid("2");
		user.setAge(200);
		int list = userdao.deleteById2(user);
		System.out.println(list);
	}
	
	@Test
	public void testFindAll2(){
		Userdao userdao = context.getBean(Userdao.class);
		User user = new User();	
		List<String> usersid = new ArrayList<String>();
		usersid.add("1");
		usersid.add("2");
		user.setUsersid(usersid);
		List<User> list = userdao.findAll2(user);
		System.out.println(list);
	}
	
	
	// test resultmap
	@Test
	public void testFindAll3(){
		Userdao userdao = context.getBean(Userdao.class);
		List<User2> findAll3 = userdao.findAll3();
		System.out.println(findAll3);
	}
	
	
	// test primary key mapping of database supported auto increment.
	@Test
	public void testAddEmp(){
		Userdao userdao = context.getBean(Userdao.class);
		Emp emp = new Emp();
//		emp.setAge(30);
//		emp.setDepart("001");
//		emp.setName("mattew");
//		emp.setAge(25);
//		emp.setDepart("002");
//		emp.setName("phoenix");
		emp.setAge(29);
		emp.setDepart("001");
		emp.setName("ram");
		emp.setHiredate(new Date());
		
		userdao.addEmp(emp);
	}
	
	
	// retrieve emp information and employee's department information
	// test association mapping, nested query, one to one
	@Test
	public void testFindEmpById(){
		Userdao userdao = context.getBean(Userdao.class);
		Emp emp = userdao.findEmpById(2);
		System.out.println(emp);
	}
	
	// test association mapping, nested result, one to one
	@Test
	public void testFindEmpById2(){
		Userdao userdao = context.getBean(Userdao.class);
		Emp emp = userdao.findEmpById2(2);
		System.out.println(emp);
	}
	
	
	// retrieve department information and retrieve department all employees information
	// test collection mapping, nested result, one to many
	@Test
	public void testFindDepartById2(){
		Userdao userdao = context.getBean(Userdao.class);
		Depart depart = userdao.findDepartById2("001");
		System.out.println(depart);
	}
	
	// test collection mapping, nested query, one to many
	@Test
	public void testFindDepartById4(){
		Userdao userdao = context.getBean(Userdao.class);
		Depart depart = userdao.findDepartById4("001");
		System.out.println(depart);
	}
	
	
	// Note: one to one and many to one very similar
	// retrieve employee information and employee's department information by depart in demo2.test_emp
	// test association mapping, nested result, many to one
	@Test
	public void testRetrieveEmpAndDepartInfo(){
		Userdao userdao = context.getBean(Userdao.class);
		List<Emp> emps = userdao.retrieveEmpAndDepartInfo("001");
		System.out.println(emps);
	}
}

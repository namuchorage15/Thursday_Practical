package com.studentjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAO myBean=(StudentDAO) beanFactory.getBean("edao");
		
		//insert data
		System.out.println("inserted"+myBean.saveStudent(new Student(101,"Namrata","female")));
		System.out.println("inserted"+myBean.saveStudent(new Student(102,"Ketki","female")));
		  
		
		//update data
		//System.out.println("updated"+myBean.saveEmployee(new Employee(101,"minal","1000")));
		
		//delete data
		/*Employee e=new Employee();
		e.setId(101);
		System.out.println("Sucessfully deleted"+myBean.DeleteEmployee(e));
		*/
		
		List<Student> s1=myBean.viewStudent();
		System.out.println("ID \t\t\t "+"name \t\t\t"+"gender \t\t\t");	
		System.out.println("---------------------------------------------------------------------------------");
		for(Student stu:s1)
		{
			System.out.println(stu.getId()+"\t\t\t"+stu.getName()+"\t\t\t"+stu.getGender());
		}
		
	
		

	}

}


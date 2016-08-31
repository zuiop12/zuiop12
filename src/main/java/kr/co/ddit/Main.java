package kr.co.ddit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("kr/co/ddit/bean.xml");
		DaoImpl dao=(DaoImpl) app.getBean("Dao");
		
		for (int i = 0; i < dao.allList().size();  i++) {
			
			System.out.println(dao.allList().get(i));	
		}
		
	
		System.out.println(dao.insert());
		
	}
}

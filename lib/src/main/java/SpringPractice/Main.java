package SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hoge hoge = context.getBean("hoge", Hoge.class);
		hoge.hoge();
		
		Fuga fuga = context.getBean("fuga", Fuga.class);
		fuga.getHoge().hoge();
		
		// beansの方に<scope=prototype>を入れることでSingletonではなくなるためfalse
		// Singletonの場合は下記の結果がtrueになる
		System.out.println(hoge == fuga.getHoge());
	}
		
}

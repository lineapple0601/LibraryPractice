package ComponentScanPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ComponentScanPractice.component.FugaCs;
import ComponentScanPractice.component.HogeCs;
import ComponentScanPractice.component.IHogeCs;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IHogeCs hogeCs = context.getBean(HogeCs.class);
		hogeCs.hoge();
		
		FugaCs fugaCs = context.getBean(FugaCs.class);
		fugaCs.getHogeCs().hoge();
	}
}

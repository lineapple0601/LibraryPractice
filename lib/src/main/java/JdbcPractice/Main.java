package JdbcPractice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// ①コンテキスト取得
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // ②インスタンスの取得
        SampleDao dao = context.getBean(SampleDao.class);
        
        // ③DAOメソッド実行
        List<String> names = dao.select();
        
        // ④検索結果を出力
        for (String name : names) {
        	System.out.println(name);
        }
	}
}

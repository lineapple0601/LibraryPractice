package ComponentScanPractice.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("HogeCs")
public class HogeCs implements IHogeCs {
	
	@Override
	public void hoge() {
		logger.info("hoge called");
	}
}

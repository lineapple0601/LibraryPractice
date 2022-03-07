package ComponentScanPractice.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MockHogeCs")
public class MockHogeCs implements IHogeCs {

	@Override
	public void hoge() {
		logger.info("hoge called from MockHogeCs");
	}

}

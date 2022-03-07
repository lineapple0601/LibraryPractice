package ComponentScanPractice.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FugaCs {
	
	private IHogeCs hogeCs;
	
	@Autowired
	public FugaCs(@Qualifier("MockHogeCs") IHogeCs hogeCs) {
		this.hogeCs = hogeCs;
	}
	
	public IHogeCs getHogeCs() {
		return hogeCs;
	}
}

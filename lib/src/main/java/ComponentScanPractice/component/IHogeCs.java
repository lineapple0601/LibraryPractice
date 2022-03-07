package ComponentScanPractice.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import SpringPractice.Hoge;

public interface IHogeCs {

	static final Logger logger = LoggerFactory.getLogger(Hoge.class);
	void hoge();

}
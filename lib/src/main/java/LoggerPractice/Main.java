package LoggerPractice;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import ch.qos.logback.classic.Level;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		// XMLのPropertyを上書きしない！？
		System.setProperty("LOGGER_NAME", "not loggerback");

        ch.qos.logback.classic.Logger log = (ch.qos.logback.classic.Logger)logger;
        log.setLevel(Level.TRACE); // ★デフォルトだと trace レベルは出力されないので、出力のレベルを TRACE にしている

        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        
        logger.info("{}",    "HOGE");
        logger.info("{} {}", "HOGE", "FUGA");
        logger.info("{} {}", "HOGE");
        logger.info("{}",    "HOGE", "FUGA");
        logger.info("\\{}",  "HOGE");
        logger.info("{ }",   "HOGE");
        
        try {
        	throw new Exception("Hoge");
        } catch (Exception e) {
        	// 上の方が分かりやすい
        	logger.error("error", e);
        	logger.error(e.getMessage());
        }
	}

}

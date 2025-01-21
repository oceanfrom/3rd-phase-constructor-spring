package com.example.sm;

import com.example.sm.SpringRipperV1.Quoter;
import com.example.sm.SpringRipperV1.TerminatorQuoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication(scanBasePackages = "com.example.sm.SpringRipperV1")
public class SmApplication implements CommandLineRunner {
	private final ApplicationContext context;

	public SmApplication(ApplicationContext applicationContext) {
		this.context = applicationContext;
	}

	public static void main(String[] args) {
		SpringApplication.run(SmApplication.class, args);
	}

	@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		return new HiddenHttpMethodFilter();
	}


	@Override
	public void run(String... args) throws Exception {
	//	Quoter terminatorQuoter = context.getBean(Quoter.class);
	//	 terminatorQuoter.sayQuote();
//		while(true) {
//			Thread.sleep(100);
//			Quoter terminatorQuoter = context.getBean(Quoter.class);
//			terminatorQuoter.sayQuote();
//		}
	}
}
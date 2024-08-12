package com.email;

import com.email.model.PropertyConfigModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableScheduling
@PropertySources({
		@PropertySource(value = {"classpath:student.properties"}),
		@PropertySource(value = {"classpath:studentMap.properties"})
})
public class EmailApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(EmailApplication.class, args);
		PropertyConfigModel bean = run.getBean(PropertyConfigModel.class);
		System.out.println(bean);
	}


	@Bean
	public ThreadPoolTaskExecutor scheduler(){
		ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
		poolTaskExecutor.setMaxPoolSize(5);
		poolTaskExecutor.setThreadNamePrefix("ScheduledTask:-");
		return poolTaskExecutor;
	}

}

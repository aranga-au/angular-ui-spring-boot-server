package com.acnonline.zuul;

import com.acnonline.zuul.events.AppStartEventImpl;
import com.netflix.appinfo.LeaseInfo;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class UiAppApplication {

	public static void main(String[] args) {

		final SpringApplication app = new SpringApplication(UiAppApplication.class);
		app.addListeners(new AppStartEventImpl()); //no auto wiring available at this point
		app.setWebEnvironment(true);
		app.run(args);
	}




}

package com.gd.dataissyytv3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.gd.dataissyytv3.mapper")
@EnableScheduling
public class DataIssyytv3Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication application = new SpringApplication(DataIssyytv3Application.class );
        application.setApplicationContextClass( AnnotationConfigApplicationContext.class );
        application.run( args );

//        String path = System.getProperty("classpath:logback-spring.xml");
//        PropertyConfigurator.configure(path);

        CountDownLatch latch = new CountDownLatch( 1 );
        latch.await();
    }

}

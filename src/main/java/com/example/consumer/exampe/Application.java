package com.example.consumer.exampe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(Application.class, args);
//    Consumer<SQSEvent> consumer = context.getBean("myConsumer", Consumer.class);
//
//    SQSEvent event = new SQSEvent();
//
//    SQSEvent.SQSMessage sQSMessage = new SQSEvent.SQSMessage();
//
//    sQSMessage.setBody("This is my message");
//
//    event.setRecords(Arrays.asList(sQSMessage));
//
//    consumer.accept(event);
  }
}

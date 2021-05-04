package com.example.consumer.exampe;

import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author hjd
 */
@Slf4j
@Component
public class MyConsumer implements Consumer<SQSEvent>{

  @Override
  public void accept(SQSEvent sQSEvent) {
    log.info("************This is working*******************");
    log.info(sQSEvent.toString());
    log.info("**********************************************");
  }
}

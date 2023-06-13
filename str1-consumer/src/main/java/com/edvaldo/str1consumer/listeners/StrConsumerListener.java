package com.edvaldo.str1consumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.sound.midi.Receiver;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(groupId = "group-1", topics = "str-topics", containerFactory = "strContainerFactory")
    public void create(String message) {
        log.info("CREATE ::: Receiver message {}", message);
    }

    @KafkaListener(groupId = "group-1", topics = "str-topics", containerFactory = "strContainerFactory")
    public void log(String message) {
        log.info("LOG ::: Receiver message {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topics", containerFactory = "strContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Receiver message {}", message);
    }
}

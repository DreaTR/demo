package com.andrea.demo;

import com.andrea.demo.kafka.KafkaConsumer;
import com.andrea.demo.kafka.KafkaProducer;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.kafka.core.KafkaTemplate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class KafkaServerTest {

    @Test
    public void testKafkaProducerAndConsumer() {
        // Skapa en mock för KafkaTemplate
        KafkaTemplate<String, String> kafkaTemplate = mock(KafkaTemplate.class);

        // Skapa en instans av Kafka-producent och sätt KafkaTemplate
        KafkaProducer kafkaProducer = new KafkaProducer(kafkaTemplate);

        // Skicka ett testmeddelande med producent
        String testMessage = "Test message till topic demoguides";
        kafkaProducer.sendMessage(testMessage);

        // Skapa en mock för Kafka-konsument
        KafkaConsumer kafkaConsumer = mock(KafkaConsumer.class);

        // Simulera konsumentens lyssnarfunktion för att hämta meddelandet
        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        doNothing().when(kafkaConsumer).consume(messageCaptor.capture());

        // Kör konsumeringen
        kafkaConsumer.consume(testMessage);

        // Jämför det skickade meddelandet med det mottagna meddelandet
        assertEquals(testMessage, messageCaptor.getValue());

        // Verifiera att KafkaTemplate skickades meddelandet
        verify(kafkaTemplate, times(1)).send(eq("demoguides"), eq(testMessage));
    }


}

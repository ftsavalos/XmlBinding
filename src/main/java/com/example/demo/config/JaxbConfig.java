package com.example.demo.config;

import com.example.demo.models.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@Configuration
public class JaxbConfig {


    @Bean
    public Unmarshaller createUnmarshaller() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Data.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return unmarshaller;
    }

}
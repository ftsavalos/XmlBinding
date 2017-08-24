package com.example.demo;

import com.example.demo.models.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
    private final Unmarshaller unmarshaller;

    @Value("${xml.path}")
    private String xmlPath;

    @Autowired
    public DemoApplication(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    @Override
    public void run(String... strings) throws Exception {
        File file = new File(xmlPath);
        Data data = (Data) unmarshaller.unmarshal(file);
        LOGGER.info("XML: {}", data);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
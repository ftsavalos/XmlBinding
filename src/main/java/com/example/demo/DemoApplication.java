package com.example.demo;

import com.example.demo.models.Data;
import com.example.demo.models.VariableType;
import com.example.demo.models.YearType;
import com.sun.org.apache.xerces.internal.xni.parser.XMLDocumentFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.example.demo.util.Performance.printTime;

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
    public void run(String... strings) throws JAXBException {
        Data data = this.parseWithJaxb();
        List<VariableType> variables = data.getVariables().getVariable();
        List<YearType> yearList = new ArrayList<>();
        printTime(() -> variables.forEach(a -> a.getYears().getYear().forEach(b -> yearList.add(b))));
        LOGGER.info("yearList size: {}", yearList.size());
        printTime(() -> this.parseWithDocumentParser());
    }

    private void parseWithDocumentParser() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(xmlPath);
        } catch (Exception e) {
            e.printStackTrace();
        }

        NodeList list = doc.getElementsByTagName("data");
        LOGGER.info("{}", list.getLength());
    }

    private Data parseWithJaxb(){
        File file = new File(xmlPath);
        Data data = null;
        try {
            data = (Data) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
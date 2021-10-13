package org.iesfm.ioc;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstitutoConfiguration {

    @Bean
    public InstitutoPrograma institutoPrograma(InstitutoFileScanner institutoFileScanner, InstitutoReader institutoReader, InstitutoWriter institutoWriter) {
        return new InstitutoPrograma(institutoFileScanner, institutoReader, institutoWriter);
    }

    @Bean
    public InstitutoWriter institutoWriter() {
        return new InstitutoWriter();
    }

    @Bean
    public InstitutoFileScanner fileScanner() {
        return new InstitutoFileScanner();
    }

    @Bean
    public InstitutoReader institutoReader(ObjectMapper objectMapper) {
        return new InstitutoReader(objectMapper);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}

package eu.ensup.springannotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eu.ensup.springannotations.dao.EleveDao;
import eu.ensup.springannotations.service.EleveService;


@Configuration
public class ConfigurationBeans {

	@Bean
	public EleveService eleveservice() {
        return new EleveService(elevedao());
    }

	@Bean
	public EleveDao elevedao() {
        return new EleveDao();
    }
}

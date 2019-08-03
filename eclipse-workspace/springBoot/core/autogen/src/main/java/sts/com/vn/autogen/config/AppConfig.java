package sts.com.vn.autogen.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;



@Configuration
@EnableConfigurationProperties(AppConfigProperties.class)
public class AppConfig {
	
	@Autowired
    private Environment env;
	
	

}

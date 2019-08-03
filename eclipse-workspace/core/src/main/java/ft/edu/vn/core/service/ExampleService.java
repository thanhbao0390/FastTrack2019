package ft.edu.vn.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ft.edu.vn.core.config.CoreProperties;

@Service
public class ExampleService {

	public final CoreProperties properties;
	
	@Autowired
	public ExampleService(CoreProperties properties) {
	    this.properties = properties;
	}
}

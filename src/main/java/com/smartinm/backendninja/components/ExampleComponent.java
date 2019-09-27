package com.smartinm.backendninja.components;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class ExampleComponent {
	private static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	public void sayHello() {
		LOG.info("Hello desde el Component");
	}

}

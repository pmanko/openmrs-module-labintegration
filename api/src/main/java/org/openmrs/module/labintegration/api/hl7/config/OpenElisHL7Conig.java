package org.openmrs.module.labintegration.api.hl7.config;

import org.openmrs.module.labintegration.api.LabModuleProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OpenElisHL7Conig implements HL7Config {
	
	private static final String RECEIVING_APPLICATION = "labintegration.openElis.receivingApplication";
	
	@Autowired
	private LabModuleProperties properties;
	
	@Override
	public String getReceivingApplication() {
		return properties.getRequiredProperty(RECEIVING_APPLICATION);
	}
}
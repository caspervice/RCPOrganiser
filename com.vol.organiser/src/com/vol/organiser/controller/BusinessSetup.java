package com.vol.organiser.controller;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import com.vol.organiser.managers.IBusinessManager;

public class BusinessSetup {

	private final String NamespaceID = "com.vol.organiser";
	private final String BusinessManagerExtensionName = "BusinessManagerEP";
	
	// Temporary class. In future refine. Initializes plugin classes etc.
	public BusinessSetup() {
	}

	public void setup() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(NamespaceID,
						BusinessManagerExtensionName);
		try {
			IBusinessManager businessManager = (IBusinessManager) elements[0].createExecutableExtension("class");
			businessManager.setupBusinesses();
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

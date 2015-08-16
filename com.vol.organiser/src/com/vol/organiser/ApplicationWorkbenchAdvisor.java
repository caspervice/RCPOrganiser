package com.vol.organiser;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.vol.organiser.controller.BusinessSetup;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "com.vol.organiser.perspective"; //$NON-NLS-1$
	
	BusinessSetup businessSetup;
	
	public ApplicationWorkbenchAdvisor()
	{
		super();
		businessSetup = new BusinessSetup();
		businessSetup.setup();
		
	}

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}

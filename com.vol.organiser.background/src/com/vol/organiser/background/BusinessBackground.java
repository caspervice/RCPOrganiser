package com.vol.organiser.background;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;

import com.vol.organiser.business.BaseOrganiserBusiness;
import com.vol.organiser.business.IOrganiserBusiness;

public class BusinessBackground extends BaseOrganiserBusiness implements
		IOrganiserBusiness {

	public BusinessBackground() {
		Display display = PlatformUI.createDisplay();
	    //   display.getActiveShell().
	}

}

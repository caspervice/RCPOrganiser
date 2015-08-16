package com.vol.organiser.business;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

	private static BundleContext context;
	
	// The plug-in ID
	public static final String PLUGIN_ID = "com.vol.organiser.business"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	public Activator()
	{
		super();
		System.out.println("CREATED "+PLUGIN_ID);
	}

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
	
	public static Activator getDefault() {
		return plugin;
	}

}

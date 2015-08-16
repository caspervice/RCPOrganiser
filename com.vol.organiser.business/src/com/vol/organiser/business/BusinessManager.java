package com.vol.organiser.business;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

import com.vol.organiser.managers.IBusinessManager;

public class BusinessManager implements IBusinessManager{
	
	private List<IOrganiserBusiness> businesses = new ArrayList<IOrganiserBusiness>(); 
	
	private final String extensionPointID = "BusinessEP";
	public final String extensionName = "BusinessExtensionPoint";
	public final String extensionNameSpace = "com.vol.organiser.business";
	
	public BusinessManager()
	{

	}
	
	public void setupBusinesses()
	{

		IExtension[] extensions = Platform.getExtensionRegistry().getExtensions(extensionNameSpace);
		for (IExtension extension : extensions)
		{
			System.out.println(extension.getSimpleIdentifier());
		}
		IConfigurationElement[] elementOne = extensions[0].getConfigurationElements();
		for (IConfigurationElement e : elementOne)
		{
			System.out.println(e.getName());
			try {
				IOrganiserBusiness business = (IOrganiserBusiness) e.createExecutableExtension("class");
				business.setup();
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

	public void addBusiness(IOrganiserBusiness organiserBusiness)
	{
		this.businesses.add(organiserBusiness);
	}
	
	public void removeBusiness(IOrganiserBusiness organiserBusiness)
	{
		this.businesses.remove(organiserBusiness);
	}
	
	public void printBusinesses()
	{
		for (IOrganiserBusiness business : this.businesses)
		{
			System.out.println(business);
		}
	}

	@Override
	public void loadBusinesses() {
		System.out.println("Loading Businesses...");
		
	}

	@Override
	public void exitBusinesses() {
		System.out.println("Exiting Businesses...");
		
	}
}
package mithun.learn.samples.services;

import mithun.learn.samples.Dao.AppDAO;
import mithun.learn.samples.Dao.AppDAOImpl;

public class AppImpl implements App {

	AppDAO appDAOImpl;
	@Override
	public String getLocations() {
		// TODO Auto-generated method stub
		System.out.println("In the getLocation method of the AppImpl");
		System.out.print("THe number of locations present is "+appDAOImpl.list());
		int sizeOfLocationsTable=appDAOImpl.list().size();
		return ""+sizeOfLocationsTable;
	}
	public void setAppDAOImpl(AppDAO appDAO) {
		this.appDAOImpl = appDAO;
	}

}

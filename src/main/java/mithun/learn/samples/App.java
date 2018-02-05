package mithun.learn.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import mithun.learn.samples.MessageBeans;
import mithun.learn.samples.Dao.AppDao;

@Component
public class App 
{
	

//    public void setAppDao(AppDao appDao) {
//		this.appDao = appDao;
//	}


	public  boolean printMessage(Integer message) {
    	//MessageBeans  messageBeans = new MessageBeans();
    	//messageBeans.setMessage(message);
    	//messageBeans.setMessage("hi");
 //   	System.out.println(appDao.findById(message));
    	
    	return true;//appDao.existsById(message);
    }

   
	

}

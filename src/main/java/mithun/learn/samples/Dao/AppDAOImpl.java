package mithun.learn.samples.Dao;

import java.util.List;

import javax.persistence.UniqueConstraint;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import mithun.learn.samples.Locations;

public class AppDAOImpl implements AppDAO {
	private SessionFactory sessionFactory;
	
	public AppDAOImpl(SessionFactory factory) {
		this.sessionFactory = factory;
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	@Override
	@Transactional
	
	public List<Locations> list() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		
		List<Locations> listLocations = (List<Locations>) sessionFactory.getCurrentSession()
		.createCriteria(Locations.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		Session session = this.sessionFactory.getCurrentSession();
		List<Locations> listOfLocations = session.createQuery("from Locations").list();
		
				return listOfLocations;
	}

}

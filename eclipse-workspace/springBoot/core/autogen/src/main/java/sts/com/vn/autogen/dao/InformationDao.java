package sts.com.vn.autogen.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class InformationDao {

	@Autowired
	private EntityManager em;

	private Session session = em.unwrap(Session.class);
	private SessionFactory sessionFactory = em.getEntityManagerFactory().unwrap(SessionFactory.class);

	public void getTables() {

	}

}

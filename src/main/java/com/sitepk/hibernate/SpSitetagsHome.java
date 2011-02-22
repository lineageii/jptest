package com.sitepk.hibernate;

// Generated 2010-12-23 3:02:46 by Hibernate Tools 3.3.0.GA

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpSitetags.
 * @see com.sitepk.hibernate.SpSitetags
 * @author Hibernate Tools
 */
public class SpSitetagsHome {

	private static final Log log = LogFactory.getLog(SpSitetagsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpSitetags transientInstance) {
		log.debug("persisting SpSitetags instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpSitetags persistentInstance) {
		log.debug("removing SpSitetags instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpSitetags merge(SpSitetags detachedInstance) {
		log.debug("merging SpSitetags instance");
		try {
			SpSitetags result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpSitetags findById(SpSitetagsId id) {
		log.debug("getting SpSitetags instance with id: " + id);
		try {
			SpSitetags instance = entityManager.find(SpSitetags.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

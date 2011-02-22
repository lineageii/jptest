package com.sitepk.hibernate;

// Generated 2010-12-23 3:02:46 by Hibernate Tools 3.3.0.GA

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SpTags.
 * @see com.sitepk.hibernate.SpTags
 * @author Hibernate Tools
 */
public class SpTagsHome {

	private static final Log log = LogFactory.getLog(SpTagsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SpTags transientInstance) {
		log.debug("persisting SpTags instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SpTags persistentInstance) {
		log.debug("removing SpTags instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SpTags merge(SpTags detachedInstance) {
		log.debug("merging SpTags instance");
		try {
			SpTags result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpTags findById(String id) {
		log.debug("getting SpTags instance with id: " + id);
		try {
			SpTags instance = entityManager.find(SpTags.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

package com.jdc.home.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.jdc.home.utils.search.Joinable;
import com.jdc.home.utils.search.PageEnable;
import com.jdc.home.utils.search.Searchable;
import com.jdc.home.utils.search.Sortable;

public abstract class AbstractRepository<T extends JpaEntity> {

	@Inject
	private EntityManager em;

	protected abstract Class<T> type();
	
	private static final String SELECT = "select t from %s t ";
	private static final String COUNT = "select count(t) from %s t ";

	public void create(T t) {
		em.persist(t);
	}

	public void update(T t) {
		em.merge(t);
	}

	public void delete(T t) {
		em.remove(em.find(type(), t.getId()));
	}

	public T find(Object id) {
		return em.find(type(), id);
	}

	public List<T> find(Searchable search) {
		StringBuffer sb = new StringBuffer(String.format(SELECT, type().getSimpleName()));
		
		if(null != search) {
			
			// join
			if(search instanceof Joinable) {
				Joinable join = (Joinable) search;
				sb.append(join.join());
			}
			
			// where
			sb.append(search.where());
			
			// order by
			if(search instanceof Sortable) {
				Sortable sort = (Sortable) search;
				sb.append(sort.sort());
			}
		}
		
		TypedQuery<T> query = em.createQuery(sb.toString(), type());
		
		if(null != search) {
			for(String key : search.params().keySet()) {
				query.setParameter(key, search.params().get(key));
			}
		}
		
		// pagination
		if(search instanceof PageEnable) {
			PageEnable page = (PageEnable) search;
			
			query.setFirstResult(page.start());
			query.setMaxResults(page.limit());
		}
		
		return query.getResultList();
	}

	public long findCount(Searchable search) {
		StringBuffer sb = new StringBuffer(String.format(COUNT, type().getSimpleName()));
		if(null != search) {
			
			// join
			if(search instanceof Joinable) {
				Joinable join = (Joinable) search;
				sb.append(join.join());
			}
			
			// where
			sb.append(search.where());
			
		}

		TypedQuery<Long> query = em.createQuery(sb.toString(), Long.class);
		
		if(null != search) {
			for(String key : search.params().keySet()) {
				query.setParameter(key, search.params().get(key));
			}
		}
		
		return query.getSingleResult();
	}
	

}
package com.webseries.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webseries.Entity.Webseries;
import com.webseries.Exception.WebseriesException;


@Repository
@Transactional
public class WebseriesDaoImpl implements WebseriesDao{
	
		@PersistenceContext
		EntityManager entityManager;
		
	@Override
	public List<Webseries> getAllSeries() throws WebseriesException {
		TypedQuery<Webseries> query = entityManager.createQuery("From Webseries", Webseries.class);
		return 	query.getResultList();

	}

	@Override
	public List<Webseries> getSeriesByName(String name) throws WebseriesException {
		TypedQuery<Webseries> query =entityManager.createQuery("From Webseries where name = :name",Webseries.class);
		query.setParameter("name", name);
		List<Webseries> webseriesDummy = query.getResultList();
		if(webseriesDummy.size()==0)
		{
			throw new WebseriesException("No Record Found!!!");
		}
		
		
		return webseriesDummy;
	}

	@Override
	public Webseries getSeriesById(String id) throws WebseriesException {
Webseries webseries=entityManager.find(Webseries.class, id);
if(webseries == null)
{
	throw new WebseriesException("No Record Found!!!");
}
else
{
	return webseries;
	}
}

	@Override
	public String addSeries(Webseries webseries) throws WebseriesException {
		entityManager.persist(webseries);
		return webseries.getId();
	}

	@Override
	public Webseries updateSeries(Webseries webseries) throws WebseriesException {
		
		Webseries webseriesDummy ;
		try{
		webseriesDummy = entityManager.find(Webseries.class, webseries.getId());	
		webseriesDummy.setSeasons(webseries.getSeasons());
		webseriesDummy.setEpisodes(webseries.getEpisodes());
		webseriesDummy.setRating(webseries.getRating());
		webseriesDummy.setName(webseries.getName());
		entityManager.merge(webseriesDummy);
		}
		catch (Exception e) {
			throw new WebseriesException("No records found!!!");	}


		return webseriesDummy;
	}

	@Override
	public String deleteSeriesById(String id) throws WebseriesException {
Webseries webseriesDummy =entityManager.find(Webseries.class, id);
if (webseriesDummy != null) {
	entityManager.remove(webseriesDummy);
} else {
	throw new WebseriesException("No Record Found!!!");
}
return id;

	}

}

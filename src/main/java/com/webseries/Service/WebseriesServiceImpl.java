package com.webseries.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webseries.Dao.WebseriesDao;
import com.webseries.Entity.Webseries;
import com.webseries.Exception.WebseriesException;

@Service
class WebseriesServiceImpl implements WebseriesService{

	@Autowired
	WebseriesDao webSeriesDao;
	
	@Override
	public List<Webseries> getAllSeries() throws WebseriesException {
		// TODO Auto-generated method stub
		return webSeriesDao.getAllSeries();
	}

	@Override
	public List<Webseries> getSeriesByName(String name) throws WebseriesException {
		// TODO Auto-generated method stub
		return webSeriesDao.getSeriesByName(name);
	}

	@Override
	public Webseries getSeriesById(String id) throws WebseriesException {
		// TODO Auto-generated method stub
		return webSeriesDao.getSeriesById(id);
	}

	@Override
	public String addSeries(Webseries webseries) throws WebseriesException {
		// TODO Auto-generated method stub
		return webSeriesDao.addSeries(webseries);
	}

	@Override
	public Webseries updateSeries(Webseries webseries) throws WebseriesException {
		// TODO Auto-generated method stub
		return webSeriesDao.updateSeries(webseries);
	}

	@Override
	public String deleteSeriesById(String id) throws WebseriesException {
		// TODO Auto-generated method stub
		return webSeriesDao.deleteSeriesById(id);
	}

}

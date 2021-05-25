package com.webseries.Dao;

import java.util.List;

import com.webseries.Entity.Webseries;
import com.webseries.Exception.WebseriesException;

public interface WebseriesDao {

	public List<Webseries> getAllSeries() throws WebseriesException;
	public List<Webseries> getSeriesByName(String name) throws WebseriesException;
	public Webseries getSeriesById(String id) throws WebseriesException;

	public String addSeries(Webseries webseries) throws WebseriesException;
	public Webseries updateSeries(Webseries webseries) throws WebseriesException;
	public String deleteSeriesById(String id) throws WebseriesException;
	
	
}

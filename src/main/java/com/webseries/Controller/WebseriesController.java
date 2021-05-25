 package com.webseries.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.bind.support.WebExchangeBindException;

import com.webseries.Entity.Webseries;
import com.webseries.Exception.WebseriesException;
import com.webseries.Service.WebseriesService;


@CrossOrigin("*")
@RestController
public class WebseriesController {


	
		
		@Autowired
		WebseriesService webseriesService;
		
		@GetMapping(value = "/series")
		public List<Webseries> getAllSeries() throws WebseriesException {
			return webseriesService.getAllSeries();
		}
		
		@GetMapping(value = "/series/name/{name}")
		public List<Webseries> getByName(@PathVariable("name") String name) throws WebseriesException {
			return webseriesService.getSeriesByName(name);
		}
		
		@GetMapping(value = "/series/id/{id}")
		public Webseries getByid(@PathVariable("id") String id) throws WebseriesException {
			return webseriesService.getSeriesById(id);
		}
		
		@GetMapping(value = "/delete/{id}")
		public String delete(@PathVariable String id) throws WebseriesException {
		    return "Series Removed ! "+ webseriesService.deleteSeriesById(id);
		}

		@RequestMapping(value = "/addSeries", method = RequestMethod.POST)
		public String addSeries(@RequestBody Webseries webseries) throws WebseriesException {
			String id = webseriesService.addSeries(webseries);
			return "Webseries Successfully Added,Id is " + id;
		}
		
		@PostMapping("/update")
		public Webseries updateSeries(@RequestBody Webseries webseries) throws WebseriesException {
		    return webseriesService.updateSeries(webseries);
		}

}

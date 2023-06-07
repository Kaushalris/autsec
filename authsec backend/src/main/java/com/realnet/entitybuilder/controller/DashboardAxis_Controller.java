package com.realnet.entitybuilder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.realnet.entitybuilder.entity.Dashboardaxis;
import com.realnet.entitybuilder.repo.DashboardAxisrepo;

//@RequestMapping(value = "/Dashboardaxis")
@RestController
public class DashboardAxis_Controller {

	@Autowired
	private DashboardAxisrepo axisrepo;
	

	@PostMapping("/Dashboardaxis")
	public Dashboardaxis Savedata(@RequestBody Dashboardaxis data) {
		Dashboardaxis save = axisrepo.save(data);
		return save;
	}

	@GetMapping("/Dashboardaxis")
	public List<Dashboardaxis> getdetails() {
		List<Dashboardaxis> get = axisrepo.findAll();
		return get;
	}

	@GetMapping("/Dashboardaxis/{id}")
	public Dashboardaxis getdetailsbyId(@PathVariable Long id) {
		Dashboardaxis get = axisrepo.findById(id).get();
		return get;

	}

	@DeleteMapping("/Dashboardaxis/{id}")
	public void delete_by_id(@PathVariable Long id) {
		axisrepo.deleteById(id);

	}

	@PutMapping("/Dashboardaxis/{id}")
	public Dashboardaxis update(@RequestBody Dashboardaxis data, @PathVariable Long id) {
		Dashboardaxis get = axisrepo.findById(id).get();
		get.setJan(data.getJan());
		get.setFeb(data.getFeb());
		get.setMarch(data.getMarch());

		Dashboardaxis update = axisrepo.save(data);
		return update;
	}
}
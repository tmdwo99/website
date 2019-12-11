package org.dsu.dc.capston.controller;

import org.dsu.dc.capston.service.MapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/map/*")
public class MapController {
	@Autowired
	private MapService service;
	
	
	@GetMapping("list")
	public void listAll(Model model) throws Exception{
		log.info("[Map] show all list..................");
		model.addAttribute("list",service.listAll());
	}
	
	@GetMapping("Map")
	public void viewMap(Model model) {
		
	}
}

	


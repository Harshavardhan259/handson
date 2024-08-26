package com.demo.spring.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.entity.Emp;

@Controller
public class EmpController {
	
	Map<Integer, Emp>  db = new ConcurrentHashMap<>();
	
	@RequestMapping(path = "/registar", method = RequestMethod.GET)
	public String getPage() {
		return "registar";
	}
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String gethomePage() {
		return "home";
	}
	
	@RequestMapping(path = "/finder", method = RequestMethod.GET)
	public String getFinderPage() {
		return "finder";
	}
	
	
	@RequestMapping(path = "/registar", method = RequestMethod.POST)
	public ModelAndView register(@RequestParam("empId") Integer empId, @RequestParam("name") String name, @RequestParam("city") String city,@RequestParam("salary") Double salary) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		db.put(empId, new Emp(empId, name, city, salary));
		return mv;
	}
	
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("list");
		Collection<Emp> data = db.values();
		List<Emp> empList = new ArrayList<>(data);
		System.out.println(empList);
		mv.addObject("eList", empList);
		return mv;
	}
	
	@RequestMapping(path = "/finder2", method = RequestMethod.POST)
	public ModelAndView find(@RequestParam("empId") Integer empId) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("finder");
		Emp emp=db.get(empId);
		mv.addObject("e", emp);
		return mv;
	}
	
}

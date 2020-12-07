package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@Autowired
	private ProductsRepo repo_product;
	
	
	@RequestMapping("/add")
	public String add()
	{
		return "Add.jsp";
	}
	

	
	@RequestMapping("/")
	public ModelAndView getdetails()
	{
		ModelAndView model=new ModelAndView("CRUD_Page.jsp");
		List<Products> list=(List<Products>)repo_product.findAll();
		model.addObject("product_list",list);
		return model;
	
	}
	
	
	@RequestMapping("/add_product")
	public String add_product(Products products)
	{
		repo_product.save(products);
		return "redirect:/";
	}
	
	@RequestMapping("/delete_product")
	public String delete_product(@RequestParam("id")long id)
	{
		repo_product.deleteById(id);
		return "redirect:/";
	}
	
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("id")long id)
	{
		ModelAndView model=new ModelAndView("Update.jsp");
		model.addObject("update_id",repo_product.findbyid(id));
		return model;
	}
	
	@RequestMapping("/update_product")
	public String update_product(Products products)
	{
		repo_product.save(products);
		return "redirect:/";
	}
}

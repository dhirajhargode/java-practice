package com.nit.apps.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nit.apps.dao.ProductDao;
import com.nit.apps.model.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDao pDao;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "/displayForm", method = RequestMethod.GET)
	public String displayProductForm(Model model) {
		Product p = new Product();
		model.addAttribute("p", p);
		return "product";
	}

	@RequestMapping(value = "/store")
	public String storeProduct(@ModelAttribute Product p, Model model) {
		boolean isInserted = pDao.insertProduct(p);
		model.addAttribute("p", p);
		if (isInserted) {
			model.addAttribute("succMsg", "Record inserted..");
		} else {
			model.addAttribute("errMsg", "Failed to Insert..");
		}
		return "product";
	}

	@RequestMapping(value = "/retrieve")
	public String retrieveRecords(Model model) {
		List<Product> pList = pDao.retrieveAllProducts();
		model.addAttribute("pList", pList);
		return "display";
	}

/*	@RequestMapping(name = "/editProduct")
	public String editProduct(Model model) {
		String pid = (String) request.getParameter("pid");
		Product p = pDao.retrieveProductById(pid);
		model.addAttribute("p", p);
		return "product";
	}*/

	@RequestMapping(name = "/exportDataToExcel")
	public ModelAndView generateExcel() {
		List<Product> pList = pDao.retrieveAllProducts();
		return new ModelAndView("excelView", "pList", pList);
	}
}

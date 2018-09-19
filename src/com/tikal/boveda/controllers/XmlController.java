package com.tikal.boveda.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tikal.cacao.util.ReadXML;

@Controller

@RequestMapping(value = { "/xml"})
public class XmlController {
	
	@RequestMapping(value={"/prueba"},method = RequestMethod.GET)	
	   
	   public void prueba(HttpServletResponse response, HttpServletRequest request) throws IOException {
		   response.getWriter().println("Prueba del mètodo Venta prueba");

	    }
	
	@RequestMapping(value={"/leer"},method = RequestMethod.GET)	
	   
	   public void leer(HttpServletResponse response, HttpServletRequest request) throws IOException {
		ReadXML rxml = new ReadXML();
		   response.getWriter().println("Prueba para leer XML");

	    }
	
	
}

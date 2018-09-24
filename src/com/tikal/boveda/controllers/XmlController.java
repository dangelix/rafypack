package com.tikal.boveda.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tikal.cacao.dao.DatosDAO;
import com.tikal.cacao.util.JsonConvertidor;
import com.tikal.cacao.util.ReadXML;
import com.tikal.unoconnections.exception.DatosTxtException;
import com.tikal.unoconnections.tralix.Datos;

@Controller

@RequestMapping(value = { "/xml"})
public class XmlController {
	
	
	
	@Autowired
	private DatosDAO datosdao;
	
	
	
	
	@RequestMapping(value={"/prueba"},method = RequestMethod.GET)	
	   
	   public void prueba(HttpServletResponse response, HttpServletRequest request) throws IOException {
		   response.getWriter().println("Prueba del mètodo Venta prueba");

	    }
	
	@RequestMapping(value={"/leer"},method = RequestMethod.GET)	
	   
	   public void leer(HttpServletResponse response, HttpServletRequest request) throws IOException {
		ReadXML rxml = new ReadXML();
		   response.getWriter().println("Prueba para leer XML");

	    }
	
	
	@RequestMapping(value={"/cargar"},method = RequestMethod.POST, consumes="application/json", produces="application/json")	
	   
	   public void leer(HttpServletResponse response, HttpServletRequest request ,@PathVariable String idDatos) throws IOException {
		ReadXML rxml = new ReadXML();
		   response.getWriter().println(JsonConvertidor.toJson("Prueba para leer XML"));

	    }
	
	@RequestMapping(value={"/guardar"},method = RequestMethod.GET, consumes="application/json", produces="application/json")	
	   
	   public void guardar(HttpServletResponse response, HttpServletRequest request, @RequestBody String json) throws IOException {
			String[] args = json.split("CADENADEESCAPE");
			List<Datos> lista= new ArrayList<Datos>();
			for(String arg:args){
	 			try {
	 				Datos datos = new Datos(arg);
	 	 			//datos.setRfcEmisor(proveedor);
	 	 			lista.add(datos);
	 			} catch (DatosTxtException e) {
	 				Datos datosConExcepetion = new Datos();
	 			//	datosConExcepetion.setRfcEmisor(proveedor);
	 				datosConExcepetion.setError(e.getMessage());
	 				datosConExcepetion.setPausada(true);
	 				lista.add(datosConExcepetion);
	 			}
	 			
	 		}

	 		datosdao.guardar(lista);
	 		
	 		response.getWriter().print(JsonConvertidor.toJson(lista));

	    }
	
	
	
	
	
	
}

package com.tikal.tsl.util;

import org.springframework.stereotype.Component;

import com.googlecode.objectify.ObjectifyService;
import com.tikal.tsl.modelo.entity.Empresa;
import com.tikal.tsl.modelo.entity.Envio;
import com.tikal.tsl.modelo.entity.Paquete;
import com.tikal.tsl.modelo.login.Perfil;
import com.tikal.tsl.modelo.login.SessionEntity;
import com.tikal.tsl.modelo.login.Sucursal;
import com.tikal.tsl.modelo.login.Usuario;




@Component
public class StartupEntities  {
	
	
	public StartupEntities() {
		
		
		
		ObjectifyService.register(Perfil.class);
		ObjectifyService.register(SessionEntity.class);
		ObjectifyService.register(Sucursal.class);
		ObjectifyService.register(Usuario.class);
		ObjectifyService.register(Paquete.class);
		ObjectifyService.register(Envio.class);
		ObjectifyService.register(Empresa.class);
		
	}
	  
    
    
}
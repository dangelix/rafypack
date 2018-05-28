package com.tikal.mensajeria.util;

import org.springframework.stereotype.Component;

import com.googlecode.objectify.ObjectifyService;
import com.tikal.mensajeria.login.Perfil;
import com.tikal.mensajeria.login.SessionEntity;
import com.tikal.mensajeria.login.Sucursal;
import com.tikal.mensajeria.login.Usuario;
import com.tikal.mensajeria.modelo.entity.Empresa;
import com.tikal.mensajeria.modelo.entity.Envio;
import com.tikal.mensajeria.modelo.entity.Paquete;


@Component
public class StartupEntities {
	
	
	public StartupEntities() {
		
		
		ObjectifyService.register(Usuario.class);
		ObjectifyService.register(Perfil.class);
		ObjectifyService.register(SessionEntity.class);
		ObjectifyService.register(Sucursal.class);
		ObjectifyService.register(Paquete.class);
		ObjectifyService.register(Envio.class);
		ObjectifyService.register(Empresa.class);
		
		
	}
	  
    
    
}

package com.tikal.cacao.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.tikal.cacao.sat.cfd33.Comprobante;

public class ReadXML {

	    /**
	     * @param args the command line arguments
	     */
	    public ReadXML() throws FileNotFoundException {
	        JAXBContext factura;
	        Boolean valido=false;
	        try {
	            factura= JAXBContext.newInstance(Comprobante.class);
	             Unmarshaller u = factura.createUnmarshaller();
	    
		        
		             Comprobante root = (Comprobante) u.unmarshal(new FileInputStream("C:/XMLs/prueba.xml"));
		             
		             
		        for(int x=0; x<root.getConceptos().getConcepto().size(); x++){
		        	Integer importe=root.getConceptos().getConcepto().get(x).getImporte().intValue();
		            System.out.println(importe);
		            System.out.println(root.getConceptos().getConcepto().get(x).getCantidad());
		            System.out.println(root.getConceptos().getConcepto().get(x).getDescripcion());
		            System.out.println(root.getConceptos().getConcepto().get(x).getImporte());
		            System.out.println(root.getConceptos().getConcepto().get(x).getUnidad());
		            System.out.println(root.getConceptos().getConcepto().get(x).getValorUnitario()); 
		            System.out.println("adenda: "+root.getAddenda().getAny().get(x)); 
		            //System.out.println("adenda: "+root.);
		            if (importe < 100){
			        	valido=false;
			        }else{	        
			        	valido=true;
			        }
		            
		            
		           
		        }
		       
		    
	        } catch (JAXBException ex) {
	            Logger.getLogger(ReadXML.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        System.out.println("¿Es válida la cantidad?"+valido);
	        
	        
	        
	        //return valido;
	    }
	    
	}
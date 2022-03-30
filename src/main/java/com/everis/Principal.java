package com.everis;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.internal.SessionImpl;

import com.everis.Services.ClienteServiceI;
import com.everis.Services.ClienteServiceImpl;
import com.everis.Services.ContratoServiceI;
import com.everis.Services.ContratoServiceImpl;

public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		final Session session = UtilSessionFactory.getSessionFactory().openSession();
		
		ContratoServiceI  contratoSI = new ContratoServiceImpl(session) ;
		ClienteServiceI  clienteSI = new ClienteServiceImpl(session) ;
		
		Date fechaVigencia = new Date(2022,03,30);
		Date fechaCaducidad = new Date(2022,04,30);
		
		//Creo Cliente
		Cliente cliente = new Cliente();
		cliente.setNombre("Paco");
		cliente.setApellido1("Rodriguez");
		cliente.setApellido2("Morillo");
		cliente.setDNI("56768923L");
		
		//Creo Contrato
		Contrato contrato = new Contrato();
		contrato.setFechaVigencia(fechaVigencia);
		contrato.setFechaCaducidad(fechaCaducidad);
		contrato.setPrecioMnesual(400.00);
		contrato.setCliente(cliente);
		
		//Inserto cliente
		clienteSI.insert(cliente);
		
		//Inserto contrato
		contratoSI.insert(contrato);
		
		//Update cliente
		cliente.setNombre("Pepe");
		clienteSI.update(cliente);
				
		//Update contrato
		contrato.setPrecioMnesual(800.00);
		contratoSI.update(contrato);
		
		//Delete cliente
		clienteSI.delete(cliente);
				
		//Delete contrato
		contratoSI.delete(contrato);
	}

}

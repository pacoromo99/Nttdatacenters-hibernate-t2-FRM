package com.everis.Services;

import org.hibernate.Session;

import com.everis.Cliente;
import com.everis.DAO.ClienteDaoI;
import com.everis.DAO.ClienteDaoImpl;

public class ClienteServiceImpl implements ClienteServiceI
{
	ClienteDaoI cliente;
	
	public ClienteServiceImpl(final Session session) 
	{
		this.cliente = new ClienteDaoImpl(session);
	}

	public void insert(Cliente cliente) 
	{
		// TODO Auto-generated method stub
		if(cliente !=null && cliente.getId() == null) 
		{
			this.cliente.insert(cliente);
		}
	}

	public void update(Cliente cliente) 
	{
		// TODO Auto-generated method stub
		if (cliente != null && cliente.getId() != null) {

			// Actualización del cliente.
			this.cliente.update(cliente);
		}
		
	}

	public void delete(Cliente cliente) 
	{
		// TODO Auto-generated method stub
		if (cliente != null && cliente.getId() != null) {

			// Actualización del cliente.
			this.cliente.delete(cliente);
		}
		
	}
}

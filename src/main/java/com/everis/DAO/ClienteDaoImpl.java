package com.everis.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.everis.Cliente;
import com.everis.Contrato;

public class ClienteDaoImpl implements ClienteDaoI {
	private Session session;
	
	public  ClienteDaoImpl(Session  session) 
	{
		this.session = session;

	}
	
	public Cliente searchByNameCliente(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> searchCliente()
	{
		List <Cliente> res = new ArrayList<Cliente>();
		if(!session.getTransaction().isActive()) 
		{
			session.getTransaction().begin();
		}
		res = session.createQuery("FROM" + Cliente.class).list();
		return res;
	}

	public void insert(Cliente cliente) 
	{
		if(cliente !=null && cliente.getId() == null) 
		{
			session.getTransaction().begin();
		}
		session.save(cliente);
		session.getTransaction().commit();
		
	}
	public void delete(Cliente cliente) {
		// TODO Auto-generated method stub
		if(!session.getTransaction().isActive()) 
		{
			session.getTransaction().begin();
		}
		session.delete(cliente);
		session.getTransaction().commit();
	}
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		if(!session.getTransaction().isActive()) 
		{
			session.getTransaction().begin();
		}
		session.update(cliente);
		session.getTransaction().commit();
	}

}

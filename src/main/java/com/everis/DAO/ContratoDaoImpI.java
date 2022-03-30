package com.everis.DAO;

import java.util.List;

import org.hibernate.Session;

import com.everis.Contrato;

public class ContratoDaoImpI implements ContratoDaoI 
{
	Session session;
	public ContratoDaoImpI(Session session)
	{
		this.session = session;
	}

	public void insert(Contrato contrato) {
		// TODO Auto-generated method stub
		if(!session.getTransaction().isActive()) 
		{
			session.getTransaction().begin();
		}
		session.save(contrato);
		session.getTransaction().commit();
	}
	public void delete(Contrato contrato) {
		// TODO Auto-generated method stub
		if(!session.getTransaction().isActive()) 
		{
			session.getTransaction().begin();
		}
		session.delete(contrato);
		session.getTransaction().commit();
	}
	public void update(Contrato contrato) {
		// TODO Auto-generated method stub
		if(!session.getTransaction().isActive()) 
		{
			session.getTransaction().begin();
		}
		session.update(contrato);
		session.getTransaction().commit();
	}

	public List<Contrato> select() {
		// TODO Auto-generated method stub
		return null;
	}
}

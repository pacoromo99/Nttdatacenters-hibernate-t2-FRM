package com.everis.Services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import com.everis.Contrato;
import com.everis.DAO.ContratoDaoI;
import com.everis.DAO.ContratoDaoImpI;

public class ContratoServiceImpl implements ContratoServiceI {
	ContratoDaoI contrato;
	
	public ContratoServiceImpl(final Session session) 
	{
		this.contrato = new ContratoDaoImpI(session);
	}

	public void insert(Contrato contrato) {
		// TODO Auto-generated method stub
		if(contrato !=null && contrato.getId() == null) 
		{
			this.contrato.insert(contrato);
		}
	}

	public void update(Contrato contrato) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Contrato contrato) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<Contrato> select(Session session) {
		// TODO Auto-generated method stub
		List <Contrato> res = new ArrayList<Contrato>();
		if(!session.getTransaction().isActive()) 
		{
			session.getTransaction().begin();
		}
		res = session.createQuery("FROM" + Contrato.class).list();
		return res;
	}
}

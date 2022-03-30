package com.everis.Services;

import java.util.List;

import org.hibernate.Session;

import com.everis.Contrato;

public interface ContratoServiceI 
{
	public void insert(final Contrato contrato);
	public void update(final Contrato contrato);
	public void delete(final Contrato contrato);
	public List<Contrato> select(Session session);

}

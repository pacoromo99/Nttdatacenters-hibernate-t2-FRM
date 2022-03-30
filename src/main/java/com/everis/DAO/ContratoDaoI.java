package com.everis.DAO;

import java.util.List;
import com.everis.Contrato;

public interface ContratoDaoI 
{
	public void insert(Contrato contrato);
	public void update(Contrato contrato);
	public void delete(Contrato contrato);
	public List<Contrato> select();
	
}

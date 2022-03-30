package com.everis;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilSessionFactory 
{
	/** Factor�a de sesiones */
	private static final SessionFactory SESSION_FACTORY;

	/**
	 * Generaci�n de factor�a de sesiones.
	 */
	static {

		try {

			// Generaci�n de configuraci�n.
			SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
			
		} catch (final Throwable ex) {

			// Error de inicializaci�n.
			System.err.println("[ERROR] Configuraci�n de Hibernate - " + ex);
			throw new ExceptionInInitializerError();
		}

	}

	/**
	 * Retorna la factor�a de sesiones.
	 * 
	 * @return SessionFactory
	 */
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}

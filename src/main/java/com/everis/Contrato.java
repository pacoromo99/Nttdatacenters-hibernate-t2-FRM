package com.everis;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CONTRATO")
public class Contrato 
{
	private Long id;
	private String nombre;
	private Date fechaVigencia;
	private Date fechaCaducidad;
	private Double precioMensual;
	private Cliente cliente;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="FechaVigencia",unique=false,nullable=false)
	public Date getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	@Column(name="FechaCaducidad",unique=false,nullable=false)
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	@Column(name="PrecioMensual",unique=false,nullable=false)
	public Double getPrecioMnesual() {
		return precioMensual;
	}
	public void setPrecioMnesual(Double precioMnesual) {
		this.precioMensual = precioMnesual;
	}
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE")

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}

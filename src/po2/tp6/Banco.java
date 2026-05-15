package po2.tp6;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Credito> creditos;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.creditos = new ArrayList<Credito>();
	
	}
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void registrarCredito(Credito credito) {
		creditos.add(credito);
	}
		
	public void otorgarCredito(Credito credito) {
	    if (credito.evaluarSolicitud()) {
	        credito.getCliente().addDinero(credito.getMonto());
	    }
	}
	
	public boolean estadoSolicitud(Credito credito) {
		return credito.evaluarSolicitud();
	}
	
	public double montoTotalDeTodasLasSolicitudesAceptadas() {
		
		double montoTotal = 0;
		
		for (Credito c : creditos) {
			if (c.evaluarSolicitud()) {
		         montoTotal += c.getMonto();
			}
		}
		return montoTotal;
	}
}

/*
S — Single Responsibility Principle

Cada clase tiene una única responsabilidad:

Banco administra créditos/clientes
Cliente representa datos del cliente
Credito modela solicitudes
CreditoHipotecario define reglas hipotecarias
CreditoPersonal define reglas personales

O — Open/Closed Principle

El sistema está abierto a extensión y cerrado a modificación.

Puedo agregar distintis tipos de creditos y el banco sigue trabajando con Credito sin modificar nada 

L — Liskov Substitution Principle

CreditoPersonal y CreditoHipotecario pueden reemplazar a Credito
sin romper el comportamiento esperado.
*/
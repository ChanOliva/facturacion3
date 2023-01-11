package com.tuempresa.facturacion.validadores;


import org.openxava.util.*;
import org.openxava.validators.*;

import com.tuempresa.facturacion3.modelo.*;

import lombok.*;

@Getter @Setter
public class ValidadorEntregadoParaEstarEnFactura implements IValidator{
	
	private int anyo; 
	
	private int numero;
	 
	private boolean entregado;
	 
	private Factura factura;
	 
	public void validate(Messages errors)
	 
			throws Exception { // La lógica de validación
	 
		if (factura == null) return;
	 
		if (!entregado) {
	
			errors.add( 
	"pedido_debe_estar_entregado", 
	anyo, numero); 
	}
	 }

}

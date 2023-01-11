package com.tuempresa.facturacion3.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Pedido extends DocumentoComercial {

	@ManyToOne
	Factura factura;
}

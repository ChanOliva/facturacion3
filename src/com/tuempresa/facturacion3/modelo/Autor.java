package com.tuempresa.facturacion3.modelo;

import java.util.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Autor {

	@Id
	 @Hidden
	 @GeneratedValue(generator="system-uuid") 
	 @GenericGenerator(name="system-uuid", strategy = "uuid")
	 @Column(length=32)
	 String oid;
	
	@Column(length=50) 
	@Required
	 String nombre;
	
	@OneToMany(mappedBy="autor", cascade=CascadeType.REMOVE)
	@ListProperties("numero, descripcion, precio")
	Collection<Producto> productos;
}

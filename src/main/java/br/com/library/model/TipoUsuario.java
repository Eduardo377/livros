package br.com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TipoUsuario {

	@Id
	@Column(name = "idtipousuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoUsuario;
	
	@Column(name = "tipo", length = 45)
	private String tipo;
	
}

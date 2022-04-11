package br.com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Autor {

	@Id
	@Column(name = "idautor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAutor;

	@Column(name = "nome", length = 100)
	private String nome;

	@Column(name = "idLivro", length = 45)
	private String idLivro;

	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}
}

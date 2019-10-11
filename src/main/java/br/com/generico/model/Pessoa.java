package br.com.generico.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String cpf;
	private String rg;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	
}

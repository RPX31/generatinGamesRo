package com.Generation.gamesRo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	private Integer faixaEtaria;
    
    @Size(min = 5, max = 200, message = "A descrição deve ter entre 5 e 200 caracteres.")
	private String descricao;
   
	private Integer codigo;
   
    @Size(min = 3, max = 50, message = "O gênero deve ter entre 3 e 50 caracteres.")
	private String generoDoJogo;
    
    @Size(min = 3, max = 50, message = "A plataforma deve ter entre 3 e 50 caracteres.")
	private String plataforma;
    
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("categoria")
    private List<Produto> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(Integer faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getGeneroDoJogo() {
		return generoDoJogo;
	}

	public void setGeneroDoJogo(String generoDoJogo) {
		this.generoDoJogo = generoDoJogo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	
	
	
	
	
	
}

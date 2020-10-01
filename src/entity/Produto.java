package entity;

import java.io.Serializable;

//Serialização  permite que um objeto seja transformado em sequência de bytes.utilizamos enviamos objeto pela rede
//dalvar no disco, quando usamos Data Access Objects (DAO) e JDBC para interagir com banco de dados

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idProduto;
	private String nome;
	private String descricao;
	private Double preco;
	private String imagem;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	

	public Produto(Integer idProduto, String nome, String descricao, Double preco, String imagem) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
	}


	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ ", imagem=" + imagem + "]";
	}



	public Integer getIdProduto() {
		return idProduto;
	}



	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}



	public String getImagem() {
		return imagem;
	}



	public void setImagem(String imagem) {
		this.imagem = imagem;
	}


	
	

}

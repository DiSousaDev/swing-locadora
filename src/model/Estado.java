package model;

/**
 * Classe para armazenar os atributos e métodos do objeto Estado
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class Estado {

	// declarando atributos
	private String nome;
	private String uf;

	// criando metodo construtor
	public Estado() {

	}

	// metodos getters e setters para acesso aos atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}

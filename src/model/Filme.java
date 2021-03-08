package model;

/**
 * Classe para armazenar os atributos e métodos do objeto Filme
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class Filme {

	// declarando atributos
	private int codigo;
	private String nome;
	private String genero;
	private double valor;
	private boolean disponivel;
	private boolean promocao;
	private double valorPromocao;

	// criando metodo construtor
	public Filme() {

	}

	// metodos getters e setters para acesso aos atributos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public double getValorPromocao() {
		return valorPromocao;
	}

	public void setValorPromocao(double valorPromocao) {
		this.valorPromocao = valorPromocao;
	}

}

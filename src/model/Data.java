package model;

/**
 * Classe para armazenar os atributos e métodos do objeto Data
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class Data {

	// declarando os atributos
	private int dia;
	private int mes;
	private int ano;

	// criando metodo construtor
	public Data() {
	}

	// construtor com parâmetro
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// metodos getters e setters para acesso aos atributos
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// sobrescrevendo o método para exibir detalhes da classe
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}

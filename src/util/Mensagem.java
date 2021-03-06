package util;

import javax.swing.JOptionPane;

/**
 * Classe para armazenar as mensagens utilizadas no projeto
 * 
 * @author ?der Diego de Sousa
 * @since 8 de mar. de 2021
 * @version 1.0
 */
public class Mensagem {

	// MENSAGENS DE ERRO
	public static void erroGravarArquivoFilme(String titulo) {
		JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo de filme!", titulo, 0);
	}
	public static void erroLerArquivoFilme(String titulo) {
		JOptionPane.showMessageDialog(null, "Erro ao ler arquivo de filme!", titulo, 0);
	}
	public static void erroGravarArquivoVendedor(String titulo) {
		JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo de vendedor!", titulo, 0);
	}
	public static void erroLerArquivoVendedor(String titulo) {
		JOptionPane.showMessageDialog(null, "Erro ao ler arquivo de vendedor!", titulo, 0);
	}
	public static void erroLerArquivoEstado(String titulo) {
		JOptionPane.showMessageDialog(null, "Erro ao ler arquivo de estados!", titulo, 0);
	}
	
	// CAMPO VAZIO
	public static void erroCodigoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o c?digo, campo obrigat?rio", titulo, 0);
	}
	public static void erroNomeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o nome, campo obrigat?rio", titulo, 0);
	}
	public static void erroAreaVendaVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a ?rea de venda, campo obrigat?rio", titulo, 0);
	}
	public static void erroCidadeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a cidade, campo obrigat?rio", titulo, 0);
	}
	public static void erroEstadoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o estado, campo obrigat?rio", titulo, 0);
	}
	public static void erroSexoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o sexo, campo obrigat?rio", titulo, 0);
	}
	public static void erroIdadeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a idade, campo obrigat?rio", titulo, 0);
	}
	public static void erroSalarioVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o sal?rio, campo obrigat?rio", titulo, 0);
	}
	public static void erroValorVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o valor, campo obrigat?rio", titulo, 0);
	}
	public static void erroValorPromocaoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o valor promocional, campo obrigat?rio", titulo, 0);
	}
	public static void erroDisponivelVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe se o filme est? dispon?vel, campo obrigat?rio", titulo, 0);
	}
	public static void erroPromocaoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe se o filme est? em promo??o, campo obrigat?rio", titulo, 0);
	}
	public static void erroGeneroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o g?nero de filme, campo obrigat?rio", titulo, 0);
	}
	public static void erroCpfVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o CPF, campo obrigat?rio", titulo, 0);
	}
	public static void erroRgVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o RG, campo obrigat?rio", titulo, 0);
	}
	public static void erroEmailVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o e-mail, campo obrigat?rio", titulo, 0);
	}
	public static void erroDtNascimentoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a Data de Nascimento, campo obrigat?rio", titulo, 0);
	}
	public static void erroCelularVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o Celular, campo obrigat?rio", titulo, 0);
	}
	public static void erroTelefoneVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o Telefone, campo obrigat?rio", titulo, 0);
	}
	public static void erroCepVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o CEP, campo obrigat?rio", titulo, 0);
	}
	public static void erroLogradouroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o logradouro, campo obrigat?rio", titulo, 0);
	}
	public static void erroEnderecoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o endere?o, campo obrigat?rio", titulo, 0);
	}
	public static void erroNumeroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o n?mero, campo obrigat?rio", titulo, 0);
	}
	public static void erroBairroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o bairro, campo obrigat?rio", titulo, 0);
	}

	
	// CAMPO INVALIDO
	public static void erroCodigoInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um c?digo v?lido", titulo, 0);
	}
	public static void erroIdadeInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe uma idade v?lida", titulo, 0);
	}
	public static void erroSalarioInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um sal?rio v?lido", titulo, 0);
	}
	public static void erroValorInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um valor v?lido", titulo, 0);
	}
	public static void erroValorPromocaoInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um valor promocional v?lido", titulo, 0);
	}
	public static void erroNumeroInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um n?mero v?lido", titulo, 0);
	}
	
	//MENSAGENS DE SUCESSO
	public static void sucessoGravarVendedor(String titulo) {
		JOptionPane.showMessageDialog(null, "Vendedor salvo com sucesso!", titulo, 1);
	}
	public static void sucessoGravarFilme(String titulo) {
		JOptionPane.showMessageDialog(null, "Filme salvo com sucesso!", titulo, 1);
	}
	public static void sucessoGravarCliente(String titulo) {
		JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!", titulo, 1);
	}
	public static void sucessoGravarLocacao(String titulo) {
		JOptionPane.showMessageDialog(null, "Loca??o salva com sucesso!", titulo, 1);
	}
}

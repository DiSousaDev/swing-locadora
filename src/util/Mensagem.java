package util;

import javax.swing.JOptionPane;

/**
 * Classe para armazenar as mensagens utilizadas no projeto
 * 
 * @author Éder Diego de Sousa
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
		JOptionPane.showMessageDialog(null, "Informe o código, campo obrigatório", titulo, 0);
	}
	public static void erroNomeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o nome, campo obrigatório", titulo, 0);
	}
	public static void erroAreaVendaVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a área de venda, campo obrigatório", titulo, 0);
	}
	public static void erroCidadeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a cidade, campo obrigatório", titulo, 0);
	}
	public static void erroEstadoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o estado, campo obrigatório", titulo, 0);
	}
	public static void erroSexoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o sexo, campo obrigatório", titulo, 0);
	}
	public static void erroIdadeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a idade, campo obrigatório", titulo, 0);
	}
	public static void erroSalarioVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o salário, campo obrigatório", titulo, 0);
	}
	public static void erroValorVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o valor, campo obrigatório", titulo, 0);
	}
	public static void erroValorPromocaoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o valor promocional, campo obrigatório", titulo, 0);
	}
	public static void erroDisponivelVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe se o filme está disponível, campo obrigatório", titulo, 0);
	}
	public static void erroPromocaoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe se o filme está em promoção, campo obrigatório", titulo, 0);
	}
	public static void erroGeneroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o gênero de filme, campo obrigatório", titulo, 0);
	}
	public static void erroCpfVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o CPF, campo obrigatório", titulo, 0);
	}
	public static void erroRgVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o RG, campo obrigatório", titulo, 0);
	}
	public static void erroEmailVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o e-mail, campo obrigatório", titulo, 0);
	}
	public static void erroDtNascimentoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a Data de Nascimento, campo obrigatório", titulo, 0);
	}
	public static void erroCelularVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o Celular, campo obrigatório", titulo, 0);
	}
	public static void erroTelefoneVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o Telefone, campo obrigatório", titulo, 0);
	}
	public static void erroCepVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o CEP, campo obrigatório", titulo, 0);
	}
	public static void erroLogradouroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o logradouro, campo obrigatório", titulo, 0);
	}
	public static void erroEnderecoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o endereço, campo obrigatório", titulo, 0);
	}
	public static void erroNumeroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o número, campo obrigatório", titulo, 0);
	}
	public static void erroBairroVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o bairro, campo obrigatório", titulo, 0);
	}

	
	// CAMPO INVALIDO
	public static void erroCodigoInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um código válido", titulo, 0);
	}
	public static void erroIdadeInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe uma idade válida", titulo, 0);
	}
	public static void erroSalarioInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um salário válido", titulo, 0);
	}
	public static void erroValorInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um valor válido", titulo, 0);
	}
	public static void erroValorPromocaoInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um valor promocional válido", titulo, 0);
	}
	public static void erroNumeroInvalido(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe um número válido", titulo, 0);
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
		JOptionPane.showMessageDialog(null, "Locação salva com sucesso!", titulo, 1);
	}
}

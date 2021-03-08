package util;

import javax.swing.JOptionPane;

/**
 * Classe para armazenar as mensagens utilizadas no projeto
 * 
 * @author �der Diego de Sousa
 * @since 8 de mar. de 2021
 * @version 1.0
 */
public class Mensagem {

	// MENSAGENS DE ERRO
	public static void erroLerArquivo(String titulo) {
		JOptionPane.showMessageDialog(null, "Erro ao ler arquivo de estados!", titulo, 0);
	}
	public static void erroCodigoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o c�digo, campo obrigat�rio", titulo, 0);
	}
	public static void erroNomeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o nome, campo obrigat�rio", titulo, 0);
	}
	public static void erroAreaVendaVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a �rea de venda, campo obrigat�rio", titulo, 0);
	}
	public static void erroCidadeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a cidade, campo obrigat�rio", titulo, 0);
	}
	public static void erroEstadoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o estado, campo obrigat�rio", titulo, 0);
	}
	public static void erroSexoVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o sexo, campo obrigat�rio", titulo, 0);
	}
	public static void erroIdadeVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe a idade, campo obrigat�rio", titulo, 0);
	}
	public static void erroSalarioVazio(String titulo) {
		JOptionPane.showMessageDialog(null, "Informe o sal�rio, campo obrigat�rio", titulo, 0);
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
		JOptionPane.showMessageDialog(null, "Loca��o salva com sucesso!", titulo, 1);
	}
}

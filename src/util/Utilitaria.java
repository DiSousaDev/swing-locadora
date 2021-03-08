package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe para gerenciar os metodos utilit�rios do sistema
 * 
 * @author �der Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class Utilitaria {

	public static String[] getEstados() {
		String[] estados = { "-Selecione UF-", "Acre", "Alagoas", "Amap�", "Amazonas", "Bahia", "Cear�",
				"Distrito Federal", "Esp�rito Santo", "Goi�s", "Maranh�o", "Mato Grosso", "Mato Grosso do Sul",
				"Minas Gerais", "Par�", "Para�ba", "Paran�", "Pernambuco", "Piau�", "Rio de Janeiro",
				"Rio Grande do Norte", "Rio Grande do Sul", "Rond�nia", "Roraima", "Santa Catarina", "S�o Paulo",
				"Sergipe", "Tocantins" };
		return estados;
	}

	// metodo para ler um arquivo recebendo seu nome
	public static String lerArquivo(String nome) {

		String msg = null;

		try {
			// declara um atributo para ler o arquivo e informar seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));

			// la�o de repeti��o para leitura do arquivo com o comando hasNext
			while (leitor.hasNext()) {
				// exibindo no console o conteuco encontrado no arquivo txt
				msg = leitor.next();
			}

			return msg;

		} catch (FileNotFoundException e) {
			// exibindo mensagem de erro ao usua�rio
			JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado", "Ler Arquivo", 0);
			// exibe erro no console
			e.printStackTrace();
		}
		return msg;
	}

}
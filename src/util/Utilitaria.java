package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe para gerenciar os metodos utilitários do sistema
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class Utilitaria {

	// metodo para ler um arquivo recebendo seu nome
	public static String lerArquivo(String nome) {

		String msg = null;

		try {
			// declara um atributo para ler o arquivo e informar seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));

			// laço de repetição para leitura do arquivo com o comando hasNext
			while (leitor.hasNext()) {
				// exibindo no console o conteuco encontrado no arquivo txt
				msg = leitor.next();
			}

			return msg;

		} catch (FileNotFoundException e) {
			// exibindo mensagem de erro ao usuaário
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Ler Arquivo", 0);
			// exibe erro no console
			e.printStackTrace();
		}
		return msg;
	}

}
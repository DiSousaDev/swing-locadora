package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Data;

/**
 * Classe para gerenciar os metodos utilit?rios do sistema
 * 
 * @author ?der Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class Util {

	// metodo para ler um arquivo recebendo seu nome
	public static String lerArquivo(String nome) {

		String msg = null;

		try {
			// declara um atributo para ler o arquivo e informar seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));

			// la?o de repeti??o para leitura do arquivo com o comando hasNext
			while (leitor.hasNext()) {
				// exibindo no console o conteuco encontrado no arquivo txt
				msg = leitor.next();
			}

			return msg;

		} catch (FileNotFoundException e) {
			// exibindo mensagem de erro ao usua?rio
			JOptionPane.showMessageDialog(null, "Arquivo n?o encontrado", "Ler Arquivo", 0);
			// exibe erro no console
			e.printStackTrace();
		}
		return msg;
	}

	/*
	 * m?todo para converter uma String em inteiro
	 */
	public static Integer getInt(String args) {
		return Integer.parseInt(args);
	}

	/*
	 * m?todo para converter uma String em Double
	 */
	public static Double getDouble(String args) {
		return Double.parseDouble(args);
	}

	/*
	 * m?todo para converter uma String em Boolean
	 */
	public static Boolean getBoolean(String args) {
		return args.equals("true") ? true : false;
	}

	/*
	 * m?todo para converter um Boolean em String
	 */
	public static String getBooleanToString(Boolean args) {
		return args == true ? "Sim" : "N?o";
	}

	/*
	 * m?todo para converter uma String em um objeto Data
	 */
	public static Data getData(String args) {
		String aux[] = args.split("/");
		return new Data(getInt(aux[0]), getInt(aux[1]), getInt(aux[2]));
	}

	// m?todo para retornar uma String de sexo
	public static String getSexoString(Character args) {
		return args.toString().equals("M") ? "Masculino" : "Feminino";
	}

}
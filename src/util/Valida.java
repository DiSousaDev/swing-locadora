package util;

/**
 * Classe para armazenar os métodos de validação do projeto
 * @author Éder Diego de Sousa
 * @since 8 de mar. de 2021
 * @version 1.0
 */
public class Valida {

	/*
	 * método para verificar se o campo é diferente de vazio ou nulo
	 */
	public static boolean isEmptyOrNull(String args) {
		return args.trim().equals("") || args.trim() == null;
	}
	
	/*
	 * método para verificar valor inteiro
	 */
	public static boolean isInteger(String args) {
		try {
			Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/*
	 * método para verificar valor double
	 */
	public static boolean isDouble(String args) {
		try {
			Double.parseDouble(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}

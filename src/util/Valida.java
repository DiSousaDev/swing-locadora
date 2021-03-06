package util;

/**
 * Classe para armazenar os m?todos de valida??o do projeto
 * @author ?der Diego de Sousa
 * @since 8 de mar. de 2021
 * @version 1.0
 */
public class Valida {

	/*
	 * m?todo para verificar se o campo ? diferente de vazio ou nulo
	 */
	public static boolean isEmptyOrNull(String args) {
		return args.trim().equals("") || args.trim() == null;
	}
	
	/*
	 * m?todo para verificar valor inteiro
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
	 * m?todo para verificar valor double
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

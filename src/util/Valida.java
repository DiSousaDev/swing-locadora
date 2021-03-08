package util;

/**
 * Classe para armazenar os m�todos de valida��o do projeto
 * @author �der Diego de Sousa
 * @since 8 de mar. de 2021
 * @version 1.0
 */
public class Valida {

	/*
	 * m�todo para verificar se o campo � diferente de vazio ou nulo
	 */
	public static boolean isEmptyOrNull(String args) {
		return args.trim().equals("") || args.trim() == null;
	}
	
}

package controller;

import util.Tema;
import view.MenuPrincipalView;

/**
 * Classe principal para executar o projeto
 * @author Éder Diego de Sousa
 * @since 8 de mar. de 2021
 * @version 1.0
 */
public class Main {

	/**
	 * método principal de execução do projeto
	 */
	public static void main(String[] args) {

		Tema.setTheme(Tema.getTheme());
		new MenuPrincipalView().iniciaGui();
		
	}

}

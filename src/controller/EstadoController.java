package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import model.Estado;
import util.Mensagem;
import util.Titulo;

/**
 * Classe para controlar os m?todos do objeto estado
 * 
 * @author ?der Diego de Sousa
 * @since 8 de mar. de 2021
 * @version 1.0
 */
public class EstadoController {

	// declarando nome do arquivo txt utilizado
	private String arquivo = "estados.txt";

	/*
	 * m?todo respons?vel por retornar uma lista de estados
	 */
	public ArrayList<Estado> getEstados() {
		// objeto de lista para retornar o m?todo
		ArrayList<Estado> estados = buscarTodos();
		return estados;
	}

	/*
	 * m?todo para ler o arquivo de estados
	 */
	private ArrayList<Estado> buscarTodos() {
		// objeto de lista para retornar o m?todo
		ArrayList<Estado> estados = new ArrayList<Estado>();

		try {
			// Classe Scanner auxiliar para ler o arquivo
			Scanner scan = new Scanner(new FileReader(arquivo));

			// la?o de repeti?ao para ler as linhas do arquivo
			while (scan.hasNext()) {
				Estado estado = getEstado(scan.nextLine());
				estados.add(estado);
			}
		} catch (FileNotFoundException e) {
			Mensagem.erroLerArquivoEstado(Titulo.cadastroCliente);
			e.printStackTrace();
		}
		return estados;
	}

	// m?todo para retornar um objeto do tipo estado
	private Estado getEstado(String linha) {
		String[] dado = linha.split(";"); // separando a linha por ;
		return new Estado(dado[1], dado[0]); // retornando o objeto estado
	}
	
}

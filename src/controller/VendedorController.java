package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.Vendedor;
import util.Mensagem;
import util.Titulo;
import util.Util;

/**
 * Classe para controlar os processos de gravaçã e leitura da tela de vendedor
 * 
 * @author Éder Diego de Sousa
 * @since 9 de mar. de 2021
 * @version 1.0
 */
public class VendedorController {

	// declarando nome do arquivo txt utilizado
	private String arquivo = "vendedor.txt";

	/*
	 * método para inserir registros no arquivo txt
	 */
	public void gravarTxtVendedor(Vendedor vendedor) {

		// classe auxiliar para carregar arquivo existente ou criar um novo arquivo
		File file = new File(arquivo);

		try {
			// classe auxiliar para gerar um objeto de memória para gravação do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(file, true);

			// classe auxiliar para gerar o arquivo e seu conteúdo
			PrintStream gravador = new PrintStream(arquivoOutput);

			// gravando o conteúdo no arquivo
			gravador.print(vendedor.getCodigo() + ";");
			gravador.print(vendedor.getNome() + ";");
			gravador.print(vendedor.getAreaVenda() + ";");
			gravador.print(vendedor.getCidade() + ";");
			gravador.print(vendedor.getEstado() + ";");
			gravador.print(vendedor.getSexo() + ";");
			gravador.print(vendedor.getIdade() + ";");
			gravador.print(vendedor.getSalario() + "\n");

			// fechando o processo gravação
			gravador.close();
			arquivoOutput.close();

		} catch (IOException e) {
			Mensagem.erroGravarArquivoVendedor(Titulo.cadastroVendedor);
			e.printStackTrace();
		}

	}

	/*
	 * método para retornar uma lista de vendedorores
	 */
	public ArrayList<Vendedor> getVendedores() {
		ArrayList<Vendedor> vendedores = buscarTodos();
		return vendedores;
	}

	/*
	 * método para retornar uma lista com todos os registros
	 */
	private ArrayList<Vendedor> buscarTodos() {
		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
		try {
			// classe auxiliar para ler o arquivo
			Scanner leitor = new Scanner(new FileReader(arquivo));
			// laço para ler o arquivo
			while (leitor.hasNext()) {
				// objeto auxiliar para retornar o vendedor
				Vendedor vendedor = getVendedor(leitor.nextLine());
				// atribuindo vendedor a lista
				vendedores.add(vendedor);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return vendedores;
	}

	/*
	 * metodo para retornar um vendedor do arquivo
	 */
	private Vendedor getVendedor(String args) {

		Vendedor vendedor = new Vendedor();
		String aux[] = args.split(";");
		// valorando objeto vendedor
		vendedor.setCodigo(Util.getInt(aux[0]));
		vendedor.setNome(aux[1]);
		vendedor.setAreaVenda(aux[2]);
		vendedor.setCidade(aux[3]);
		vendedor.setEstado(aux[4]);
		vendedor.setSexo(aux[5].charAt(0));
		vendedor.setIdade(Util.getInt(aux[6]));
		vendedor.setSalario(Util.getDouble(aux[7]));
		return vendedor;
	}
}

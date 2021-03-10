package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Endereco;
import util.Mensagem;
import util.Titulo;
import util.Util;

/**
 * Classe para controlar os processos de gravação e leitura da tela de cliente
 * 
 * @author Éder Diego de Sousa
 * @since 9 de mar. de 2021
 * @version 1.0
 */
public class ClienteController {

	// declarando nome do arquivo txt utilizado
	private String arquivo = "cliente.txt";

	/*
	 * método para inserir registros no arquivo txt
	 */
	public void gravarTxtCliente(Cliente cliente) {

		// classe auxiliar para carregar arquivo existente ou criar um novo arquivo
		File file = new File(arquivo);

		try {
			// classe auxiliar para gerar um objeto de memória para gravação do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(file, true);

			// classe auxiliar para gerar o arquivo e seu conteúdo
			PrintStream gravador = new PrintStream(arquivoOutput);

			// gravando o conteúdo no arquivo
			gravador.print(cliente.getCodigo() + ";");
			gravador.print(cliente.getNome() + ";");
			gravador.print(cliente.getCpf() + ";");
			gravador.print(cliente.getRg() + ";");
			gravador.print(cliente.getEmail() + ";");
			gravador.print(cliente.getDataNascimento() + ";");
			gravador.print(cliente.getCelular() + ";");
			gravador.print(cliente.getTelefone() + ";");
			gravador.print(cliente.getIdade() + ";");
			gravador.print(cliente.getSexo() + ";");
			gravador.print(cliente.getEndereco().getCep() + ";");
			gravador.print(cliente.getEndereco().getLogradouro() + ";");
			gravador.print(cliente.getEndereco().getEndereco() + ";");
			gravador.print(cliente.getEndereco().getNumero() + ";");
			gravador.print(cliente.getEndereco().getComplemento() + ";");
			gravador.print(cliente.getEndereco().getBairro() + ";");
			gravador.print(cliente.getEndereco().getCidade() + ";");
			gravador.print(cliente.getEndereco().getEstado() + "\n");

			// fechando o processo gravação
			gravador.close();
			arquivoOutput.close();

		} catch (IOException e) {
			Mensagem.erroGravarArquivoFilme(Titulo.cadastroFilme);
			e.printStackTrace();
		}
	}

	/*
	 * método para retornar uma lista de clientes
	 */
	public ArrayList<Cliente> getClientes() {
		ArrayList<Cliente> clientes = buscarTodos();
		return clientes;
	}

	/*
	 * método para retornar uma lista com todos os registros
	 */
	private ArrayList<Cliente> buscarTodos() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		try {
			// classe auxiliar para ler o arquivo
			Scanner leitor = new Scanner(new FileReader(arquivo));
			// laço para ler o arquivo
			while (leitor.hasNext()) {
				// objeto auxiliar para retornar o filme
				Cliente cliente = getCliente(leitor.nextLine());
				// atribuindo filme a lista
				clientes.add(cliente);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	/*
	 * metodo para retornar um cliente do arquivo
	 */
	private Cliente getCliente(String args) {
		// capturando os valores da linha
		String aux[] = args.split(";");
		
		Cliente cliente = new Cliente();
		// valorando objeto cliente
		cliente.setCodigo(Util.getInt(aux[0]));
		cliente.setNome(aux[1]);
		cliente.setCpf(aux[2]);
		cliente.setRg(aux[3]);
		cliente.setEmail(aux[4]);
		cliente.setDataNascimento(Util.getData(aux[5]));
		cliente.setCelular(aux[6]);
		cliente.setTelefone(aux[7]);
		cliente.setIdade(Util.getInt(aux[8]));
		cliente.setSexo(aux[9].charAt(0));
		// valorando objeto endereço para associar ao cliente
		Endereco endereco = new Endereco();
		endereco.setCodigo(Util.getInt(aux[0]));
		endereco.setCep(aux[10]);
		endereco.setLogradouro(aux[11]);
		endereco.setEndereco(aux[12]);
		endereco.setNumero(Util.getInt(aux[13]));
		endereco.setComplemento(aux[14]);
		endereco.setBairro(aux[15]);
		endereco.setCidade(aux[16]);
		endereco.setEstado(aux[17]);
		// associando o endereço ai cliente
		cliente.setEndereco(endereco);
		
		return cliente;
	}

}

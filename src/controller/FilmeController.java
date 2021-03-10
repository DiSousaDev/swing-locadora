package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.Filme;
import util.Mensagem;
import util.Titulo;
import util.Util;

/*
 * Classe para controlar os processos de gravação e leitura da tela de filme
 * @author Éder Diego de Sousa
 * @since 9 de mar. de 2021
 * @version 1.0
 */
public class FilmeController {
	
	// declarando nome do arquivo txt utilizado
		private String arquivo = "filme.txt";

		/*
		 * método para inserir registros no arquivo txt
		 */
		public void gravarTxtFilme(Filme filme) {

			// classe auxiliar para carregar arquivo existente ou criar um novo arquivo
			File file = new File(arquivo);

			try {
				// classe auxiliar para gerar um objeto de memória para gravação do arquivo
				FileOutputStream arquivoOutput = new FileOutputStream(file, true);

				// classe auxiliar para gerar o arquivo e seu conteúdo
				PrintStream gravador = new PrintStream(arquivoOutput);

				// gravando o conteúdo no arquivo
				gravador.print(filme.getCodigo() + ";");
				gravador.print(filme.getNome() + ";");
				gravador.print(filme.getValor() + ";");
				gravador.print(filme.isDisponivel() + ";");
				gravador.print(filme.isPromocao() + ";");
				gravador.print(filme.getValorPromocao() + ";");
				gravador.print(filme.getGenero() + "\n");
								
				// fechando o processo gravação
				gravador.close();
				arquivoOutput.close();

			} catch (IOException e) {
				Mensagem.erroGravarArquivoFilme(Titulo.cadastroFilme);
				e.printStackTrace();
			}
		}

		/*
		 * método para retornar uma lista de filmes
		 */
		public ArrayList<Filme> getFilmes() {
			ArrayList<Filme> filmes = buscarTodos();
			return filmes;
		}

		/*
		 * método para retornar uma lista com todos os registros
		 */
		private ArrayList<Filme> buscarTodos() {
			ArrayList<Filme> filmes = new ArrayList<Filme>();
			try {
				// classe auxiliar para ler o arquivo
				Scanner leitor = new Scanner(new FileReader(arquivo));
				// laço para ler o arquivo
				while (leitor.hasNext()) {
					// objeto auxiliar para retornar o filme
					Filme filme = getFilme(leitor.nextLine());
					// atribuindo filme a lista
					filmes.add(filme);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return filmes;
		}

		/*
		 * metodo para retornar um vendedor do arquivo
		 */
		private Filme getFilme(String args) {

			Filme filme = new Filme();
			String aux[] = args.split(";");
			// valorando objeto vendedor
			filme.setCodigo(Util.getInt(aux[0]));
			filme.setNome(aux[1]);
			filme.setValor(Util.getDouble(aux[2]));
			filme.setDisponivel(Util.getBoolean(aux[3]));
			filme.setPromocao(Util.getBoolean(aux[4]));
			filme.setValorPromocao(Util.getDouble(aux[5]));
			filme.setGenero(aux[6]);
			return filme;
		}

}

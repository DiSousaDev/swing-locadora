package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ClienteController;
import model.Cliente;
import util.Util;

/**
 * Classe para consultar e exibir as informa??es dos Clientes cadastrados no
 * sistema.
 * 
 * @author ?der Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class ConsultarClienteView {

	// declarando os atributos
	private JFrame janela;
	// labels para exibir informa??es
	// declarando o Scroll Auxiliar pra exibir os dados da tabela
	private JScrollPane scroll;
	// declarando a tabela para armazenar os dados imputados pelo usuario
	private JTable tabela;
	// vetor auxiliar pra armazenar os nomes das colunas
	private String colunas[] = { "Nome", "Sexo", "Idade", "Cidade", "Celular" };
	// matriz auxliar para armazenar os dados exibidos na tabela.
	private String linhas[][] = {};// duas colunas
	// botao para verificar a acao de clique
	private JButton btSair;
	// componente para organiza??o
	private JPanel painel = new JPanel();

	/*
	 * m?todo para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configuracoes do frame
		 */
		janela = new JFrame();
		// titutlo da tela
		janela.setTitle("CONSULTA DE CLIENTES CADASTRADOS");
		// tamanho da tela larg/ alt
		janela.setSize(640, 420);
		// centralizando a janela
		janela.setLocationRelativeTo(null);

		/*
		 * configurando a tabela
		 */
		// toda vez que for utilizar precisa definir o modelo(linhas x colunas)
		// primeiro
		// definir o modelo utilizado na tabela - qtde de linhas e colunas.
		DefaultTableModel modelo = new DefaultTableModel(linhas, colunas);
		tabela = new JTable(modelo);

		/*
		 * Configura??es do jScrolPane
		 */
		scroll = new JScrollPane(tabela);
		// configura o local de exibi??o do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);// sempre vertical
		// configurar a posi??o e tamanho
		scroll.setBounds(2, 2, 620, 330);

		/*
		 * configura??es do JButton
		 */
		btSair = new JButton();
		// configurando texto botao
		btSair.setText("SAIR");
		// difinindo posi??o e tamanho
		btSair.setBounds(255, 340, 130, 30);
		// configurando a??o do bot?o
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela.dispose();
			}
		});

		/*
		 * configura??es do painel da tela JPanel
		 */
		painel = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painel.setLayout(null);
		// adicionando os componentes no painel
		painel.add(scroll);
		painel.add(btSair);
		
		// inserindo valores na tabela
		carregarTabela();

		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

	/*
	 * M?todo para inserir valores na tabelas com os vendedores cadastrados no
	 * arquivo TXT
	 */
	public void carregarTabela() {
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		// laco para preencher a tabela
		for (Cliente cliente : new ClienteController().getClientes()) {

			// adicionando linhas na tabela
			modelo.addRow(new Object[] { 
					cliente.getNome(), 
					Util.getSexoString(cliente.getSexo()),
					cliente.getIdade() + "", 
					cliente.getEndereco().getCidade(), 
					cliente.getCelular() 
					});
		}
	}
}

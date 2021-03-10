package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.VendedorController;
import model.Vendedor;

/**
 * Classe para consultar e exibir as informações dos vendedores cadastrados no sistema.
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class ConsultarVendedorView {

	// declarando os atributos
	private JFrame janela;
	// labels para exibir informações
	// declarando o Scroll Auxiliar pra exibir os dados da tabela
	private JScrollPane scroll;
	// declarando a tabela para armazenar os dados imputados pelo usuario
	private JTable tabela;
	// vetor auxiliar pra armazenar os nomes das colunas
	private String colunas[] = { "Nome", "Area de Venda", "Cidade", "Estado", "Sexo", "Idade", "Salario" };
	// botao para verificar a acao de clique
	private JButton btSair;
	// componente para organização
	private JPanel painel = new JPanel();

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configuracoes do frame
		 */
		janela = new JFrame();
		// titutlo da tela
		janela.setTitle("CONSULTA DE VENDEDORES");
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
		DefaultTableModel modelo = new DefaultTableModel(null, colunas);
		tabela = new JTable(modelo);
		
		/*
		 * Configurações do jScrolPane
		 */
		scroll = new JScrollPane(tabela);
		// configura o local de exibição do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);// sempre vertical
		// configurar a posição e tamanho
		scroll.setBounds(2, 2, 620, 330);
		
		/*
		 * configurações do JButton
		 */
		btSair = new JButton();
		// configurando texto botao
		btSair.setText("SAIR");
		// difinindo posição e tamanho
		btSair.setBounds(255, 340, 130, 30);
		// configurando ação do botão
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela.dispose();
			}
		});

		/*
		 * configurações do painel da tela JPanel
		 */
		painel = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painel.setLayout(null);
		// adicionando os componentes no painel
		painel.add(scroll);
		painel.add(btSair);

		// exibindo dados na tabela
		carregarTabela();
		
		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}
	
	/*
	 * Método para inserir valores na tabelas com os vendedores cadastrados no arquivo TXT
	 */
	public void carregarTabela() {
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();		
		// laco para preencher a tabela
		for (Vendedor vendedor :  new VendedorController().getVendedores()) {
			
			// adicionando linhas na tabela
			modelo.addRow(new Object[] {
					vendedor.getNome(), 
					vendedor.getAreaVenda(),
					vendedor.getCidade(),
					vendedor.getEstado(),
					vendedor.getSexo() + "",
					vendedor.getIdade() + "",
					vendedor.getSalario() + ""
					});
		}
	}
	
}

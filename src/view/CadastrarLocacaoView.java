package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
  * Classe para receber, armazenar e exibir os dados da tela de Cadastro de Locações
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarLocacaoView {

	// declarando os atributos
	private JFrame janela;
	// labels para exibir informações
	private JLabel lbNomeVendedor, lbNomeFilme, lbFormaPagamento, lbValorTotal, lbValorPago, lbTroco;
	// declarando componente comboBox
	private JComboBox<String> cbxVendedores, cbxFilmes;
	// declarando componentes JTextField
	private JTextField tfValorTotal, tfValorPago, tfTroco;
	// vetor para armaznar os valores
	private String vendedores[] = { "-Selecione um Vendedor-" };
	private String filmes[] = { "-Selecione um Filme-" };
	// declarando o Scroll Auxiliar pra exibir os dados da tabela
	private JScrollPane scroll;
	// declarando a tabela para armazenar os dados imputados pelo usuario
	private JTable tabela;
	// vetor auxiliar pra armazenar os nomes das colunas
	private String colunas[] = { "Códgo", "Nome", "Valor", "Disponível", "Promoção", "Valor Promocional" };
	// matriz auxliar para armazenar os dados exibidos na tabela.
	private String linhas[][] = { };// duas colunas
	// declarando componentes radio button
	private JRadioButton rbDinheiro, rbCheque, rbDebito, rbCredito;
	// componente responsavel por gerenciar os JRadioButton
	private ButtonGroup grpFormaPagamento;
	// botao para verificar a acao de clique
	private JButton btIncluir, btSalvar, btCancelar;
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
		janela.setTitle("LOCAÇÃO DE FILME");
		// tamanho da tela larg/ alt
		janela.setSize(640, 390);
		// centralizando a janela
		janela.setLocationRelativeTo(null);

		/*
		 * Configurações da jlabel = rotulo auxiliar
		 */
		lbNomeVendedor = new JLabel();
		lbNomeFilme = new JLabel();
		lbFormaPagamento = new JLabel();
		lbValorTotal = new JLabel();
		lbValorPago = new JLabel();
		lbTroco = new JLabel();

		// configurando o texto
		lbNomeVendedor.setText("Nome do Vendedor:");
		lbNomeFilme.setText("Nome do Filme:");
		lbFormaPagamento.setText("Forma de Pagamento:");
		lbValorTotal.setText("Valor Total:");
		lbValorPago.setText("Valor Pago:");
		lbTroco.setText("Troco");
		// configurando posição e tamanho
		lbNomeVendedor.setBounds(10, 20, 110, 20);
		lbNomeFilme.setBounds(10, 55, 110, 20);
		lbFormaPagamento.setBounds(10, 220, 130, 20);
		lbValorTotal.setBounds(370, 220, 80, 20);
		lbValorPago.setBounds(370, 240, 80, 20);
		lbTroco.setBounds(370, 260, 80, 20);

		/*
		 * configuração da JComboBox
		 */
		cbxVendedores = new JComboBox<String>(vendedores);
		cbxFilmes = new JComboBox<String>(filmes);
		// configurando posição e tamanho
		cbxVendedores.setBounds(150, 18, 450, 25);
		cbxFilmes.setBounds(150, 53, 310, 25);

		/*
		 * configurando a tabela
		 */
		// toda vez que for utilizar precisa definir o modelo(linhas x colunas)
		// primeiro
		// definir o modelo utilizado na tabela - qtde de linhas e colunas.
		DefaultTableModel modelo = new DefaultTableModel(linhas, colunas);
		tabela = new JTable(modelo);
		
		/*
		 * Configurações do jScrolPane
		 */
		scroll = new JScrollPane(tabela);
		// configura o local de exibição do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);// sempre vertical
		// configurar a posição e tamanho
		scroll.setBounds(0, 95, 624, 120);

		/*
		 * configuração dos radio button
		 */
		rbDinheiro = new JRadioButton();
		rbCheque = new JRadioButton();
		rbDebito = new JRadioButton();
		rbCredito = new JRadioButton();
		// configurando o texto do componente
		rbDinheiro.setText("Dinheiro");
		rbCheque.setText("Chegue");
		rbDebito.setText("Débito");
		rbCredito.setText("Crédito");
		// configurando posição e tamanho
		rbDinheiro.setBounds(160, 220, 130, 20);
		rbCheque.setBounds(160, 240, 130, 20);
		rbDebito.setBounds(160, 260, 130, 20);
		rbCredito.setBounds(160, 280, 130, 20);		

		/*
		 * configurações do ButtonGroup
		 */
		grpFormaPagamento = new ButtonGroup();
		grpFormaPagamento.add(rbDinheiro);
		grpFormaPagamento.add(rbCheque);
		grpFormaPagamento.add(rbDebito);
		grpFormaPagamento.add(rbCredito);
		
		/*
		 * configurações dos JTextField
		 */
		tfValorTotal = new JTextField();
		tfValorPago = new JTextField();
		tfTroco = new JTextField();
		// configurando posição e tamanho
		tfValorTotal.setBounds(450, 218, 120, 25);
		tfValorPago.setBounds(450, 238, 120, 25);
		tfTroco.setBounds(450, 258, 120, 25);
		
		/*
		 * configurações do JButton
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		btIncluir = new JButton();
		// configurando texto botao
		btSalvar.setText("SALVAR");
		btCancelar.setText("CANCELAR");
		btIncluir.setText("INCLUIR");
		btSalvar.setBounds(220, 310, 120, 30);
		btCancelar.setBounds(350, 310, 120, 30);
		btIncluir.setBounds(480, 53, 120, 25);
		// configurando ação do botão
		btCancelar.addActionListener(new ActionListener() {

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
		painel.add(lbNomeVendedor);
		painel.add(lbNomeFilme);
		painel.add(cbxVendedores);
		painel.add(cbxFilmes);
		painel.add(btIncluir);
		painel.add(scroll);
		painel.add(lbFormaPagamento);
		painel.add(rbDinheiro);
		painel.add(rbCheque);
		painel.add(rbDebito);
		painel.add(rbCredito);
		painel.add(lbValorTotal);
		painel.add(lbValorPago);
		painel.add(lbTroco);
		painel.add(tfValorTotal);
		painel.add(tfValorPago);
		painel.add(tfTroco);
		painel.add(btSalvar);
		painel.add(btCancelar);

		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setAlwaysOnTop(true);

	}

}

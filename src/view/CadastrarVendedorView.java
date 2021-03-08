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
import javax.swing.JTextField;

import util.Utilitaria;

/**
  * Classe para receber, armazenar e exibir os dados da tela de Cadastro de Vendedores
 * 
 * @author �der Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarVendedorView {

	// declarando os atributos
	private JFrame janela;
	// labels para exibir informa��es
	private JLabel lbCodigo, lbNome, lbAreaDeVenda, lbCidade, lbEstado, lbSexo, lbIdade, lbSalario;
	// declarando componentes JTextField
	private JTextField tfCodigo, tfNome, tfAreaDeVenda, tfCidade, tfIdade, tfSalario;
	// declarando componente comboBox
	private JComboBox<String> cbxEstados;
	// vetor para armaznar os estados
	private String estados[] = Utilitaria.getEstados();
	// declarando componentes radio button
	private JRadioButton rbMasculino, rbFeminimo;
	// componente responsavel por gerenciar os JRadioButton
	private ButtonGroup grpSexo;
	// botao para verificar a acao de clique
	private JButton btSalvar, btCancelar;
	// componente para organiza��o
	private JPanel painel = new JPanel();

	/*
	 * m�todo para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configuracoes do frame
		 */
		janela = new JFrame();
		// titutlo da tela
		janela.setTitle("CADASTRO DE VENDEDOR");
		// tamanho da tela larg/ alt
		janela.setSize(570, 380);
		// centralizando a janela
		janela.setLocationRelativeTo(null);

		/*
		 * Configura��es da jlabel = rotulo auxiliar
		 */
		lbCodigo = new JLabel();
		lbNome = new JLabel();
		lbAreaDeVenda = new JLabel();
		lbCidade = new JLabel();
		lbEstado = new JLabel();
		lbSexo = new JLabel();
		lbIdade = new JLabel();
		lbSalario = new JLabel();
	
		// configurando o texto
		lbCodigo.setText("C�digo:");
		lbNome.setText("Nome:");
		lbAreaDeVenda.setText("Area de Venda:");
		lbCidade.setText("Cidade:");
		lbEstado.setText("Estado:");
		lbSexo.setText("Sexo:");
		lbIdade.setText("Idade:");
		lbSalario.setText("Salario:");
		// configurando posi��o e tamanho
		lbCodigo.setBounds(20, 20, 100, 20);
		lbNome.setBounds(20, 50, 100, 20);
		lbAreaDeVenda.setBounds(20, 80, 100, 20);
		lbCidade.setBounds(20, 110, 100, 20);
		lbEstado.setBounds(20, 140, 100, 20);
		lbSexo.setBounds(20, 170, 100, 20);
		lbIdade.setBounds(20, 200, 100, 20);
		lbSalario.setBounds(20, 230, 100, 20);

		/*
		 * configura��es dos JTextField
		 */
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfAreaDeVenda = new JTextField();
		tfCidade = new JTextField();
		tfIdade = new JTextField();
		tfSalario = new JTextField();
		// configurando posi��o e tamanho
		tfCodigo.setBounds(120, 18, 400, 25);
		tfNome.setBounds(120, 48, 400, 25);
		tfAreaDeVenda.setBounds(120, 78, 400, 25);
		tfCidade.setBounds(120, 108, 400, 25);
		tfIdade.setBounds(120, 198, 400, 25);
		tfSalario.setBounds(120, 228, 400, 25);

		/*
		 * configura��o da JComboBox
		 */
		cbxEstados = new JComboBox<String>(estados);
		cbxEstados.setBounds(120, 138, 300, 25);;

		/*
		 * configura��o dos radio button
		 */
		rbMasculino = new JRadioButton();
		rbFeminimo = new JRadioButton();
		// configurando o texto do componente
		rbMasculino.setText("Masculino");
		rbFeminimo.setText("Feminino");
		// configurando posi��o e tamanho
		rbMasculino.setBounds(120, 168, 80, 25);
		rbFeminimo.setBounds(210, 168, 80, 25);

		/*
		 * configura��es do ButtonGroup
		 */
		grpSexo = new ButtonGroup();
		grpSexo.add(rbMasculino);
		grpSexo.add(rbFeminimo);

		/*
		 * configura��es do JButton
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		// configurando texto botao
		btSalvar.setText("SALVAR");
		btCancelar.setText("CANCELAR");
		btSalvar.setBounds(120, 268, 140, 30);
		btCancelar.setBounds(280, 268, 140, 30);
		// configurando a��o do bot�o
		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela.dispose();
			}
		});

		/*
		 * configura��es do painel da tela JPanel
		 */
		painel = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painel.setLayout(null);
		// adicionando os componentes no painel
		painel.add(lbCodigo);
		painel.add(lbNome);
		painel.add(lbAreaDeVenda);
		painel.add(lbCidade);
		painel.add(lbEstado);
		painel.add(lbSexo);
		painel.add(lbIdade);
		painel.add(lbSalario);		
		painel.add(tfCodigo);
		painel.add(tfNome);
		painel.add(tfAreaDeVenda);
		painel.add(tfCidade);
		painel.add(tfIdade);
		painel.add(tfSalario);
		painel.add(cbxEstados);
		painel.add(rbMasculino);
		painel.add(rbFeminimo);
		painel.add(btSalvar);
		painel.add(btCancelar);

		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setAlwaysOnTop(true);

	}

}
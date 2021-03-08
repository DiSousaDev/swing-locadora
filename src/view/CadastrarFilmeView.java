package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Classe para receber, armazenar e exibir os dados da tela de Cadastro de Filmes
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarFilmeView {

	// declarando os atributos
	private JFrame janela;
	// labels para exibir informações
	private JLabel lbCodigo, lbNome, lbValor, lbDisponivel, lbPromocao, lbValorPromocao, lbGenero;
	// declarando componentes JTextField
	private JTextField tfCodigo, tfNome, tfValor, tfValorPromocao;
	// declarando componentes radio button
	private JRadioButton rbDisponivelSim, rbDisponivelNao, rbPromocaoSim, rbPromocaoNao;
	// componente responsavel por gerenciar os JRadioButton
	private ButtonGroup grpRadioDisponivel, grpRadioPromocao;
	// componentes checkbox
	private JCheckBox cbAacao, cbFiccao, cbTerror, cbComedia, cbOutro;
	// botao para verificar a acao de clique
	private JButton btSalvar, btCancelar;
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
		janela.setTitle("CADASTRO DE FILME");
		// tamanho da tela larg/ alt
		janela.setSize(570, 350);
		// centralizando a janela
		janela.setLocationRelativeTo(null);

		/*
		 * Configurações da jlabel = rotulo auxiliar
		 */
		lbCodigo = new JLabel();
		lbNome = new JLabel();
		lbValor = new JLabel();
		lbDisponivel = new JLabel();
		lbPromocao = new JLabel();
		lbValorPromocao = new JLabel();
		lbGenero = new JLabel();

		// configurando o texto
		lbCodigo.setText("Código:");
		lbNome.setText("Nome:");
		lbValor.setText("Valor:");
		lbDisponivel.setText("Disponível:");
		lbPromocao.setText("Promoção:");
		lbValorPromocao.setText("Valor Promoção:");
		lbGenero.setText("Gênero:");
		// configurando posição e tamanho
		lbCodigo.setBounds(20, 20, 100, 20);
		lbNome.setBounds(20, 50, 100, 20);
		lbValor.setBounds(20, 80, 100, 20);
		lbDisponivel.setBounds(20, 110, 100, 20);
		lbPromocao.setBounds(20, 140, 100, 20);
		lbValorPromocao.setBounds(20, 170, 100, 20);
		lbGenero.setBounds(20, 200, 100, 20);

		/*
		 * configurações dos JTextField
		 */
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfValor = new JTextField();
		tfValorPromocao = new JTextField();
		// configurando posição e tamanho

		tfCodigo.setBounds(120, 18, 400, 25);
		tfNome.setBounds(120, 48, 400, 25);
		tfValor.setBounds(120, 78, 400, 25);
		tfValorPromocao.setBounds(120, 168, 400, 25);

		/*
		 * configuração dos radio button
		 */
		rbDisponivelSim = new JRadioButton();
		rbDisponivelNao = new JRadioButton();
		rbPromocaoSim = new JRadioButton();
		rbPromocaoNao = new JRadioButton();
		// configurando o texto do componente
		rbDisponivelSim.setText("Sim");
		rbDisponivelNao.setText("Não");
		rbPromocaoSim.setText("Sim");
		rbPromocaoNao.setText("Não");
		// configurando posição e tamanho
		rbDisponivelSim.setBounds(120, 108, 50, 25);
		rbDisponivelNao.setBounds(180, 108, 50, 25);
		rbPromocaoSim.setBounds(120, 138, 50, 25);
		rbPromocaoNao.setBounds(180, 138, 50, 25);

		/*
		 * configurações do ButtonGroup
		 */
		grpRadioDisponivel = new ButtonGroup();
		grpRadioPromocao = new ButtonGroup();
		grpRadioDisponivel.add(rbDisponivelSim);
		grpRadioDisponivel.add(rbDisponivelNao);
		grpRadioPromocao.add(rbPromocaoSim);
		grpRadioPromocao.add(rbPromocaoNao);

		/*
		 * configurações do JCheckbox
		 */
		cbAacao = new JCheckBox();
		cbFiccao = new JCheckBox();
		cbTerror = new JCheckBox();
		cbComedia = new JCheckBox();
		cbOutro = new JCheckBox();
		// configurando o texto do componente
		cbAacao.setText("Ação");
		cbFiccao.setText("Ficção");
		cbTerror.setText("Terror");
		cbComedia.setText("Comédia");
		cbOutro.setText("Outro");
		// configurando posição e tamanho
		JPanel painelCheckbox = new JPanel(new GridLayout(1, 5, 0, 10));
		painelCheckbox.setBounds(120, 198, 380, 25);
		painelCheckbox.add(cbAacao);
		painelCheckbox.add(cbFiccao);
		painelCheckbox.add(cbTerror);
		painelCheckbox.add(cbComedia);
		painelCheckbox.add(cbOutro);

		/*
		 * configurações do JButton
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		// configurando texto botao
		btSalvar.setText("SALVAR");
		btCancelar.setText("CANCELAR");
		btSalvar.setBounds(120, 238, 140, 30);
		btCancelar.setBounds(280, 238, 140, 30);
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
		painel.add(lbCodigo);
		painel.add(lbNome);
		painel.add(lbValor);
		painel.add(lbDisponivel);
		painel.add(lbPromocao);
		painel.add(lbValorPromocao);
		painel.add(lbGenero);
		painel.add(tfCodigo);
		painel.add(tfNome);
		painel.add(tfValor);
		painel.add(tfValorPromocao);
		painel.add(rbDisponivelSim);
		painel.add(rbDisponivelNao);
		painel.add(rbPromocaoSim);
		painel.add(rbPromocaoNao);
		painel.add(painelCheckbox);
		painel.add(btSalvar);
		painel.add(btCancelar);

		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setAlwaysOnTop(true);

	}

}

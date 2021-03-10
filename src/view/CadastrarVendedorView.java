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

import controller.EstadoController;
import controller.VendedorController;
import model.Estado;
import model.Vendedor;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;

/**
 * Classe para receber, armazenar e exibir os dados da tela de Cadastro de
 * Vendedores
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarVendedorView {

	// declarando os atributos
	private JFrame janela;
	// labels para exibir informações
	private JLabel lbCodigo, lbNome, lbAreaDeVenda, lbCidade, lbEstado, lbSexo, lbIdade, lbSalario;
	// declarando componentes JTextField
	private JTextField tfCodigo, tfNome, tfAreaDeVenda, tfCidade, tfIdade, tfSalario;
	// declarando componente comboBox
	private JComboBox<String> cbxEstados;
	// declarando componentes radio button
	private JRadioButton rbMasculino, rbFeminimo;
	// componente responsavel por gerenciar os JRadioButton
	private ButtonGroup grpSexo;
	// botao para verificar a acao de clique
	private JButton btSalvar, btCancelar, btNovo, btSair;
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
		janela.setTitle("CADASTRO DE VENDEDOR");
		// tamanho da tela larg/ alt
		janela.setSize(570, 380);
		// centralizando a janela
		janela.setLocationRelativeTo(null);

		/*
		 * Configurações da jlabel = rotulo auxiliar
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
		lbCodigo.setText("Código:");
		lbNome.setText("Nome:");
		lbAreaDeVenda.setText("Area de Venda:");
		lbCidade.setText("Cidade:");
		lbEstado.setText("Estado:");
		lbSexo.setText("Sexo:");
		lbIdade.setText("Idade:");
		lbSalario.setText("Salario:");
		// configurando posição e tamanho
		lbCodigo.setBounds(20, 20, 100, 20);
		lbNome.setBounds(20, 50, 100, 20);
		lbAreaDeVenda.setBounds(20, 80, 100, 20);
		lbCidade.setBounds(20, 110, 100, 20);
		lbEstado.setBounds(20, 140, 100, 20);
		lbSexo.setBounds(20, 170, 100, 20);
		lbIdade.setBounds(20, 200, 100, 20);
		lbSalario.setBounds(20, 230, 100, 20);

		/*
		 * configurações dos JTextField
		 */
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfAreaDeVenda = new JTextField();
		tfCidade = new JTextField();
		tfIdade = new JTextField();
		tfSalario = new JTextField();
		// configurando posição e tamanho
		tfCodigo.setBounds(120, 18, 400, 25);
		tfNome.setBounds(120, 48, 400, 25);
		tfAreaDeVenda.setBounds(120, 78, 400, 25);
		tfCidade.setBounds(120, 108, 400, 25);
		tfIdade.setBounds(120, 198, 400, 25);
		tfSalario.setBounds(120, 228, 400, 25);

		/*
		 * configuração da JComboBox
		 */
		cbxEstados = new JComboBox<String>();
		cbxEstados.setBounds(120, 138, 300, 25);
		;

		/*
		 * configuração dos radio button
		 */
		rbMasculino = new JRadioButton();
		rbFeminimo = new JRadioButton();
		// configurando o texto do componente
		rbMasculino.setText("Masculino");
		rbFeminimo.setText("Feminino");
		// configurando posição e tamanho
		rbMasculino.setBounds(120, 168, 80, 25);
		rbFeminimo.setBounds(210, 168, 80, 25);

		/*
		 * configurações do ButtonGroup
		 */
		grpSexo = new ButtonGroup();
		grpSexo.add(rbMasculino);
		grpSexo.add(rbFeminimo);

		/*
		 * configurações do JButton
		 */
		btSalvar = new JButton("SALVAR");
		btCancelar = new JButton("CANCELAR");
		btNovo = new JButton("NOVO");
		btSair = new JButton("SAIR");
		btSalvar.setBounds(120, 268, 140, 30);
		btCancelar.setBounds(280, 268, 140, 30);
		btNovo.setBounds(120, 268, 140, 30);
		btSair.setBounds(280, 268, 140, 30);
		// configurando ação do botão
		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				salvar();
			}
		});

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// método para limpar os campos da tela
				limparTela();
				// método para bloquear os campos da tela
				bloquearTela();
			}
		});

		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// método para desbloqurar a tela
				liberarTela();
			}
		});

		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// fecha a janela e mantém o menu aberto
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
		painel.add(btNovo);
		painel.add(btSair);

		// carregando combo
		carregarComboEstados();

		// bloqueando tela ao iniciar
		bloquearTela();

		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

	/*
	 * método para bloquear a tela de cadastro
	 */
	private void bloquearTela() {

		tfCodigo.setEnabled(false);
		tfNome.setEnabled(false);
		tfAreaDeVenda.setEnabled(false);
		tfCidade.setEnabled(false);
		cbxEstados.setEnabled(false);
		tfIdade.setEnabled(false);
		tfSalario.setEnabled(false);
		rbMasculino.setEnabled(false);
		rbFeminimo.setEnabled(false);
		btSalvar.setVisible(false);
		btCancelar.setVisible(false);
		btNovo.setVisible(true);
		btSair.setVisible(true);

	}

	/*
	 * método para liberar a tela de cadastro
	 */
	private void liberarTela() {

		tfCodigo.setEnabled(!false);
		tfNome.setEnabled(!false);
		tfAreaDeVenda.setEnabled(!false);
		tfCidade.setEnabled(!false);
		cbxEstados.setEnabled(!false);
		tfIdade.setEnabled(!false);
		tfSalario.setEnabled(!false);
		rbMasculino.setEnabled(!false);
		rbFeminimo.setEnabled(!false);
		btSalvar.setVisible(!false);
		btCancelar.setVisible(!false);
		btNovo.setVisible(!true);
		btSair.setVisible(!true);

	}

	/*
	 * método para limpar a tela de cadastro
	 */
	private void limparTela() {

		tfCodigo.setText(null);
		tfNome.setText(null);
		tfAreaDeVenda.setText(null);
		tfCidade.setText(null);
		tfIdade.setText(null);
		tfSalario.setText(null);
		grpSexo.clearSelection();
		cbxEstados.setSelectedIndex(0);

	}

	/*
	 * método para carregar combobox
	 */
	private void carregarComboEstados() {

		cbxEstados.addItem("-Selecione Estado-");

		for (Estado estado : new EstadoController().getEstados()) {
			cbxEstados.addItem(estado.getNome());
		}

	}

	/*
	 * Método para receber a ação do clique salvar
	 */
	public void salvar() {

		// validando dados para salvar vendedor
		if (validar()) {
			/*
			 * procedimentos de gravação do objeto vendedor no arquivo txt
			 */
			Vendedor vendedor = getVendedor();
			// chamando o método para gravar o arquivo
			new VendedorController().gravarTxtVendedor(vendedor);

			// limpar a tela preenchida
			limparTela();

			// bloquear a tela
			bloquearTela();

			// exibindo mensagem de sucesso
			Mensagem.sucessoGravarVendedor(Titulo.cadastroVendedor);
		}

	}

	/*
	 * método para valorizar um objeto vendedor utilizando os campos da tela
	 */
	private Vendedor getVendedor() {

		// instanciando o objeto vendedor para retorno do método
		Vendedor vendedor = new Vendedor();

		// valorizando o objeto vendedor
		vendedor.setCodigo(Util.getInt(tfCodigo.getText()));
		vendedor.setNome(tfNome.getText());
		vendedor.setAreaVenda(tfAreaDeVenda.getText());
		vendedor.setCidade(tfCidade.getText());
		vendedor.setEstado(cbxEstados.getSelectedItem() + "");
		vendedor.setSexo(rbMasculino.isSelected() ? 'M' : 'F');
		vendedor.setIdade(Util.getInt(tfIdade.getText()));
		vendedor.setSalario(Util.getDouble(tfSalario.getText()));
		return vendedor;
	}

	/*
	 * método para validar os campos da tela
	 */
	private boolean validar() {

		// validar campo codigo
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			Mensagem.erroCodigoVazio(Titulo.cadastroVendedor);
			// focando no erro
			tfCodigo.grabFocus();
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			Mensagem.erroCodigoInvalido(Titulo.cadastroVendedor);
			// focando no erro
			tfCodigo.grabFocus();
			return false;
		}
		// validar campo nome
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			Mensagem.erroNomeVazio(Titulo.cadastroVendedor);
			// focando no erro
			tfNome.grabFocus();
			return false;
		}
		// validar campo area de venda
		if (Valida.isEmptyOrNull(tfAreaDeVenda.getText())) {
			Mensagem.erroAreaVendaVazio(Titulo.cadastroVendedor);
			// focando no erro
			tfAreaDeVenda.grabFocus();
			return false;
		}
		// validar campo cidade
		if (Valida.isEmptyOrNull(tfCidade.getText())) {
			Mensagem.erroCidadeVazio(Titulo.cadastroVendedor);
			// focando no erro
			tfCidade.grabFocus();
			return false;
		}
		// validação da comboBox
		if (cbxEstados.getSelectedIndex() == 0) {
			Mensagem.erroEstadoVazio(Titulo.cadastroVendedor);
			// focando no erro
			cbxEstados.grabFocus();
			return false;
		}
		// validação do radio button sexo
		if (!rbMasculino.isSelected()) {
			if (!rbFeminimo.isSelected()) {
				Mensagem.erroSexoVazio(Titulo.cadastroVendedor);
				return false;
			}
		}
		// validar campo idade
		if (Valida.isEmptyOrNull(tfIdade.getText())) {
			Mensagem.erroIdadeVazio(Titulo.cadastroVendedor);
			// focando no erro
			tfIdade.grabFocus();
			return false;
		} else if (!Valida.isInteger(tfIdade.getText())) {
			Mensagem.erroIdadeInvalido(Titulo.cadastroVendedor);
			// focando no erro
			tfIdade.grabFocus();
			return false;
		}
		// validar campo salario
		if (Valida.isEmptyOrNull(tfSalario.getText())) {
			Mensagem.erroSalarioVazio(Titulo.cadastroVendedor);
			// focando no erro
			tfSalario.grabFocus();
			return false;
		} else if (!Valida.isDouble(tfSalario.getText())) {
			Mensagem.erroSalarioInvalido(Titulo.cadastroVendedor);
			// focando no erro
			tfSalario.grabFocus();
			return false;
		}
		return true;
	}

}

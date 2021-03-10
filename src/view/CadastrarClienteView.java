package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controller.ClienteController;
import controller.EstadoController;
import model.Cliente;
import model.Data;
import model.Endereco;
import model.Estado;
import util.CampoFormatado;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;

/**
 * Classe para receber, armazenar e exibir os dados da tela de Cadastro de
 * Clientes
 * 
 * @author Éder Diego de Sousa
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarClienteView {

	// declarando os atributos
	private JFrame janela;
	// labels dados cadatrais para exibir informações
	private JLabel lbCodCliente, lbNome, lbRg, lbCpf, lbDataDeNascimento, lbIdade, lbTelefone, lbCelular, lbEmail;
	// label endereco para exibir informações
	private JLabel lbCep, lbLogradouro, lbEndereco, lbNumero, lbComplemento, lbBairro, lbCidade, lbEstado;
	// declarando componentes JTextField dados cadastrais
	private JTextField tfCodigoCliente, tfNome, tfEmail, tfIdade;
	// declarando campos formatados
	private JFormattedTextField tfCpfFormatado, tfRgFormatado, tfDataNascimentoFormatado, tfCelularFormatado,
			tfTelefoneFormatado, tfCepFormatado;
	// declarando componentes JTextField endereço
	private JTextField tfLogradouro, tfEndereco, tfNumero, tfComplemento, tfBairro, tfCidade;
	// declarando componente comboBox
	private JComboBox<String> cbxEstados;
	// declarando componentes radio button
	private JRadioButton rbMasculino, rbFeminimo;
	// componente responsavel por gerenciar os JRadioButton
	private ButtonGroup grpSexo;
	// botao para verificar a acao de clique
	private JButton btNovo, btSalvar, btSair, btCancelar;
	// componente para organização
	private JPanel painelPrincipal = new JPanel();
	private JPanel painelDadosCadastrais;
	private JPanel painelSexo;
	private JPanel painelEndereco;
	private JPanel painelBotoes;

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configuracoes do frame
		 */
		janela = new JFrame();
		// titutlo da tela
		janela.setTitle("CADASTRO DE CLIENTE");
		// tamanho da tela larg/ alt
		janela.setSize(600, 580);
		// centralizando a janela
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);

		/*
		 * Configurações da jlabel = rotulo auxiliar
		 */
		// labels cadastro cliente
		lbCodCliente = new JLabel("Código:");
		lbNome = new JLabel("Nome:");
		lbCpf = new JLabel("CPF:");
		lbRg = new JLabel("RG:");
		lbEmail = new JLabel("E-mail:");
		lbDataDeNascimento = new JLabel("Data de Nasc.:");
		lbIdade = new JLabel("Idade:");
		lbCelular = new JLabel("Celular:");
		lbTelefone = new JLabel("Telefone:");

		// configurando posição e tamanho label dados cadastrais
		lbCodCliente.setBounds(10, 20, 90, 20);
		lbNome.setBounds(10, 50, 90, 20);
		lbCpf.setBounds(10, 80, 90, 20);
		lbRg.setBounds(10, 110, 90, 20);
		lbEmail.setBounds(10, 140, 90, 20);
		lbDataDeNascimento.setBounds(10, 170, 90, 20);
		lbIdade.setBounds(330, 170, 70, 20);
		lbCelular.setBounds(10, 200, 90, 20);
		lbTelefone.setBounds(10, 230, 90, 20);

		/*
		 * configurações dos JTextField
		 */
		tfCodigoCliente = new JTextField();
		tfNome = new JTextField();
		tfEmail = new JTextField();
		tfIdade = new JTextField();

		/*
		 * configurando campos formatados
		 */
		tfCpfFormatado = CampoFormatado.tfCpfFormatado();
		tfCpfFormatado.setBounds(100, 80, 440, 28);
		tfRgFormatado = CampoFormatado.tfRgFormatado();
		tfRgFormatado.setBounds(100, 110, 440, 28);
		tfDataNascimentoFormatado = CampoFormatado.tfDataFormatado();
		tfDataNascimentoFormatado.setBounds(100, 170, 200, 28);
		tfCelularFormatado = CampoFormatado.tfCelularFormatado();
		tfCelularFormatado.setBounds(100, 200, 200, 28);
		tfTelefoneFormatado = CampoFormatado.tfFoneFormatado();
		tfTelefoneFormatado.setBounds(100, 230, 200, 28);

		// configurando posição e tamanho JTextField dados cadastrais
		tfCodigoCliente.setBounds(100, 20, 440, 28);
		tfNome.setBounds(100, 50, 440, 28);
		tfEmail.setBounds(100, 140, 440, 28);
		tfIdade.setBounds(400, 170, 140, 28);

		/*
		 * configuração dos radio button
		 */
		rbMasculino = new JRadioButton("Masculino");
		rbFeminimo = new JRadioButton("Feminino");
		// configurando posição e tamanho
		rbMasculino.setBounds(10, 20, 100, 28);
		rbFeminimo.setBounds(110, 20, 100, 28);

		/*
		 * configurações do ButtonGroup
		 */
		grpSexo = new ButtonGroup();
		grpSexo.add(rbMasculino);
		grpSexo.add(rbFeminimo);

		/*
		 * configuração do painel radio button
		 */
		painelSexo = new JPanel();
		painelSexo.setBorder(BorderFactory.createTitledBorder("Sexo"));
		painelSexo.setLayout(null);
		painelSexo.setBounds(320, 200, 220, 60);
		painelSexo.add(rbMasculino);
		painelSexo.add(rbFeminimo);

		/*
		 * configuração painel dados cadastrais
		 */
		painelDadosCadastrais = new JPanel();
		painelDadosCadastrais.setBorder(new TitledBorder("Dados Cadastrais"));
		painelDadosCadastrais.setLayout(null);
		painelDadosCadastrais.setBounds(5, 5, 570, 270);
		painelDadosCadastrais.add(lbCodCliente);
		painelDadosCadastrais.add(lbNome);
		painelDadosCadastrais.add(lbCpf);
		painelDadosCadastrais.add(lbRg);
		painelDadosCadastrais.add(lbEmail);
		painelDadosCadastrais.add(lbDataDeNascimento);
		painelDadosCadastrais.add(lbIdade);
		painelDadosCadastrais.add(lbCelular);
		painelDadosCadastrais.add(lbTelefone);
		painelDadosCadastrais.add(painelSexo);
		painelDadosCadastrais.add(tfCodigoCliente);
		painelDadosCadastrais.add(tfNome);
		painelDadosCadastrais.add(tfCpfFormatado);
		painelDadosCadastrais.add(tfRgFormatado);
		painelDadosCadastrais.add(tfEmail);
		painelDadosCadastrais.add(tfDataNascimentoFormatado);
		painelDadosCadastrais.add(tfIdade);
		painelDadosCadastrais.add(tfCelularFormatado);
		painelDadosCadastrais.add(tfTelefoneFormatado);

		// labels cadastro endereco
		lbCep = new JLabel("CEP:");
		lbLogradouro = new JLabel("Logradouro:");
		lbEndereco = new JLabel("Endereço:");
		lbNumero = new JLabel("Número:");
		lbComplemento = new JLabel("Complemento:");
		lbBairro = new JLabel("Bairro:");
		lbCidade = new JLabel("Cidade:");
		lbEstado = new JLabel("Estado:");
		// configurando posição e tamanho JTextField endereço
		lbCep.setBounds(10, 20, 90, 20);
		lbLogradouro.setBounds(10, 50, 90, 20);
		lbEndereco.setBounds(10, 80, 90, 20);
		lbNumero.setBounds(10, 110, 90, 20);
		lbComplemento.setBounds(180, 110, 90, 20);
		lbBairro.setBounds(350, 110, 50, 20);
		lbCidade.setBounds(10, 140, 90, 20);
		lbEstado.setBounds(350, 140, 50, 20);

		/*
		 * configurações dos JTextField endereço
		 */
		tfLogradouro = new JTextField();
		tfEndereco = new JTextField();
		tfNumero = new JTextField();
		tfComplemento = new JTextField();
		tfBairro = new JTextField();
		tfCidade = new JTextField();
		// configurando posição e tamanho JTextField endereço
		tfLogradouro.setBounds(100, 50, 440, 28);
		tfEndereco.setBounds(100, 80, 440, 28);
		tfNumero.setBounds(100, 110, 70, 28);
		tfComplemento.setBounds(270, 110, 70, 28);
		tfBairro.setBounds(400, 110, 140, 28);
		tfCidade.setBounds(100, 140, 240, 28);

		/*
		 * configurações campo formatado
		 */
		tfCepFormatado = CampoFormatado.tfCepFormatado();
		tfCepFormatado.setBounds(100, 20, 200, 28);

		/*
		 * configuração da JComboBox
		 */
		cbxEstados = new JComboBox<String>();
		cbxEstados.setBounds(400, 140, 140, 28);

		/*
		 * configuração painel endereço
		 */
		painelEndereco = new JPanel();
		painelEndereco.setBorder(new TitledBorder("Endereço"));
		painelEndereco.setLayout(null);
		painelEndereco.setBounds(5, 290, 570, 180);
		painelEndereco.add(lbCep);
		painelEndereco.add(lbLogradouro);
		painelEndereco.add(lbEndereco);
		painelEndereco.add(lbNumero);
		painelEndereco.add(lbComplemento);
		painelEndereco.add(lbBairro);
		painelEndereco.add(lbCidade);
		painelEndereco.add(lbEstado);
		painelEndereco.add(tfCepFormatado);
		painelEndereco.add(tfLogradouro);
		painelEndereco.add(tfEndereco);
		painelEndereco.add(tfNumero);
		painelEndereco.add(tfComplemento);
		painelEndereco.add(tfBairro);
		painelEndereco.add(tfCidade);
		painelEndereco.add(cbxEstados);

		// carrega combo estados
		carregarComboEstados();

		/*
		 * configurações do JButton
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		// configurando texto botao
		btSalvar.setText("SALVAR");
		btCancelar.setText("CANCELAR");
		btNovo = new JButton("NOVO");
		btSair = new JButton("SAIR");
		// configurando tamanho
		btSalvar.setPreferredSize(new Dimension(130, 30));
		btCancelar.setPreferredSize(new Dimension(130, 30));
		btNovo.setPreferredSize(new Dimension(130, 30));
		btSair.setPreferredSize(new Dimension(130, 30));

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
		 * configurações painel de botões
		 */
		painelBotoes = new JPanel();
		painelBotoes.setBorder(BorderFactory.createEtchedBorder());
		painelBotoes.setBounds(5, 480, 570, 50);
		painelBotoes.add(btSalvar);
		painelBotoes.add(btCancelar);
		painelBotoes.add(btNovo);
		painelBotoes.add(btSair);

		/*
		 * configurações do painel da tela principal JPanel
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painelPrincipal.setLayout(null);
		// adicionando os componentes no painel
		painelPrincipal.add(painelDadosCadastrais);
		painelPrincipal.add(painelEndereco);
		painelPrincipal.add(painelBotoes);

		// bloqueando tela
		bloquearTela();

		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

	protected void liberarTela() {
		tfCodigoCliente.setEnabled(!false);
		tfNome.setEnabled(!false);
		tfCpfFormatado.setEnabled(!false);
		tfRgFormatado.setEnabled(!false);
		tfEmail.setEnabled(!false);
		tfDataNascimentoFormatado.setEnabled(!false);
		tfCelularFormatado.setEnabled(!false);
		tfTelefoneFormatado.setEnabled(!false);
		tfIdade.setEnabled(!false);
		rbMasculino.setEnabled(!false);
		rbFeminimo.setEnabled(!false);
		tfCepFormatado.setEnabled(!false);
		tfLogradouro.setEnabled(!false);
		tfEndereco.setEnabled(!false);
		tfNumero.setEnabled(!false);
		tfComplemento.setEnabled(!false);
		tfBairro.setEnabled(!false);
		tfCidade.setEnabled(!false);
		cbxEstados.setEnabled(!false);
		btSalvar.setVisible(!false);
		btCancelar.setVisible(!false);
		btNovo.setVisible(!true);
		btSair.setVisible(!true);

	}

	protected void bloquearTela() {
		tfCodigoCliente.setEnabled(false);
		tfNome.setEnabled(false);
		tfCpfFormatado.setEnabled(false);
		tfRgFormatado.setEnabled(false);
		tfEmail.setEnabled(false);
		tfDataNascimentoFormatado.setEnabled(false);
		tfCelularFormatado.setEnabled(false);
		tfTelefoneFormatado.setEnabled(false);
		tfIdade.setEnabled(false);
		rbMasculino.setEnabled(false);
		rbFeminimo.setEnabled(false);
		tfCepFormatado.setEnabled(false);
		tfLogradouro.setEnabled(false);
		tfEndereco.setEnabled(false);
		tfNumero.setEnabled(false);
		tfComplemento.setEnabled(false);
		tfBairro.setEnabled(false);
		tfCidade.setEnabled(false);
		cbxEstados.setEnabled(false);
		btSalvar.setVisible(false);
		btCancelar.setVisible(false);
		btNovo.setVisible(true);
		btSair.setVisible(true);
	}

	protected void limparTela() {
		tfCodigoCliente.setText(null);
		tfNome.setText(null);
		tfCpfFormatado.setText(null);
		tfRgFormatado.setText(null);
		tfEmail.setText(null);
		tfDataNascimentoFormatado.setText(null);
		tfCelularFormatado.setText(null);
		tfTelefoneFormatado.setText(null);
		tfIdade.setText(null);
		grpSexo.clearSelection();
		tfCepFormatado.setText(null);
		tfLogradouro.setText(null);
		tfEndereco.setText(null);
		tfNumero.setText(null);
		tfComplemento.setText(null);
		tfBairro.setText(null);
		tfCidade.setText(null);
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
	private void salvar() {

		// validando dados para salvar cliente
		if (validar()) {
			/*
			 * procedimentos de gravação do objeto cliente no arquivo txt
			 */
			Cliente cliente = getCliente();
			// chamando o método para gravar o arquivo
			new ClienteController().gravarTxtCliente(cliente);

			// limpar a tela preenchida
			limparTela();

			// bloquear a tela
			bloquearTela();

			// exibindo mensagem de sucesso
			Mensagem.sucessoGravarCliente(Titulo.cadastroCliente);
		}

	}

	/*
	 * método para valorizar um objeto cliente utilizando os campos da tela
	 */
	private Cliente getCliente() {

		// recebendo a Data e separando dia/mes/ano
		String aux[] = tfDataNascimentoFormatado.getText().split("/");
		// instanciando o objeto data para associar a cliente
		Data data = new Data(Util.getInt(aux[0]), Util.getInt(aux[1]), Util.getInt(aux[2]));
		// instanciando o objeto endereço para associar a cliente
		Endereco endereco = new Endereco();
		// valorizando objeto endereco para associar ao cliente
		endereco.setCodigo(Util.getInt(tfCodigoCliente.getText()));
		endereco.setCep(tfCepFormatado.getText());
		endereco.setLogradouro(tfLogradouro.getText());
		endereco.setEndereco(tfEndereco.getText());
		endereco.setNumero(Util.getInt(tfNumero.getText()));
		endereco.setComplemento(tfComplemento.getText());
		endereco.setBairro(tfBairro.getText());
		endereco.setCidade(tfCidade.getText());
		endereco.setEstado(cbxEstados.getSelectedItem() + "");

		// instanciando o objeto cliente para retorno do método
		Cliente cliente = new Cliente();
		// valorizando o objeto cliente
		cliente.setCodigo(Util.getInt(tfCodigoCliente.getText()));
		cliente.setNome(tfNome.getText());
		cliente.setCpf(tfCpfFormatado.getText());
		cliente.setRg(tfRgFormatado.getText());
		cliente.setEmail(tfEmail.getText());
		cliente.setDataNascimento(data);
		cliente.setCelular(tfCelularFormatado.getText());
		cliente.setTelefone(tfTelefoneFormatado.getText());
		cliente.setIdade(Util.getInt(tfIdade.getText()));
		cliente.setSexo(rbMasculino.isSelected() ? 'M' : 'F');
		cliente.setEndereco(endereco);
		return cliente;
	}

	/*
	 * método para validar os campos da tela
	 */
	private boolean validar() {

		// validar campo codigo
		if (Valida.isEmptyOrNull(tfCodigoCliente.getText())) {
			Mensagem.erroCodigoVazio(Titulo.cadastroCliente);
			// focando no erro
			tfCodigoCliente.grabFocus();
			return false;
		} else if (!Valida.isInteger(tfCodigoCliente.getText())) {
			Mensagem.erroCodigoInvalido(Titulo.cadastroCliente);
			// focando no erro
			tfCodigoCliente.grabFocus();
			return false;
		}
		// validar campo nome
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			Mensagem.erroNomeVazio(Titulo.cadastroCliente);
			// focando no erro
			tfNome.grabFocus();
			return false;
		}
		// validar campo cpf
		if (tfCpfFormatado.getText().equals("___.___.___-__")) {
			Mensagem.erroCpfVazio(Titulo.cadastroCliente);
			// focando no erro
			tfCpfFormatado.grabFocus();
			return false;
		}
		// validar campo Rg
		if (tfRgFormatado.getText().equals("__.___.___-_")) {
			Mensagem.erroRgVazio(Titulo.cadastroCliente);
			// focando no erro
			tfRgFormatado.grabFocus();
			return false;
		}
		// validar campo email
		if (Valida.isEmptyOrNull(tfEmail.getText())) {
			Mensagem.erroEmailVazio(Titulo.cadastroCliente);
			// focando no erro
			tfEmail.grabFocus();
			return false;
		}
		// validar campo Data de Nascimento
		if (tfDataNascimentoFormatado.getText().equals("__/__/____")) {
			Mensagem.erroDtNascimentoVazio(Titulo.cadastroCliente);
			// focando no erro
			tfDataNascimentoFormatado.grabFocus();
			return false;
		}
		// validar campo celular
		if (tfCelularFormatado.getText().equals("(__) _____-____")) {
			Mensagem.erroCelularVazio(Titulo.cadastroCliente);
			// focando no erro
			tfCelularFormatado.grabFocus();
			return false;
		}
		// validar campo telefone
		if (tfTelefoneFormatado.getText().equals("(__) ____-____")) {
			Mensagem.erroTelefoneVazio(Titulo.cadastroCliente);
			// focando no erro
			tfTelefoneFormatado.grabFocus();
			return false;
		}
		// validar campo idade
		if (Valida.isEmptyOrNull(tfIdade.getText())) {
			Mensagem.erroIdadeVazio(Titulo.cadastroCliente);
			// focando no erro
			tfIdade.grabFocus();
			return false;
		} else if (!Valida.isInteger(tfIdade.getText())) {
			Mensagem.erroIdadeInvalido(Titulo.cadastroCliente);
			// focando no erro
			tfIdade.grabFocus();
			return false;
		}
		// validação do radio button sexo
		if (!rbMasculino.isSelected()) {
			if (!rbFeminimo.isSelected()) {
				Mensagem.erroSexoVazio(Titulo.cadastroCliente);
				return false;
			}
		}
		// validar campo CEP
		if (tfCepFormatado.getText().equals("__.___-___")) {
			Mensagem.erroCepVazio(Titulo.cadastroCliente);
			// focando no erro
			tfCepFormatado.grabFocus();
			return false;
		}
		// validar campo logradouro
		if (Valida.isEmptyOrNull(tfLogradouro.getText())) {
			Mensagem.erroLogradouroVazio(Titulo.cadastroCliente);
			// focando no erro
			tfLogradouro.grabFocus();
			return false;
		}
		// validar campo endereço
		if (Valida.isEmptyOrNull(tfEndereco.getText())) {
			Mensagem.erroEnderecoVazio(Titulo.cadastroCliente);
			// focando no erro
			tfEndereco.grabFocus();
			return false;
		}
		// validar campo numero
		if (Valida.isEmptyOrNull(tfNumero.getText())) {
			Mensagem.erroNumeroVazio(Titulo.cadastroCliente);
			// focando no erro
			tfNumero.grabFocus();
			return false;
		} else if (!Valida.isInteger(tfNumero.getText())) {
			Mensagem.erroNumeroInvalido(Titulo.cadastroCliente);
			// focando no erro
			tfNumero.grabFocus();
			return false;
		}
		// validar campo bairro
		if (Valida.isEmptyOrNull(tfBairro.getText())) {
			Mensagem.erroBairroVazio(Titulo.cadastroCliente);
			// focando no erro
			tfBairro.grabFocus();
			return false;
		}
		// validar campo cidade
		if (Valida.isEmptyOrNull(tfCidade.getText())) {
			Mensagem.erroCidadeVazio(Titulo.cadastroCliente);
			// focando no erro
			tfCidade.grabFocus();
			return false;
		}
		// validar campo estado
		if (cbxEstados.getSelectedIndex() == 0) {
			Mensagem.erroEstadoVazio(Titulo.cadastroCliente);
			// focando no erro
			cbxEstados.grabFocus();
			return false;
		}
		return true;
	}
}

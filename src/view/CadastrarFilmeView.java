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

import controller.FilmeController;
import model.Filme;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;

/**
 * Classe para receber, armazenar e exibir os dados da tela de Cadastro de
 * Filmes
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
	private JCheckBox cbAcao, cbFiccao, cbTerror, cbComedia, cbOutro;
	// botao para verificar a acao de clique
	private JButton btNovo, btSair, btSalvar, btCancelar;
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
		cbAcao = new JCheckBox();
		cbFiccao = new JCheckBox();
		cbTerror = new JCheckBox();
		cbComedia = new JCheckBox();
		cbOutro = new JCheckBox();
		// configurando o texto do componente
		cbAcao.setText("Ação");
		cbFiccao.setText("Ficção");
		cbTerror.setText("Terror");
		cbComedia.setText("Comédia");
		cbOutro.setText("Outro");
		// configurando posição e tamanho
		JPanel painelCheckbox = new JPanel(new GridLayout(1, 5, 0, 10));
		painelCheckbox.setBounds(120, 198, 380, 25);
		painelCheckbox.add(cbAcao);
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
		btNovo = new JButton("NOVO");
		btSair = new JButton("SAIR");
		btNovo.setBounds(120, 238, 140, 30);
		btSalvar.setBounds(120, 238, 140, 30);
		btCancelar.setBounds(280, 238, 140, 30);
		btSair.setBounds(280, 238, 140, 30);
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
		painel.add(btNovo);
		painel.add(btSair);

		// bloqueando a tela
		bloquearTela();

		// configurando a visibilidade da tela
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

	protected void liberarTela() {
		tfCodigo.setEnabled(!false);
		tfNome.setEnabled(!false);
		tfValor.setEnabled(!false);
		rbDisponivelNao.setEnabled(!false);
		rbDisponivelSim.setEnabled(!false);
		rbPromocaoNao.setEnabled(!false);
		rbPromocaoSim.setEnabled(!false);
		tfValorPromocao.setEnabled(!false);
		cbAcao.setEnabled(!false);
		cbComedia.setEnabled(!false);
		cbFiccao.setEnabled(!false);
		cbOutro.setEnabled(!false);
		cbTerror.setEnabled(!false);
		btSalvar.setVisible(!false);
		btCancelar.setVisible(!false);
		btNovo.setVisible(!true);
		btSair.setVisible(!true);

	}

	protected void bloquearTela() {

		tfCodigo.setEnabled(false);
		tfNome.setEnabled(false);
		tfValor.setEnabled(false);
		rbDisponivelNao.setEnabled(false);
		rbDisponivelSim.setEnabled(false);
		rbPromocaoNao.setEnabled(false);
		rbPromocaoSim.setEnabled(false);
		tfValorPromocao.setEnabled(false);
		cbAcao.setEnabled(false);
		cbComedia.setEnabled(false);
		cbFiccao.setEnabled(false);
		cbOutro.setEnabled(false);
		cbTerror.setEnabled(false);
		btSalvar.setVisible(false);
		btCancelar.setVisible(false);
		btNovo.setVisible(true);
		btSair.setVisible(true);

	}

	protected void limparTela() {

		tfCodigo.setText(null);
		tfNome.setText(null);
		tfValor.setText(null);
		grpRadioDisponivel.clearSelection();
		grpRadioPromocao.clearSelection();
		tfValorPromocao.setText(null);
		cbAcao.setSelected(false);
		cbComedia.setSelected(false);
		cbFiccao.setSelected(false);
		cbOutro.setSelected(false);
		cbTerror.setSelected(false);

	}

	/*
	 * Método para receber a ação do clique salvar
	 */
	private void salvar() {

		// validando dados para salvar filme
		if (validar()) {
			/*
			 * procedimentos de gravação do objeto filme no arquivo txt
			 */
			Filme filme = getFilme();
			// chamando o método para gravar o arquivo
			 new FilmeController().gravarTxtFilme(filme);

			// limpar a tela preenchida
			limparTela();

			// bloquear a tela
			bloquearTela();

			// exibindo mensagem de sucesso
			Mensagem.sucessoGravarFilme(Titulo.cadastroFilme);
		}

	}
	
	/*
	 * método para valorizar um objeto filme utilizando os campos da tela
	 */
	private Filme getFilme() {

		// instanciando o objeto filme para retorno do método
		Filme filme = new Filme();

		// valorizando o objeto filme
		filme.setCodigo(Util.getInt(tfCodigo.getText()));
		filme.setNome(tfNome.getText());
		filme.setValor(Util.getDouble(tfValor.getText()));
		filme.setDisponivel(rbDisponivelSim.isSelected() ? true : false);
		filme.setPromocao(rbPromocaoSim.isSelected() ? true : false);
		filme.setValorPromocao(Util.getDouble(tfValorPromocao.getText()));
		filme.setGenero(getComboGenero());	
		return filme;
	}

	/*
	 * método para validar os campos da tela
	 */
	private boolean validar() {

		// validar campo codigo
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			Mensagem.erroCodigoVazio(Titulo.cadastroFilme);
			// focando no erro
			tfCodigo.grabFocus();
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			Mensagem.erroCodigoInvalido(Titulo.cadastroFilme);
			// focando no erro
			tfCodigo.grabFocus();
			return false;
		}
		// validar campo nome
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			Mensagem.erroNomeVazio(Titulo.cadastroFilme);
			// focando no erro
			tfNome.grabFocus();
			return false;
		}
		// validar campo valor
		if (Valida.isEmptyOrNull(tfValor.getText())) {
			Mensagem.erroValorVazio(Titulo.cadastroFilme);
			// focando no erro
			tfValor.grabFocus();
			return false;
		} else if (!Valida.isDouble(tfValor.getText())) {
			Mensagem.erroValorInvalido(Titulo.cadastroFilme);
			// focando no erro
			tfValor.grabFocus();
			return false;
		}
		// validação do radio button disponivel
		if (!rbDisponivelSim.isSelected()) {
			if (!rbDisponivelNao.isSelected()) {
				Mensagem.erroDisponivelVazio(Titulo.cadastroFilme);
				return false;
			}
		}
		// validação do radio button promocao
		if (!rbPromocaoSim.isSelected()) {
			if (!rbPromocaoNao.isSelected()) {
				Mensagem.erroPromocaoVazio(Titulo.cadastroFilme);
				return false;
			}
		}
		// validar campo valor promoção
		if (Valida.isEmptyOrNull(tfValorPromocao.getText())) {
			Mensagem.erroValorPromocaoVazio(Titulo.cadastroFilme);
			// focando no erro
			tfValorPromocao.grabFocus();
			return false;
		} else if (!Valida.isDouble(tfValorPromocao.getText())) {
			Mensagem.erroValorPromocaoInvalido(Titulo.cadastroFilme);
			// focando no erro
			tfValorPromocao.grabFocus();
			return false;
		}
		// validação do check box genero
		if (!cbAcao.isSelected() && !cbComedia.isSelected() && !cbFiccao.isSelected() && !cbTerror.isSelected()
				&& !cbOutro.isSelected()) {
			Mensagem.erroGeneroVazio(Titulo.cadastroFilme);
			return false;
		}
		return true;
	}
	
	private String getComboGenero() {
		String msg = "";
		if(cbAcao.isSelected() ) {
			msg += cbAcao.getText() + ",";
		}
		if(cbComedia.isSelected() ) {
			msg += cbComedia.getText() + ",";
		}
		if(cbFiccao.isSelected() ) {
			msg += cbFiccao.getText() + ",";
		}
		if(cbTerror.isSelected() ) {
			msg += cbTerror.getText() + ",";
		}
		if(cbOutro.isSelected() ) {
			msg += cbOutro.getText() + ",";
		}
		return msg;
	}

}

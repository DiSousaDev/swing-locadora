package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import util.Tema;

/**
 * Classe para gerenciar o menu principal do sistema
 * 
 * @author ?der Diego de Sousa
 * @since 5 de mar. de 2021
 * @version 1.0
 */
public class MenuPrincipalView {

	// configura??o da janela principal.
	private JFrame janela;
	// declarando o componente para a barra de Menu
	private JMenuBar barraMenu;
	// declarando os menus
	private JMenu menuCadastro;
	private JMenu menuConsulta;
	private JMenu menuConfigurar;
	private JMenu menuConfigurarTema;
	private JMenu menuSair;
	// declarando os itens de menu cadastro
	private JMenuItem itemCadastroCliente;
	private JMenuItem itemCadastroVendedor;
	private JMenuItem itemCadastroLocacao;
	private JMenuItem itemCadastroFilme;
	// declarando itens de menu consulta
	private JMenuItem itemConsultaCliente;
	private JMenuItem itemConsultaFilme;
	private JMenuItem itemConsultaVendedor;
	// declarando itens de menu configurar
	private JMenuItem itemConfiguraTema1;
	private JMenuItem itemConfiguraTema2;
	private JMenuItem itemConfiguraTema3;
	// declarando itens de menu sair
	private JMenuItem itemSair;

	/*
	 * Metodo pra criar a tela:
	 */

	public void iniciaGui() {

		/*
		 * instanciando os objetos
		 */
		janela = new JFrame();
		// criando a barra principal de menu
		barraMenu = new JMenuBar();

		// declarando barra de menu e nomeando
		menuCadastro = new JMenu("CADASTRO");
		menuConsulta = new JMenu("CONSULTA");
		menuConfigurar = new JMenu("CONFIGURA??ES");
		menuConfigurarTema = new JMenu("Selecionar Tema");
		menuSair = new JMenu("SAIR");

		// declarando itens do menu CADASTRO
		itemCadastroCliente = new JMenuItem("Cliente");
		itemCadastroVendedor = new JMenuItem("Vendedor");
		itemCadastroLocacao = new JMenuItem("Loca??o");
		itemCadastroFilme = new JMenuItem("Filme");
		// declarando itens do menu CONSULTA
		itemConsultaCliente = new JMenuItem("Cliente");
		itemConsultaFilme = new JMenuItem("Filme");
		itemConsultaVendedor = new JMenuItem("Vendedor");
		// declarando itens do menu CONFIGURA??ES
		itemConfiguraTema1 = new JMenuItem("Padr?o");
		itemConfiguraTema2 = new JMenuItem("Nimbus");
		itemConfiguraTema3 = new JMenuItem("Windows");
		// declarando itens do menu SAIR
		itemSair = new JMenuItem("Sair");

		/*
		 * adicionando os Menus a barra de menu
		 */
		barraMenu.add(menuCadastro);
		barraMenu.add(menuConsulta);
		barraMenu.add(menuConfigurar);
		barraMenu.add(menuSair);

		/*
		 * adicionando itens ao menu
		 */
		// menu cadastro
		menuCadastro.add(itemCadastroCliente);
		menuCadastro.add(itemCadastroVendedor);
		menuCadastro.add(itemCadastroLocacao);
		menuCadastro.add(itemCadastroFilme);

		// menu consulta
		menuConsulta.add(itemConsultaCliente);
		menuConsulta.add(itemConsultaFilme);
		menuConsulta.add(itemConsultaVendedor);

		// menu configura??es
		menuConfigurar.add(menuConfigurarTema);
		// submenu configurar tema
		menuConfigurarTema.add(itemConfiguraTema1);
		menuConfigurarTema.add(itemConfiguraTema2);
		menuConfigurarTema.add(itemConfiguraTema3);

		// menu sair
		menuSair.add(itemSair);

		/*
		 * adicionando a??es aos itens de menu
		 */
		// A??ES MENU CADASTROS
		itemCadastroCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				CadastrarClienteView tela = new CadastrarClienteView();
				tela.iniciaGui();

			}
		});
		
		itemCadastroVendedor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				CadastrarVendedorView tela = new CadastrarVendedorView();
				tela.iniciaGui();

			}
		});
		
		itemCadastroLocacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				CadastrarLocacaoView tela = new CadastrarLocacaoView();
				tela.iniciaGui();

			}
		});
		
		itemCadastroFilme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				CadastrarFilmeView tela = new CadastrarFilmeView();
				tela.iniciaGui();

			}
		});
		
		// A??ES MENU CONSULTAS
		itemConsultaCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ConsultarClienteView tela = new ConsultarClienteView();
				tela.iniciaGui();

			}
		});

		itemConsultaFilme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ConsultarFilmeView tela = new ConsultarFilmeView();
				tela.iniciaGui();

			}
		});
		
		itemConsultaVendedor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ConsultarVendedorView tela = new ConsultarVendedorView();
				tela.iniciaGui();

			}
		});
		
		// A??ES MENU CONFIGURA??ES
		itemConfiguraTema1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	
				Tema.setTheme("Default");	
			}
		});

		itemConfiguraTema2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Tema.setTheme("Nimbus");
			}
		});

		itemConfiguraTema3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	
				Tema.setTheme("Windows");
			}
		});

		// A??ES MENU SAIR
		itemSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sitema?", "Aten??o", 0, 2);

				if (opcao == 0) {
					System.exit(0);
				}

			}
		});

		/*
		 * configura??es do jFrame - Janela
		 */
		// adicionando menu a janela
		janela.setJMenuBar(barraMenu);
		// configurando o titulo do menu
		janela.setTitle("LOCADORA");
		// encerrando a execu??o ao fechar o aplicativo
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// configurando o tamanho maximizado
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// configurando a visibilidade da janela
		janela.setVisible(true);

	}// fim do iniciaGui

} // fim da classe

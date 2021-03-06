package util;

import java.awt.Frame;
import java.awt.Window;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Classe para gerenciar o thema do sistema
 * 
 * @author ?der Diego de Sousa
 * @since 5 de mar. de 2021
 * @version 1.0
 */
public class Tema {

	public static final String ARQUIVO = "theme.txt";

	// m?todo para ler o ultimo tema salvo do arquivo
	public static String getTheme() {
		return Util.lerArquivo(ARQUIVO);
	}

	// m?todo para configurar o tema
	public static void setTheme(String tema) {

		try {
			if (tema.equals("Default")) {
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
				for (Frame frame : Frame.getFrames()) {
					atualizarTema(frame);
				}
				gravarArquivo("Default");
			} else if (tema.equals("Nimbus")) {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				for (Frame frame : Frame.getFrames()) {
					atualizarTema(frame);
				}
				gravarArquivo("Nimbus");
			} else if (tema.equals("Windows")) {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				for (Frame frame : Frame.getFrames()) {
					atualizarTema(frame);
				}
				gravarArquivo("Windows");
			} else {
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
				gravarArquivo("Default");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao Alterar tema", "LOCADORA", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

	// metodo para buscar as janelas abertas e atualizar os temas.
	public static void atualizarTema(Window window) {
		for (Window childWindow : window.getOwnedWindows()) {
			atualizarTema(childWindow);
		}
		SwingUtilities.updateComponentTreeUI(window);
	}

	// m?todo para salvar a ultima op??o escolhida
	public static void gravarArquivo(String args) {

		FileWriter file;
		try {
			file = new FileWriter(ARQUIVO);
			file.write(args);
			file.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo", "LOCADORA", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} 
	}

}

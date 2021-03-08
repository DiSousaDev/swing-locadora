package util;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/**
 * 
 * Classe para gerenciar os campos formatados
 * 
 * @author Éder Diego de Sousa
 * @since 7 de mar. de 2021
 * @version 1.0
 */
public class CampoFormatado {

	public static JFormattedTextField tfCpfFormatado() {
		MaskFormatter fmtCpf;
		JFormattedTextField tfCpf;
		try {
			fmtCpf = new MaskFormatter("###.###.###-##");
			fmtCpf.setPlaceholderCharacter('_');
			tfCpf = new JFormattedTextField(fmtCpf);
			return tfCpf;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static JFormattedTextField tfRgFormatado() {
		MaskFormatter fmtRg;
		JFormattedTextField tfRg;
		try {
			fmtRg = new MaskFormatter("##.###.###-#");
			fmtRg.setPlaceholderCharacter('_');
			tfRg = new JFormattedTextField(fmtRg);
			return tfRg;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static JFormattedTextField tfDataFormatado() {
		MaskFormatter fmtData;
		JFormattedTextField tfData;
		try {
			fmtData = new MaskFormatter("##/##/####");
			fmtData.setPlaceholderCharacter('_');
			tfData = new JFormattedTextField(fmtData);
			return tfData;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static JFormattedTextField tfCepFormatado() {
		MaskFormatter fmtCep;
		JFormattedTextField tfCep;
		try {
			fmtCep = new MaskFormatter("##.###-###");
			fmtCep.setPlaceholderCharacter('_');
			tfCep = new JFormattedTextField(fmtCep);
			return tfCep;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static JFormattedTextField tfFoneFormatado() {
		MaskFormatter fmtFone;
		JFormattedTextField tfFone;
		try {
			fmtFone = new MaskFormatter("(##) ####-####");
			fmtFone.setPlaceholderCharacter('_');
			tfFone = new JFormattedTextField(fmtFone);
			return tfFone;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static JFormattedTextField tfCelularFormatado() {
		MaskFormatter fmtCelular;
		JFormattedTextField tfCelular;
		try {
			fmtCelular = new MaskFormatter("(##) #####-####");
			fmtCelular.setPlaceholderCharacter('_');
			tfCelular = new JFormattedTextField(fmtCelular);
			return tfCelular;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}

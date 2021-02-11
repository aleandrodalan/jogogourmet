package br.com.aleandro.classes;

import javax.swing.JOptionPane;

import br.com.aleandro.interfaces.MensagensInterface;

public class Mensagens implements MensagensInterface {
	
	@Override	
	public int pergunta(String mensagem, String titulo) {
		Object[] options = {"Sim", "Não"};
		
		int n = JOptionPane.showOptionDialog(null, 
											 mensagem, 
											 titulo, 
											 JOptionPane.YES_NO_OPTION, 
											 JOptionPane.QUESTION_MESSAGE, 
											 null, 
											 options, 
											 options[0]);
		
		return n; 
	}
	
	@Override	
	public void aviso(String mensagem, String titulo, int i) {
		JOptionPane.showMessageDialog(null, 
									  mensagem, 
									  titulo, 
									  i);
	}

	@Override
	public String texto(String mensagem, String titulo, int icone) {
		return JOptionPane.showInputDialog(null, mensagem, titulo, icone);
	}

	@Override
	public int aviso(String mensagem, String titulo) {
		Object[] options = {"Ok"};
		
		int n = JOptionPane.showOptionDialog(null, 
											 mensagem, 
											 titulo, 
											 JOptionPane.OK_OPTION, 
											 JOptionPane.INFORMATION_MESSAGE, 
											 null, 
											 options, 
											 null);
		
		return n;
	}
}
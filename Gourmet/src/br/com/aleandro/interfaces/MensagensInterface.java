package br.com.aleandro.interfaces;

public interface MensagensInterface {

	int pergunta(String mensagem, String titulo);
	
	void aviso(String mensagem, String titulo, int i);
	int aviso(String mensagem, String titulo);
	String texto(String mensagem, String titulo, int icone);
}
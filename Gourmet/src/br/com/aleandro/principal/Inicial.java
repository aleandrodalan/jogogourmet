package br.com.aleandro.principal;

import br.com.aleandro.classes.Mensagens;
import br.com.aleandro.interfaces.MensagensInterface;

public class Inicial {
	
	public static void main(String[] args) {
		MensagensInterface msg = new Mensagens();		
		
		if (msg.aviso("Pense em um prato que gosta", "Jogo Gourmet") < 0)
			System.exit(0);
		
		int massa = msg.pergunta("O prato que você pensou é massa?", "Confirmação");

		if (massa == 0) {
			int lasanha = msg.pergunta("O prato que pensou é Lasanha?", "Confirmação");
			
			if (lasanha == 0) {
				acertei(msg);
			} else {
				qualPrato(msg);
			}
		} else {
			int bolo = msg.pergunta("O prato que pensou é Bolo de Chocolate?", "Confirmação");
			
			if (bolo == 0) {
				acertei(msg);
			} else {
				qualPrato(msg);
			}
		}
	}
	
	private static void qualPrato(MensagensInterface msg) {
		String prato = msg.texto("Qual prato você pensou?", "Desisto", 3);
		msg.texto(prato + " é _______ mas Lasanha não.", "Complete", 1);		
	}
	
	private static void acertei(MensagensInterface msg) {
		msg.aviso("Acertei de novo!", "Jogo Gourmet", 1);		
	}
}
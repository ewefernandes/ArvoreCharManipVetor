package view;
import javax.swing.JOptionPane;

import br.ewefernandes.arvorechar.*;
import controller.ArvoreController;

public class Main {

	public static void main(String[] args) {
		char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		Arvore arvChar = new Arvore();
		ArvoreController cont = new ArvoreController();
		
		for (char letra : vetor) {
			arvChar.insert(letra);
		}
		
		cont.removeNos(arvChar, 'F');
		cont.removeNos(arvChar, 'U');
		
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Pre-ordem; 2- Em ordem; 3- Pos-ordem; 9- Sair."));
			cont.percorreArv(arvChar, opc);
		} while (opc != 9);
	}

}

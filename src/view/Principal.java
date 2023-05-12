package view;

import controller.TabelaController;
import model.Palavra;

public class Principal {

	public static void main(String[] args) {
		Palavra p1 = new Palavra();
		p1.setVerbete("Abacaxi");
		p1.setSignificado("Fruta");

		Palavra p2 = new Palavra();
		p2.setVerbete("Abacate");
		p2.setSignificado("Fruta");

		Palavra p3 = new Palavra();
		p3.setVerbete("Abobora");
		p3.setSignificado("Legume");

		Palavra p4 = new Palavra();
		p4.setVerbete("Banana");
		p4.setSignificado("Fruta");

		Palavra p5 = new Palavra();
		p5.setVerbete("Bomba de Chocolate");
		p5.setSignificado("Doce");

		TabelaController tCont = new TabelaController();
		try {
			tCont.adiciona(p1);
			tCont.adiciona(p2);
			tCont.adiciona(p3);
			tCont.adiciona(p4);
			tCont.adiciona(p5);
			
			Palavra p = new Palavra();
			p.setVerbete("Abobora");
			p = tCont.busca(p);
			System.out.println(p);
			System.out.println("======================");
			
			tCont.lista("A");
			System.out.println("======================");
			tCont.lista("B");
			System.out.println("======================");
			
			tCont.remove(p3);
			tCont.lista("A");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

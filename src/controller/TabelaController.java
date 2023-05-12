package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Palavra;

public class TabelaController implements ITabelaController {

	Lista[] vetPalavra;
	
	public TabelaController() {
		vetPalavra = new Lista[26];
		for (int i = 0 ; i < 26 ; i++) {
			vetPalavra[i] = new Lista();
		}
	}

	@Override
	public void adiciona(Palavra p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetPalavra[hash];
		if (l.isEmpty()) {
			l.addFirst(p);
		} else {
			l.addLast(p);
		}
	}

	@Override
	public Palavra busca(Palavra p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetPalavra[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Palavra plv = (Palavra) l.get(i);
			if (plv.getVerbete().equals(p.getVerbete())) {
				return plv;
			}
		}
		return null;
	}

	@Override
	public void remove(Palavra p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetPalavra[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Palavra plv = (Palavra) l.get(i);
			if (plv.getVerbete().equals(p.getVerbete())) {
				l.remove(i);
				break;
			}
		}
	}

	@Override
	public void lista(String letra) throws Exception {
		int hash = hashCode(letra);
		Lista l = vetPalavra[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			System.out.println(l.get(i).toString());
		}
	}

	private int hashCode(String primeiraLetra) {
		String str = primeiraLetra.toLowerCase();
		char letra = str.charAt(0);
		int ltr = letra - 97;
		return ltr;
	}
}









package model;

public class Palavra {
	
	private String verbete;
	private String significado;
	
	public Palavra() {
		super();
	}
	
	public Palavra(String verbete, String significado) {
		this.verbete = verbete;
		this.significado = significado;
	}

	public String getVerbete() {
		return verbete;
	}

	public void setVerbete(String verbete) {
		this.verbete = verbete;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	@Override
	public String toString() {
		return "Palavra [verbete=" + verbete + ", significado=" + significado + "]";
	}

	@Override
	public int hashCode() {
		String str = verbete.substring(0,1).toLowerCase();
		char letra = str.charAt(0);
		int ltr = letra - 97;
		return ltr;
	}

}

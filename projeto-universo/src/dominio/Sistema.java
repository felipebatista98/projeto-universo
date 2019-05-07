package dominio;

import java.util.ArrayList;

public class Sistema {
	private String nomeSistema;
	private int anosSistema;
	private Galaxia galaxia;
	private ArrayList<CorpoCeleste> listacorpoCeleste;
	
	public Sistema(String nomeSistema, int anosSistema) {
		this.nomeSistema = nomeSistema;
		this.anosSistema = anosSistema;
		listacorpoCeleste = new ArrayList<CorpoCeleste>();
	}

	public String getNomeSistema() {
		return nomeSistema;
	}

	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}

	public int getAnosSistema() {
		return anosSistema;
	}

	public void setAnosSistema(int anosSistema) {
		this.anosSistema = anosSistema;
	}

	public void setGalaxia(Galaxia galaxia) {
		this.galaxia = galaxia;
	}

	public ArrayList<CorpoCeleste> getListacorpoCeleste() {
		return listacorpoCeleste;
	}

	public void adCorpoCeleste(CorpoCeleste novoCorpoCeleste) {
		listacorpoCeleste.add(novoCorpoCeleste);
		novoCorpoCeleste.setSistema(this);
	}
	
}

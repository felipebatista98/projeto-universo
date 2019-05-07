package dominio;

import java.util.ArrayList;

public class Galaxia {
	private String descricaoGalaxia;
	private Universo universo;
	private ArrayList<Sistema>listaSistema;
	public Galaxia(String descricaoGalaxia) {
		this.descricaoGalaxia = descricaoGalaxia;
		listaSistema = new ArrayList<Sistema>();
	}


	public String getDescricaoGalaxia() {
		return descricaoGalaxia;
	}



	public void setDescricaoGalaxia(String descricaoGalaxia) {
		this.descricaoGalaxia = descricaoGalaxia;
	}



	public void setUniverso(Universo universo) {
		this.universo = universo;
	}


	public ArrayList<Sistema> getListaSistema() {
		return listaSistema;
	}

	public void adSistema(Sistema novoSistema) {
		listaSistema.add(novoSistema);
		novoSistema.setGalaxia(this);
	}

}

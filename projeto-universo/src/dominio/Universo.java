package dominio;

import java.util.ArrayList;

public class Universo {
	private String descricaoUni;
	private ArrayList<Galaxia> listaGal;
	private ArrayList<Nebulosa> listaNeb;
	
	public Universo(String descricaoUni) {
		this.descricaoUni = descricaoUni;
		listaGal = new ArrayList<Galaxia>();
		listaNeb = new ArrayList<Nebulosa>();
	}
	public String getDescricaoUni() {
		return descricaoUni;
	}
	public void setDescricaoUni(String descricaoUni) {
		this.descricaoUni = descricaoUni;
	}
	public ArrayList<Galaxia> getListaGal() {
		return listaGal;
	}
	
	public ArrayList<Nebulosa> getListaNeb() {
		return listaNeb;
	}

	public void adGalaxia(Galaxia novaGalaxia) {
		listaGal.add(novaGalaxia);
		novaGalaxia.setUniverso(this);
	}
	
	public void adNebulosa(Nebulosa novaNebulosa) {
		listaNeb.add(novaNebulosa);
		novaNebulosa.setUni(this);
	}
	
	
}

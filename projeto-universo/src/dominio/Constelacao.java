package dominio;

import java.util.ArrayList;

public class Constelacao {
	private int numeroEstrela, nomeConstelacao;
	private ArrayList<Estrela> listaEstrela;
	public Constelacao(int numeroEstrela, int nomeConstelacao) {
		this.numeroEstrela = numeroEstrela;
		this.nomeConstelacao = nomeConstelacao;
		listaEstrela = new ArrayList<Estrela>();
	}
	public int getNumeroEstrela() {
		return numeroEstrela;
	}
	public void setNumeroEstrela(int numeroEstrela) {
		this.numeroEstrela = numeroEstrela;
	}
	public int getNomeConstelacao() {
		return nomeConstelacao;
	}
	public void setNomeConstelacao(int nomeConstelacao) {
		this.nomeConstelacao = nomeConstelacao;
	}
	public ArrayList<Estrela> getListaEstrela() {
		return listaEstrela;
	}
	public void adEstrela(Estrela novaEstrela) {
		listaEstrela.add(novaEstrela);
		novaEstrela.setConstelacao(this);
		
	}
	
}

package dominio;

public class Cometa extends CorpoCeleste {
	private String composicaoCometa,tipoOrbita;

	public Cometa(Double massa, Double densidade, Double diametro, String nome, String composicaoCometa,
			String tipoOrbita) {
		super(massa, densidade, diametro, nome);
		this.composicaoCometa = composicaoCometa;
		this.tipoOrbita = tipoOrbita;
	}

	public String getComposicaoCometa() {
		return composicaoCometa;
	}

	public void setComposicaoCometa(String composicaoCometa) {
		this.composicaoCometa = composicaoCometa;
	}

	public String getTipoOrbita() {
		return tipoOrbita;
	}

	public void setTipoOrbita(String tipoOrbita) {
		this.tipoOrbita = tipoOrbita;
	}
	
}

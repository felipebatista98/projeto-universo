package dominio;

public class Nebulosa {
	private String tipoNebulosa, nomeNebulosa;
	private Universo uni;

	public Nebulosa(String tipoNebulosa, String nomeNebulosa) {
		this.tipoNebulosa = tipoNebulosa;
		this.nomeNebulosa = nomeNebulosa;
	}

	public String getTipoNebulosa() {
		return tipoNebulosa;
	}

	public void setTipoNebulosa(String tipoNebulosa) {
		this.tipoNebulosa = tipoNebulosa;
	}

	public String getNomeNebulosa() {
		return nomeNebulosa;
	}

	public void setNomeNebulosa(String nomeNebulosa) {
		this.nomeNebulosa = nomeNebulosa;
	}

	public void setUni(Universo uni) {
		this.uni = uni;
	}
	
	
	

}

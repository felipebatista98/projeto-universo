package dominio;

public abstract class CorpoCeleste {
	private Double massa,densidade,diametro;
	private String nome;
	private Sistema sistema;
	
	public CorpoCeleste(Double massa, Double densidade, Double diametro, String nome) {
		this.massa = massa;
		this.densidade = densidade;
		this.diametro = diametro;
		this.nome = nome;
	}

	public Double getMassa() {
		return massa;
	}

	public void setMassa(Double massa) {
		this.massa = massa;
	}

	public Double getDensidade() {
		return densidade;
	}

	public void setDensidade(Double densidade) {
		this.densidade = densidade;
	}

	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

}

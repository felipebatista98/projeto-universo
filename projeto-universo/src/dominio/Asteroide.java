package dominio;

public class Asteroide extends CorpoCeleste {
	private String composicaoAsteroide;

	public Asteroide(Double massa, Double densidade, Double diametro, String nome, String composicaoAsteroide) {
		super(massa, densidade, diametro, nome);
		this.composicaoAsteroide = composicaoAsteroide;
	}

	public String getComposicaoAsteroide() {
		return composicaoAsteroide;
	}

	public void setComposicaoAsteroide(String composicaoAsteroide) {
		this.composicaoAsteroide = composicaoAsteroide;
	}

	
	

}

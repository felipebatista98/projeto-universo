package dominio;

public class Meteoroide extends CorpoCeleste {

	private double tamanho;
	private String composição;
		public Meteoroide(Double massa, Double densidade, Double diametro, String nome, double tamanho, String composição) {
		super(massa, densidade, diametro, nome);
		this.tamanho = tamanho;
		this.composição = composição;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getComposição() {
		return composição;
	}
	public void setComposição(String composição) {
		this.composição = composição;
	}
	
	
	
	
}

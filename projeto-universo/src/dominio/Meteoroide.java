package dominio;

public class Meteoroide extends CorpoCeleste {

	private double tamanho;
	private String composi��o;
		public Meteoroide(Double massa, Double densidade, Double diametro, String nome, double tamanho, String composi��o) {
		super(massa, densidade, diametro, nome);
		this.tamanho = tamanho;
		this.composi��o = composi��o;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getComposi��o() {
		return composi��o;
	}
	public void setComposi��o(String composi��o) {
		this.composi��o = composi��o;
	}
	
	
	
	
}

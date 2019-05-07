package dominio;

public class Estrela extends CorpoCeleste{
	private String materialCombustivel;
	private double temperatura, duracaoQueima;
	private Constelacao constelacao;
	public Estrela(Double massa, Double densidade, Double diametro, String nome, String materialCombustivel,
			double temperatura, double duracaoQueima) {
		super(massa, densidade, diametro, nome);
		this.materialCombustivel = materialCombustivel;
		this.temperatura = temperatura;
		this.duracaoQueima = duracaoQueima;
	}
	public String getMaterialCombustivel() {
		return materialCombustivel;
	}
	public void setMaterialCombustivel(String materialCombustivel) {
		this.materialCombustivel = materialCombustivel;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getDuracaoQueima() {
		return duracaoQueima;
	}
	public void setDuracaoQueima(double duracaoQueima) {
		this.duracaoQueima = duracaoQueima;
	}

	public void setConstelacao(Constelacao constelacao) {
		this.constelacao = constelacao;
	}
	
	
}

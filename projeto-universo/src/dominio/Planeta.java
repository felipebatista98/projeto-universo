package dominio;

public class Planeta extends CorpoCeleste {

	private String atmosferaPlaneta;
	private double forcaGPlaneta,periodoRotacao;
	private int quantSatelites;
	public Planeta(Double massa, Double densidade, Double diametro, String nome, String atmosferaPlaneta,
			double forcaGPlaneta, double periodoRotacao, int quantSatelites) {
		super(massa, densidade, diametro, nome);
		this.atmosferaPlaneta = atmosferaPlaneta;
		this.forcaGPlaneta = forcaGPlaneta;
		this.periodoRotacao = periodoRotacao;
		this.quantSatelites = quantSatelites;
	}
	public String getAtmosferaPlaneta() {
		return atmosferaPlaneta;
	}
	public void setAtmosferaPlaneta(String atmosferaPlaneta) {
		this.atmosferaPlaneta = atmosferaPlaneta;
	}
	public double getForcaGPlaneta() {
		return forcaGPlaneta;
	}
	public void setForcaGPlaneta(double forcaGPlaneta) {
		this.forcaGPlaneta = forcaGPlaneta;
	}
	public double getPeriodoRotacao() {
		return periodoRotacao;
	}
	public void setPeriodoRotacao(double periodoRotacao) {
		this.periodoRotacao = periodoRotacao;
	}
	public int getQuantSatelites() {
		return quantSatelites;
	}
	public void setQuantSatelites(int quantSatelites) {
		this.quantSatelites = quantSatelites;
	}
	
}

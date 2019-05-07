package dominio;

public class Satelite extends CorpoCeleste{
	private double periodoOrbital;
	private String dataDescoberta;
	public Satelite(Double massa, Double densidade, Double diametro, String nome, double periodoOrbital,
			String dataDescoberta) {
		super(massa, densidade, diametro, nome);
		this.periodoOrbital = periodoOrbital;
		this.dataDescoberta = dataDescoberta;
	}
	public double getPeriodoOrbital() {
		return periodoOrbital;
	}
	public void setPeriodoOrbital(double periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}
	public String getDataDescoberta() {
		return dataDescoberta;
	}
	public void setDataDescoberta(String dataDescoberta) {
		this.dataDescoberta = dataDescoberta;
	}
	
	

}

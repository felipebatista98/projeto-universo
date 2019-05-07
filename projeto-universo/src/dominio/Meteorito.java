package dominio;

public class Meteorito extends Meteoroide{
	
	private String tipoMeteorito;
	
	public Meteorito(Double massa, Double densidade, Double diametro, String nome, double tamanho, String composi��o,
			String tipoMeteorito) {
		super(massa, densidade, diametro, nome, tamanho, composi��o);
		this.tipoMeteorito = tipoMeteorito;
	}

	public String getTipoMeteorito() {
		return tipoMeteorito;
	}

	public void setTipoMeteorito(String tipoMeteorito) {
		this.tipoMeteorito = tipoMeteorito;
	}
	
	

}

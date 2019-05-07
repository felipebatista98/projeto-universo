package dominio;

public class Meteoro extends Meteoroide {

	private String tipoMeteoro;
	/*
	 alguns astrónomos fazem a distinção entre meteoros do tipo: "bola de fogo" e "bólides".
	 */
	public Meteoro(Double massa, Double densidade, Double diametro, String nome, double tamanho, String composição,
			String tipoMeteoro) {
		super(massa, densidade, diametro, nome, tamanho, composição);
		this.tipoMeteoro = tipoMeteoro;
	}

	public String getTipoMeteoro() {
		return tipoMeteoro;
	}

	public void setTipoMeteoro(String tipoMeteoro) {
		this.tipoMeteoro = tipoMeteoro;
	}
	
}

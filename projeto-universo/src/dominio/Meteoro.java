package dominio;

public class Meteoro extends Meteoroide {

	private String tipoMeteoro;
	/*
	 alguns astr�nomos fazem a distin��o entre meteoros do tipo: "bola de fogo" e "b�lides".
	 */
	public Meteoro(Double massa, Double densidade, Double diametro, String nome, double tamanho, String composi��o,
			String tipoMeteoro) {
		super(massa, densidade, diametro, nome, tamanho, composi��o);
		this.tipoMeteoro = tipoMeteoro;
	}

	public String getTipoMeteoro() {
		return tipoMeteoro;
	}

	public void setTipoMeteoro(String tipoMeteoro) {
		this.tipoMeteoro = tipoMeteoro;
	}
	
}

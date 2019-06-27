package modelo.herramientas;

import modelo.materiales.*;

public class HachaDeMadera extends Hacha  {


	public HachaDeMadera() {
		this.durabilidad = 100;
		this.fuerza = 2;
		this.factorDeDesgaste = 1.0f;
		this.identificador = "Hacha de madera";
	}


	@Override
	public String getRutaImagen() {
		return "hachaDeMadera.png";
	}

	@Override
	public void desgastar(int danio) {

	}

	@Override
	public void usarContra(Material materialARecolectar) {

	}


}

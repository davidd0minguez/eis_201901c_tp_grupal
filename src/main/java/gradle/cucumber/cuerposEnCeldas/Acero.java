package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public class Acero extends Pared {

	public Acero(Celda celdaActual) {
		super(celdaActual);
	}

	@Override
	public void serDestruido() {
	}
}
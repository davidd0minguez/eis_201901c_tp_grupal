package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public class Cuerpo {
	
	public Celda celdaActual;

	public Celda getCeldaActual() {
		return celdaActual;
	}

	public void setCeldaActual(Celda celdaActual) {
		this.celdaActual = celdaActual;
		celdaActual.setCuerpoActual(this);
	}

	public void serDestruido() {
	}
	
}

package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Voluntario implements Pensador {
	private String pensamientos;

	public void pensarEnAlgo(String pensamientos) {//la flechita roja indica que este metodo esta siendo monitoreado
		System.out.println("Ejecutando metodo pensar en algo");
		this.pensamientos = pensamientos;		   // por el metodo interceptarPensamientos() definido en la clase mago
	}

	public String getPensamientos() {
		return this.pensamientos;
	}
}
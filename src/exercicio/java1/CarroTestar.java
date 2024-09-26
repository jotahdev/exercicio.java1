/**
 * 
 */
package exercicio.java1;

public class CarroTestar {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.nome = "corsa";
		carro.marca = "chevrolet";
		carro.ano = 1998;
		carro.velocidade = 120;
		
		carro.acelerar(20);
		System.out.println("vel: " + carro.velocidade + "km/h");
		
		carro.freiar(30);
		
		System.out.println("freio atvivado!!! vel: " + carro.velocidade + "km/h");
	}

}

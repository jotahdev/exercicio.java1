/**
 * 
 */
package exercicio.java1;

/**
 * 
 */
public class Carro {

	//atributos
	
	String nome;
	
	String marca;
	
	int ano;
	
	int velocidade;
	
		//metodos
		
		void acelerar(int aceleração){
			velocidade+=aceleração;
		}
		
		void freiar(int reduzir) {
			velocidade-=reduzir;
	   }
		void buzinar() {
			System.out.println("bibibi");
		}

}

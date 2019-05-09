

/**
 * Classe criada para execução do sistema.
 * 
 * @author Jean Ribeiro
 *
 */
public class Principal {

	/**
	 * 
	 * Metodo principal de execução.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Parede daFrente = new Parede();
		daFrente.setAltura(4);;
		daFrente.setLargura(9);
		System.out.println(daFrente.getArea());
		
		daFrente.setAltura(5);;
		daFrente.setLargura(2);
		System.out.println(daFrente.getArea());
		
		
//		Parede daFrente = new Parede();
//		daFrente.altura = 5;
//		daFrente.largura = 4;
//		daFrente.area = 10;
//		
//		Parede daEsquerda = new Parede();
//		daEsquerda.altura = 2.2;
//		daEsquerda.largura = 4.5;
//		daEsquerda.area = 8.75;
//		
//		Parede daDireita = new Parede();
//		daDireita.altura = 2.5;
//		daDireita.largura = 8.5;
//		daDireita.area = 25;
//		
//		ArrayList<Parede> paredes = new ArrayList <>();
//		paredes.add(daDireita);
//		paredes.add(daEsquerda);
//		paredes.add(daFrente);
//		
//		for (Parede parede : paredes) {
//			System.out.println(parede.altura);
//		}

	}
}

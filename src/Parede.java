
/**
 * Classe para representar uma parede
 * 
 * @author Jean Ribeiro
 *
 */
public class Parede {

	private double altura;

	private double largura;

	private double area;

	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		recalcularArea();
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
		recalcularArea();
	}

	public double getArea() {
		return area;
	}
	
	private void recalcularArea() {
		this.area = this.altura * this.largura;
	}


	
	
	
	
	
	
	
	
	

//	/**
//	 * Altera a altura da Parede.
//	 * 
//	 * @param novaAltura altura nova para alterar a varialvel altura.
//	 */
//	public void alterarAltura(double novaAltura) {
//		altura = novaAltura;
//		area = altura * largura;
//	}
//
//	/**
//	 * Retorna a altura da parede..
//	 * 
//	 * @return
//	 */
//	public double pegarAltura() {
//		return altura;
//	}
//
//	/**
//	 * Altera a largura da Parede.
//	 * 
//	 * @param novaLargura largura nova para alterar a varialvel largura.
//	 */
//	public void alterarLargura(double novaLargura) {
//		largura = novaLargura;
//		area = largura * altura;
//	}
//
//	/**
//	 * Retorna a largura da parede..
//	 * 
//	 * @return
//	 */
//	public double pegarLargura() {
//		return largura;
//	}
//	
//	/**
//	 * Retorna a area da parede.
//	 * @return
//	 */
//	public double pegarArea() {
//		return area;
//	}
}

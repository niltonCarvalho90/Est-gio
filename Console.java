package Polimorfismo_dinamico;

public class Console {

	public static void main(String[] args) {

		Forma minhaForma = new Forma();
		Forma meuCirculo = new Circulo();
		Forma meuRetangulo = new Retangulo();
		Forma meuTriangulo = new Triangulo();
		
		minhaForma.desenhar();
		meuCirculo.desenhar();
		meuRetangulo.desenhar();
		meuTriangulo.desenhar();
		
	}

}

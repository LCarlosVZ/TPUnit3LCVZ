package org.example.ejercicios;

public class CalculaAreaTriangulo1 {
	public static void main(String[] args) {
		CaracteristicasDelTriangulo triangulo = new CaracteristicasDelTriangulo("rojo", 5.0, 4.0);
		double valor_area_triangulo = 0D;
		double b = triangulo.baseDelTriangulo();
		double h = triangulo.alturaDelTriangulo();
		valor_area_triangulo =  0.5 * b * h;
		System.out.println("Altura del triángulo: " + triangulo.alturaDelTriangulo());
		System.out.println("Base del triángulo: " + triangulo.baseDelTriangulo());
		System.out.println("Área del triángulo: " + valor_area_triangulo);
	}

	record CaracteristicasDelTriangulo(String colorDelTriangulo, double baseDelTriangulo, double alturaDelTriangulo) {}
}

/*
CAMBIÉ EN EL RECORD:
  Triangulo a CaracteristicasDelTriangulo
  c a colorDelTriangulo
  b a baseDelTriangulo
  h a alturaDelTriangulo
 */
package org.example.ejercicios;

import java.util.List;

/*
CAMBIÉ NOMBRES EN EL RECORD PARA SER MÁS DESCRIPTIVO
 Factura a DatosFactura
 cliente a nombreCliente
APLIQUÉ CAMELCASE EN:
 fechafactura a fechaFactura
 */

public class Facturaciom1 {
	record DatosFactura(String nombreCliente, String fechaFactura, List<Double> precioProducto) {
	}

	public static void main(String[] args) {
		DatosFactura factura1 = new DatosFactura("Maria Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
		DatosFactura factura2 = new DatosFactura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));

		double totalValorFact1 = 0;
		for (Double precio : factura1.precioProducto) {
			totalValorFact1 += precio;
		}
		System.out.println("Factura 1" );
		System.out.println("Cliente: " + factura1.nombreCliente());
		System.out.println("Total: " + totalValorFact1);


		double totalValorFact2 = 0;
		for (Double precio : factura2.precioProducto) {
			totalValorFact2 += precio;
		}
		System.out.println("Factura 2" );
		System.out.println("Cliente: " + factura2.nombreCliente());
		System.out.println("Total: " + totalValorFact2);
	}

}

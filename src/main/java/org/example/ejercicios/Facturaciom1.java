package org.example.ejercicios;

import java.util.ArrayList;
import java.util.List;

/*
CAMBIÉ NOMBRES EN EL RECORD PARA SER MÁS DESCRIPTIVO:
  Factura a DatosFactura
  cliente a nombreCliente
APLIQUÉ CAMELCASE EN:
  fechafactura a fechaFactura

DIVIDÍ LAS TAREAS EN MÉTODOS
  CREÉ UN MÉTODO PARA MANEJAR LOS DATOS EN UNA MISMA COLECCIÓN DE OBJETOS.
  CREÉ UN MÉTODO PARA MOSTRAR LOS DATOS DE FORMA INDIVIDUAL DESDE UNA MISMA COLECCIÓN DE OBJETOS.

 */

public class Facturaciom1 {
    record DatosFactura(String nombreCliente, String fechaFactura, List<Double> precioProducto) {
    }

    public static void main(String[] args) {
        mostrarDatosFacturas(retornarDatosDeFacturas());
    }

    public static ArrayList<DatosFactura> retornarDatosDeFacturas() {
        ArrayList<DatosFactura> datosParaFactura = new ArrayList<>();
        datosParaFactura.add(new DatosFactura("Maria Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D)));
        datosParaFactura.add(new DatosFactura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D)));
        return datosParaFactura;
    }

    public static void mostrarDatosFacturas(ArrayList<DatosFactura> mostrarDatos) {
        Double totalValorFactura = 0D;
        for (int i = 0; i <= mostrarDatos.size(); i++) {
            for (Double precio : mostrarDatos.get(i).precioProducto) {
                totalValorFactura += precio;
            }
            System.out.println("Factura 2");
            System.out.println("Cliente: " + mostrarDatos.get(i).nombreCliente());
            System.out.println("Total: " + totalValorFactura);
        }
    }

}

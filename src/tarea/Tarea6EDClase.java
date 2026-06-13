/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Jccc
 */
public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        if (numProductos > NUM_PRODUCTOS_PARA_DESCUENTO_FIJO) {
            precioProducto -= DESCUENTO_FIJO;
        }
        if (numProductos != NUM_PRODUCTOS_PARA_DESCUENTO_PORCENTAJE_EXTRA) {
            double descuentoPorcentaje = 0.8;
            calcularPagoYEnviar(precioProducto, descuentoPorcentaje);
        } else {
            double descuentoPorcentaje = 0.95;
            calcularPagoYEnviar(precioProducto, descuentoPorcentaje);
        }

    }

    private void calcularPagoYEnviar(double precioProducto, double descuentoPorcentaje) {
        double totalPagar = precioProducto * descuentoPorcentaje;
        System.out.println("El total a pagar es:" + totalPagar);
        System.out.println("Enviado");
    }
    
    private static final double DESCUENTO_FIJO = 5;
    private static final int NUM_PRODUCTOS_PARA_DESCUENTO_FIJO = 3;
    private static final int NUM_PRODUCTOS_PARA_DESCUENTO_PORCENTAJE_EXTRA = 0;
}
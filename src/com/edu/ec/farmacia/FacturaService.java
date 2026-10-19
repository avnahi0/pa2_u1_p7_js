package com.edu.ec.farmacia;

public class FacturaService {

public void factura(Venta venta){
        System.out.println("Factura Electronica");

        System.out.println("Factura emitida al Sr/a: " + venta.getNomCliente());
        System.out.println("Medicamento: " + venta.getMedicamento());
        System.out.println("Valor de $ " + venta.getPrecio());
        System.out.println("Correo: " + venta.getCorreo());

        NotificacionService notificacionService = new NotificacionService();
        String asunto = "Compra de medicamentos";
        String cuerpo = "Estimado/a " + venta.getNomCliente() + ", por la compra de su medicamento '" + venta.getMedicamento() + "'"+
        " el valor a pagar es de $ " + venta.getPrecio();

        notificacionService.notificacion(venta.getCorreo(), asunto, cuerpo);
        notificacionService = null;
    }

}

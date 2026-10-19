package com.edu.ec;

import com.edu.ec.farmacia.FacturaService;
import com.edu.ec.farmacia.Venta;

public class AppFarmacia {

    public static void main(String[] args) {
        
        Venta venta = new Venta("avnahi", "Singripal", 0.80, "avn.ahi@gmail.com");
        FacturaService facturaService = new FacturaService();
        facturaService.factura(venta);

        venta = null;
        facturaService = null;

    }

}

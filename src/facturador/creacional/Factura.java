/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.creacional;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Palacios
 */
public class Factura extends ComprobanteElectronico{
    
    private List<String> productos;
    private double total;

    public Factura(List<String> productos, double total, String nombreCliente, long codigo, LocalDate fecha) {
        super(nombreCliente, codigo, fecha);
        this.productos = productos;
        this.total = total;
    }
    
    public Factura() {
    	super();
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
    	StringBuilder sb=new StringBuilder();
    	sb.append("FACTURA\n");
    	sb.append(super.toString()+"\n");
    	sb.append("Productos\n");
    	for(String producto:productos) {
    		sb.append(producto+"\n");
    	}
    	sb.append("Total: $"+total+"\n");
    	
    	return sb.toString();
    }
}

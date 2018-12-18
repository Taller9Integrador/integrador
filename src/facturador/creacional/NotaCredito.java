/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.creacional;

import java.time.LocalDate;

/**
 *
 * @author Palacios
 */
public class NotaCredito extends ComprobanteElectronico{
    private String detalleModificacion;
    private double valorAPagar;

    public NotaCredito(String detalleModificacion, double valorAPagar, String nombreCliente, long codigo, LocalDate fecha) {
        super(nombreCliente, codigo, fecha);
        this.detalleModificacion = detalleModificacion;
        this.valorAPagar = valorAPagar;
    }

    public NotaCredito() {
    }

    public String getDetalleModificacion() {
        return detalleModificacion;
    }

    public void setDetalleModificacion(String detalleModificacion) {
        this.detalleModificacion = detalleModificacion;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    
    @Override
    public String toString() {
    	StringBuilder sb=new StringBuilder();
    	sb.append("NOTA-CREDITO\n");
    	for(String detalle:detallesEmisor) {
    		sb.append(detalle+"\n");
    	}
    	sb.append("Detalle: "+detalleModificacion+"\n");
    	sb.append("Valor a pagar: $"+valorAPagar+"\n");
    	
    	return sb.toString();
    }
    
    
}

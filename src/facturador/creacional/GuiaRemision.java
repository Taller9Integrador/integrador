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
public class GuiaRemision extends ComprobanteElectronico {
    private String destino;
    private String placaVehiculo;
    private List<String> listaProductos;

    public GuiaRemision(String destino, String placaVehiculo, List<String> listaProductos, String nombreCliente, long codigo, LocalDate fecha) {
        super(nombreCliente, codigo, fecha);
        this.destino = destino;
        this.placaVehiculo = placaVehiculo;
        this.listaProductos = listaProductos;
    }
    
    public GuiaRemision() {
    	super();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public List<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<String> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    @Override
    public String toString() {
    	StringBuilder sb=new StringBuilder();
    	sb.append("GUIA-REMISION\n");
    	sb.append(super.toString()+"\n");
    	sb.append("Vehiculo: "+placaVehiculo+"\n");
    	sb.append("Destino: "+destino+"\n");
    	for(String producto:listaProductos) {
    		sb.append(producto+"\n");
    	}
    	
    	return sb.toString();
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.creacional;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import facturador.estructural.Imprimible;

/**
 *
 * @author Palacios
 */
public abstract class ComprobanteElectronico implements Imprimible {
    
    protected List<String> detallesEmisor;
    protected String nombreCliente;
    protected long codigo;
    protected LocalDate fecha;
    protected String numeroAutorizacion;
    protected String claveAcceso;

    public ComprobanteElectronico(String nombreCliente, long codigo, LocalDate fecha) {
    	this();
        this.nombreCliente = nombreCliente;
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public ComprobanteElectronico() {
        this.detallesEmisor = new LinkedList<>();
    }

    public List<String> getDetallesEmisor() {
        return detallesEmisor;
    }

    public void setDetallesEmisor(List<String> detallesEmisor) {
        this.detallesEmisor = detallesEmisor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
    	StringBuilder sb=new StringBuilder();
    	
    	for(String detalle:detallesEmisor) {
    		sb.append(detalle+"\n");
    	}
    	sb.append("Cliente: "+nombreCliente+"\n");
    	sb.append("Fecha: "+fecha+"\n");
    	
    	return sb.toString();
    }
    
    
    
}

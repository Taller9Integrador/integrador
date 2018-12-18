package facturador.estructural;

import java.util.List;

import facturador.creacional.ComprobanteElectronico;

public class ComprobanteDecorator extends ComprobanteElectronico {

	ComprobanteElectronico comprobante;
    public void Decorator(){
    }
    
    public void DetalleDecorator(ComprobanteElectronico comprobante){
        this.comprobante=comprobante;
    }
    
    public List<String> getDetallesEmisor(){    
        return super.detallesEmisor;
    }
    
    public ComprobanteElectronico getComprobante(){
        return comprobante;
    }
}

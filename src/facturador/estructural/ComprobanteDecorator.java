package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

public abstract class ComprobanteDecorator extends ComprobanteElectronico {
	protected ComprobanteElectronico comprobante;
	
    public ComprobanteDecorator(){
    }
    
    public ComprobanteDecorator(ComprobanteElectronico comprobante){
        this.comprobante=comprobante;
    }
    
}

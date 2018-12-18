package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

public class LogoDecorator extends ComprobanteDecorator {
private ComprobanteElectronico comprobante;
	
	public LogoDecorator(){
		
	}
	public LogoDecorator(ComprobanteElectronico comprobante) {
		comprobante = this.comprobante;	
		detallesEmisor.add("Esto es un logo ");
	}
}

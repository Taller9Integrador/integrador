package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

public class LogoDecorator {
private ComprobanteElectronico comprobante;
	
	public LogoDecorator(){
		
	}
	public LogoDecorator(ComprobanteElectronico comprobante) {
		comprobante = this.comprobante;	
	}
}

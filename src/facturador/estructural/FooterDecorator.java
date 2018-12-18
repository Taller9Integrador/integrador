package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

public class FooterDecorator extends ComprobanteDecorator {
	private ComprobanteElectronico comprobante;
	
	public FooterDecorator(){
		
	}
	public FooterDecorator(ComprobanteElectronico comprobante) {
		comprobante = this.comprobante;
		detallesEmisor.add("Esto es un footer");
	
	}

}

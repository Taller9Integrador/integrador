package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

public class FooterDecorator {
	private ComprobanteElectronico comprobante;
	
	public FooterDecorator(){
		
	}
	public FooterDecorator(ComprobanteElectronico comprobante) {
		comprobante = this.comprobante;
	
	}

}

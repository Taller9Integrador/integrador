package facturador.comportamentales;

import facturador.creacional.ComprobanteElectronico;

public class EsquemaOnline implements Esquema {

	@Override
	public void autorizar(ComprobanteElectronico comprobante) {
		String codigo="TESTCODE"; // TODO: Conectarse a Internet y solicitar codigo al SRI
		
		if(codigo.equals(comprobante.getNumeroAutorizacion())) {
			System.out.println("ONLINE: Comprobante autorizado!");
			// Registrar el pago, etc
		} else {
			System.out.println("ONLINE: Comprobante no autorizado!");
			// Registrar pago erróneo
		}
	}

}

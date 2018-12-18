package facturador.comportamentales;

import facturador.creacional.ComprobanteElectronico;

public class EsquemaOffline implements Esquema {

	@Override
	public void autorizar(ComprobanteElectronico comprobante) {
		if(comprobante.getClaveAcceso().equals(comprobante.getNumeroAutorizacion())) {
			System.out.println("OFFLINE: Comprobante autorizado!");
			// Registrar el pago, etc
		} else {
			System.out.println("OFFLINE: Comprobante no autorizado!");
			// Registrar pago erróneo
		}
	}

}

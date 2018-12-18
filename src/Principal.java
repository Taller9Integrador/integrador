import java.util.ArrayList;
import java.util.List;

import facturador.creacional.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComprobantesFactory fab = new ComprobantesFactory();
	    Factura fac01 = (Factura) fab.getComprobante("Factura");
	    NotaCredito nc02 = (NotaCredito) fab.getComprobante("notacredito");
	    GuiaRemision gr03 = (GuiaRemision) fab.getComprobante("guiaremision");
	    
	    List<String> productos = new  ArrayList<String>();
	    productos.add("Disco Duro Externo 2TB");
	    productos.add("Memoria Ram 4GB");
	    fac01.setProductos(productos);
	    
	    nc02.setDetalleModificacion("Devolucion de Memoria en mal estado");
	    
	    gr03.setDestino("Ambato");
	    
	   System.out.println(fac01.toString());
	   System.out.println(nc02.toString());
	   //System.out.println(gr03.toString());
	}

}

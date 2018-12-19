import java.util.ArrayList;
import java.util.List;

import facturador.creacional.*;
import facturador.estructural.FooterDecorator;
import facturador.estructural.Imprimible;
import facturador.estructural.LogoDecorator;

public class Principal {

	public static void main(String[] args) {	
		ComprobantesFactory fab = new ComprobantesFactory();
	    Factura fac01 = (Factura) fab.getComprobante("Factura");
	    NotaCredito nc02 = (NotaCredito) fab.getComprobante("notacredito");
	    GuiaRemision gr03 = (GuiaRemision) fab.getComprobante("guiaremision");
	    
	    List<String> productos = new  ArrayList<String>();
	    productos.add("Disco Duro Externo 2TB");
	    productos.add("Memoria Ram 4GB");
	    fac01.setProductos(productos);
	    
	    nc02.setDetalleModificacion("Devolucion de Memoria en mal estado");
	    nc02.setValorAPagar(10);
	    nc02.setNombreCliente("Cliente A");
	    Imprimible nc02ConHeader=new LogoDecorator(nc02);
	    
	    gr03.setListaProductos(new ArrayList<>());
	    gr03.getListaProductos().add("Procesador Intel Core i9");
	    gr03.getListaProductos().add("Memoria RAM 4GB");
	    gr03.setDestino("Ambato");
	    Imprimible gr03ConHeaderYFooter=new FooterDecorator(new LogoDecorator(gr03));
	    
	    System.out.println(fac01.toString());
	    System.out.println("=============");
	    System.out.println(nc02ConHeader.toString()); // La nota de crédito tiene un header
	    System.out.println("=============");
	   	System.out.println(gr03.toString()); // La guia de remisión NO contiene header y footer
	   	System.out.println("=============");
	   	System.out.println(gr03ConHeaderYFooter.toString()); // Esta guia de remisión (la misma) contiene header y footer
	}

}

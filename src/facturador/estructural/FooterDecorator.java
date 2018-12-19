package facturador.estructural;

public class FooterDecorator implements Imprimible {
	private Imprimible comprobante;
	
	public FooterDecorator(Imprimible comprobante) {
		this.comprobante=comprobante;
	}

	@Override
	public String toString() {
		return comprobante.toString()+"Esto es un footer";
	}
}

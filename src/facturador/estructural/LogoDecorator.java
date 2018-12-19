package facturador.estructural;

public class LogoDecorator implements Imprimible {
	private Imprimible comprobante;
	
	public LogoDecorator(Imprimible comprobante) {
		this.comprobante=comprobante;
	}
	
	@Override
	public String toString() {
		return "Esto es un logo\n"+comprobante.toString();
	}
}

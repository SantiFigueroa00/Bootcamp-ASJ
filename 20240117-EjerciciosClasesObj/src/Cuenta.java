
public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public void ingresar(double cantidad) {
		if (cantidad>0) {
			this.cantidad+=cantidad;
		} else {
			System.out.println("No se puede ingresar una cantidad negativa");
		}
	}
	
	public void retirar(double cantidad) {
		
		if (cantidad>0) {
			this.cantidad-=cantidad;
			
			if (this.cantidad<0) {
				this.cantidad=0;
			}
			
		} else {
			System.out.println("No se puede retirar una cantidad negativa");
		}
		
	}
	
}

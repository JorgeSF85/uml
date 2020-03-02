package uml;

public class Colegio {
	//atributos
	String address;
	int anio_fund;
	
	//constructor
	public Colegio(String address, int anio_fund) {
		super();
		this.address = address;
		this.anio_fund = anio_fund;
	}

//metodos getters and setters
	public String getaddress() {
		return address;
	}


	public void setaddress(String address) {
		this.address = address;
	}


	public int getanio_fund() {
		return anio_fund;
	}


	public void setanio_fund(int anio_fund) {
		this.anio_fund = anio_fund;
	}


	@Override
	public String toString() {
		return "Colegio [address=" + address + ", anio_fund=" + anio_fund + "]";
	}
	
	

}

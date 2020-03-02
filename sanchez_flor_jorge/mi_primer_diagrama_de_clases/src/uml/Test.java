package uml;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Información del colegio");	
		Colegio col1= new Colegio("Avenida de los toreros, 125);
		System.out.println(col1);
		
		System.out.println("Información");
		proyecto_diagrama_uml per1 = new proyecto_diagrama_uml("Jorge Sánchez",314,new Date(0),"Juan",1);
		System.out.println(per1);
	}

}

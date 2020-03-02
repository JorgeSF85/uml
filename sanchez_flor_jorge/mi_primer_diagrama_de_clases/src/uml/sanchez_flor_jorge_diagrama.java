package uml;

import java.sql.Date;

/**
 * 
 * @author Jorge Sánchez-Flor Sánchez
 *
 */

public class proyecto_diagrama_uml extends Colegio{
	//atributos
	String Alumno;
	int id_alumno;
	Date fecha_reg;
	String Profesor;
	int id_prof;
	//constructor
	public proyecto_diagrama_uml(String alumno, int id_alumno, Date fecha_reg, String profesor,int id_prof) {
		super(profesor, id_prof);
		Alumno = alumno;
		id_alumno = id_alumno;
		this.fecha_reg = fecha_reg;
		Profesor = profesor;
		id_prof = id_prof;
	}
//metodos getters and setters
	public String getAlumno() {
		return Alumno;
	}

	public void setAlumno(String alumno) {
		Alumno = alumno;
	}

	public int getid_alumno() {
		return id_alumno;
	}

	public void setid_alumno(int id_alumno) {
		id_alumno = id_alumno;
	}

	public Date getfecha_reg() {
		return fecha_reg;
	}

	public void setfecha_reg(Date fecha_reg) {
		this.fecha_reg = fecha_reg;
	}

	public String getProfesor() {
		return Profesor;
	}

	public void setProfesor(String profesor) {
		Profesor = profesor;
	}

	public int getid_prof() {
		return id_prof;
	}

	public void setid_prof(int id_prof) {
		id_prof = id_prof;
	}

	@Override
	public String toString() {
		return "proyecto_diagrama_uml [Alumno=" + Alumno + ", id_alumno=" + id_alumno + ", fecha_reg="
				+ fecha_reg + ", Profesor=" + Profesor + ", id_prof=" + id_prof + "]";
	}

	
	
	

}

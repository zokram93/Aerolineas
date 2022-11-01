package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Empleado implements Comparable<Empleado>{
	private Integer id;
	private LocalDate fechaIngreso;
	private String nombre ;
	private Rol rol;
	private Generacion generaciones;
	
	public Empleado (Integer id, String nombre, LocalDate fechaIngreso, Rol rol, Generacion generacion){
	//super();
	this.id= id;
	this.nombre = nombre;
	this.fechaIngreso = fechaIngreso;
	this.rol = rol;
	this.generaciones = generacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Generacion getGeneraciones() {
		return generaciones;
	}

	public void setGeneraciones(Generacion generaciones) {
		this.generaciones = generaciones;
	}

	@Override
	public int compareTo(Empleado empleado) {
		return this.id.compareTo(empleado.id);
	}
	
}

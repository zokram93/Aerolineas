package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Empresa {
	private String nombre;
	private List<Empleado> empleados;
	private List<Generacion>generaciones;
	private Rol rol;
	
	public Empresa (String nombre) {
		this.empleados = new ArrayList<>();
		this.generaciones = this.crearGeneraciones();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Generacion> getGeneraciones() {
		return generaciones;
	}

	public void setGeneraciones(List<Generacion> generaciones) {
		this.generaciones = generaciones;
	}
	private ArrayList<Generacion> crearGeneraciones() {
		ArrayList<Generacion> generaciones = new ArrayList<>();
		generaciones.add(new Generacion (1, "g1"));
		generaciones.add(new Generacion (2, "g2"));
		generaciones.add(new Generacion (3, "g3"));
		return generaciones;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public Integer cantidadEmpleados() {
		// TODO Auto-generated method stub
		return this.empleados.size();
	}

	public Generacion buscarGeneracionPorId(Integer id) throws NoExisteLaGeneracionException {
		for (Generacion g : generaciones) {
			if(g.getId()==id) {
				return g;
			}
		}
		throw new NoExisteLaGeneracionException ("No se encuentra la generacion");
	}

	public void agregarGeneracion(Generacion generacion) {
		generaciones.add(generacion);
		
	}

	public Set<Empleado> obtenerEmpleadosOrdenadosPorId() {
		Set<Empleado> empleadosOrdenados = new TreeSet<>();
		empleadosOrdenados.addAll(this.empleados);
		return empleadosOrdenados;
	}

	public Set<Empleado> obtenerEmpleadosOrdenadosPorNombre() {
		Set<Empleado> empleadosOrdenados = new TreeSet <>(new OrdenEmpleadoPorNombre());
		empleadosOrdenados.addAll(empleados);
		return empleadosOrdenados;
	}
}

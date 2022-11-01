package ar.edu.unlam.pb2;

import java.util.Comparator;

public class OrdenEmpleadoPorNombre implements Comparator<Empleado>{

	public int compare(Empleado o1, Empleado o2) {
		if (o1.getNombre().compareTo(o2.getNombre())==0) {
			return o1.getId().compareTo(o2.getId());
		}
		return o1.getNombre().compareTo(o2.getNombre());
	}
}


package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Set;

import org.junit.Test;

public class TestVuelo {

	@Test
	public void queSePuedaAgregarUnEmpleado() {
		Empresa empresa = new Empresa("Aerolinias Argentinas");
		// OBTENER GENERACION DE LA EMPRESA
		Generacion generacion = new Generacion(1, "g2");
		// empresa.buscarGeneracionPorId(1);
		Empleado empleado = new Empleado(1, "Pablo Rocha", LocalDate.of(2008, 11, 24), Rol.PILOTO, generacion);
		empresa.agregarEmpleado(empleado);
		Integer valorEsperado = 1;
		Integer valorObtenido = empresa.cantidadEmpleados();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaBuscarGeneracionPorIdYQueNoSeEncuentra() {
		Empresa empresa = new Empresa("Aerolinias Argentinas");
		Generacion generacion = new Generacion(9, "g9");
		empresa.agregarGeneracion(generacion);
		Generacion valorEsperado = null;
		Generacion valorObtenido = null;
		try {
			valorObtenido = empresa.buscarGeneracionPorId(6);
		} catch (NoExisteLaGeneracionException e) {

			System.out.println(e.getMessage());
		}
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaObtenerUnaListaDeEmpleadosOrdenadosPorId() {
		Empresa empresa = new Empresa("Aerolinias Argentinas");
		Generacion generacion = new Generacion (9, "g6");
		Empleado empleado1 = new Empleado(123, "Maggie Simpson", LocalDate.of(2008, 11, 24), Rol.PILOTO, generacion);
		Empleado empleado2 = new Empleado(212, "Homer Simpson", LocalDate.of(2012, 9, 12), Rol.AZAFATA, generacion);
		Empleado empleado3 = new Empleado(333, "Marge Simpson", LocalDate.of(2010, 4, 2), Rol.PILOTO, generacion);
		Empleado empleado4 = new Empleado(441, "Lisa Simpson", LocalDate.of(2003, 11, 22), Rol.AZAFATA, generacion);
		Empleado empleado5 = new Empleado(15, "Bart Simpson", LocalDate.of(2015, 8, 20), Rol.PILOTO, generacion);
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		empresa.agregarEmpleado(empleado4);
		empresa.agregarEmpleado(empleado5);
		Set<Empleado>empleadosOrdenados = empresa.obtenerEmpleadosOrdenadosPorId();
		for(Empleado e : empleadosOrdenados ) {
			System.out.println(e.getId());
		}
	}
	@Test
	public void queSePuedaObtenerUnaListaOrdenadaPorNombre() {
		Empresa empresa = new Empresa("Aerolinias Argentinas");
		Generacion generacion = new Generacion (9, "g6");
		Empleado empleado1 = new Empleado(123, "Maggie Simpson", LocalDate.of(2008, 11, 24), Rol.PILOTO, generacion);
		Empleado empleado2 = new Empleado(212, "Homer Simpson", LocalDate.of(2012, 9, 12), Rol.AZAFATA, generacion);
		Empleado empleado3 = new Empleado(333, "Marge Simpson", LocalDate.of(2010, 4, 2), Rol.PILOTO, generacion);
		Empleado empleado4 = new Empleado(441, "Lisa Simpson", LocalDate.of(2003, 11, 22), Rol.AZAFATA, generacion);
		Empleado empleado5 = new Empleado(15, "Bart Simpson", LocalDate.of(2015, 8, 20), Rol.PILOTO, generacion);
		empresa.agregarEmpleado(empleado1);
		empresa.agregarEmpleado(empleado2);
		empresa.agregarEmpleado(empleado3);
		empresa.agregarEmpleado(empleado4);
		empresa.agregarEmpleado(empleado5);
		Set<Empleado>empleadosOrdenados = empresa.obtenerEmpleadosOrdenadosPorNombre();
		
		for (Empleado empleado : empleadosOrdenados) {
			System.out.println(empleado.getNombre());
		}
	}

}

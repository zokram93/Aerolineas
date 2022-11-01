package ar.edu.unlam.pb2;

public class Generacion {
	private Integer id;
	private String descripcion;
	
	// comprate to igual que treeset
	public Generacion (Integer id, String descripcion) {
		this.id = id ;
		this.descripcion = descripcion ;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

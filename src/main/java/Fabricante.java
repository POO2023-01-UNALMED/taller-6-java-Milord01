package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
    private int cantidadAutosCreados = 0;
    
    
	public Fabricante (String nombre, Pais pais ){
		this.nombre=nombre;
	    this.pais=pais;
	    listado.add(this);
	    
	    }
	
    public void setNombre(String nombreFabricante) {
		this.nombre = nombreFabricante;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}
public int getCantidadAutosCreados() {
	return cantidadAutosCreados;
}
public void setCantidadAutosCreados(int cantidadAutosCreados) {
	this.cantidadAutosCreados = cantidadAutosCreados;
}
public static ArrayList<Fabricante> getListado() {
	return listado;
}
public static void setListado(ArrayList<Fabricante> listado) {
	Fabricante.listado = listado;
}

public static Fabricante fabricaMayorVentas(){
	int valor=0;
	Fabricante fabricante=null;
	
	for(int i=0;i<listado.size();i++) { 
		if(listado.get(i).getCantidadAutosCreados() > valor){
			valor=listado.get(i).getCantidadAutosCreados();
			fabricante=listado.get(i);
		}
	}
	return fabricante;
}
}

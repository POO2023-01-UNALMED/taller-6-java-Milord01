package vehiculos;
import java.util.ArrayList;


public class Pais {
	private String nombre;
	private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
    private int cantidadAutosCreados = 0;
    
    
	public Pais (String nombre){
		this.nombre=nombre;
		listaPaises.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
    public String getNombre() {
	    return nombre;
}
public void setCantidadAutosCreados(int cantidadAutosCreados) {
	this.cantidadAutosCreados = cantidadAutosCreados;
}
public int getCantidadAutosCreados() {
	return cantidadAutosCreados;
}
public static void setListaPaises(ArrayList<Pais> listaPaises) {
	Pais.listaPaises = listaPaises;
}
public static ArrayList<Pais> getListaPaises() {
	return listaPaises;
}

public static Pais paisMasVendedor() {
	int valor=0;
	Pais pais=null;
	
	for(int i=0;i<listaPaises.size();i++) { 
		if(listaPaises.get(i).getCantidadAutosCreados() > valor){
			valor=listaPaises.get(i).getCantidadAutosCreados();
			pais=listaPaises.get(i);
		}
	}
	return pais;
}

}

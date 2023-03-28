package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    static int CantidadVehiculos;
    
    static {
    	CantidadVehiculos=0;
    }
    
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos+=1;
		fabricante.setCantidadAutosCreados(fabricante.getCantidadAutosCreados()+1);
        fabricante.getPais().setCantidadAutosCreados(fabricante.getPais().getCantidadAutosCreados()+1);
		
	}
	
    public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
public void setNombre(String nombre) {
		this.nombre = nombre;
	}
public void setPeso(int peso) {
		this.peso = peso;
	}
public void setPlaca(String placa) {
		this.placa = placa;
	}
public void setPrecio(int precio) {
	this.precio = precio;
}
public void setPuertas(short puertas) {
	this.puertas = puertas;
}
public void setTraccion(String traccion) {
	this.traccion = traccion;
}
public void setVelocidadMaxima(int velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
}

public static int getCantidadVehiculos() {
	return CantidadVehiculos;
}
public Fabricante getFabricante() {
	return fabricante;
}
public String getNombre() {
	return nombre;
}
public int getPeso() {
	return peso;
}
public String getPlaca() {
	return placa;
}
public int getPrecio() {
	return precio;
}
public int getPuertas() {
	return puertas;
}
public String getTraccion() {
	return traccion;
}
public int getVelocidadMaxima() {
	return velocidadMaxima;
}

public static String vehiculosPorTipo() {
	return "Automoviles: "+Automovil.getCantidadAutomoviles()+"\nCamiones: "+
Camion.getCantidadCamiones()+"\nCamionetas: "+Camioneta.getCantidadCamionetas();
	
}
}


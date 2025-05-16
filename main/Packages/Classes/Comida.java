package Packages.Classes;
import java.util.*;

public class Comida{
	
	public String nombrePlato;
	public double precio;
	public String tipoPlato;	
	
	public Scanner scan = new Scanner(System.in);
	
	public String agregar(String plato, double precio, String tipo){	    
		return plato + "  $" + precio +"  "+ tipo;
	}
	
	
	
} 
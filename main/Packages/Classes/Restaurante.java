package Packages.Classes;
import java.util.*;

public class Restaurante{
	
	public String nombre, opcion;
	public String[] platos = new String[6];
	private int opcion;
	private boolean reingreso = true;
	
	Comida comida = new Comida();
		
	public void ComidaMenu(){	
		platos[0] = comida.agregar("Spaghetti",15.50,"Principal");
		platos[1] = comida.agregar("Ensalada",15.50,"Principal");
		platos[2] = comida.agregar("Pizza",15.50,"Principal");
		platos[3] = comida.agregar("Lasagna",15.50,"Principal");
		platos[4] = comida.agregar("Sopa",15.50,"Principal");
		platos[5] = comida.agregar("Canelones",15.50,"Principal");		
	}
	
	public void Menu(){	
	    ComidaMenu();
	    System.out.println("Seleccione una opcion: ");
		for (int i = 1; i < platos.length; i++){			
			System.out.println(i+". "+platos[i]);
		}		
		opcion = comida.scan.nextInt();
	}
	
	public double CalcularPedidos(){
		while (reingreso){
			switch(opcion){
			  case 1:
			  break;
			  case 2:
			  break;
			  case 3:
			  break;
			  case 4:
			  break;
			}		
		}
	}
	
    private boolean Valido(){
		System.out.println("Desea Elegir otro plato ? s/n");
		
		if(){
			
		}
	}
	
	
} 
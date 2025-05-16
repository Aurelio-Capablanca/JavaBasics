/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

/**
 * * Uso de mètodos estaticos, normales y void
 * determinar la nota final de POO, mostrar nombre de universidad, asginatura, alumno, nota final
 * 
 * @author Honorè Reille
 */
public class Universidad {
    
    
    private static String nombreuniversidad;
    private String nombrealumno, nombreasignatura;
    private double notafinal;
    
    public static void UniversidadNombre(){
        System.out.println(nombreuniversidad = " UTEC ");        
    }
    
    public static String asignatura(String nombre, String seccion){
        Universidad un = new Universidad();
        un.nombreasignatura = "Nombre Asignatura: "+nombre+" \nSeccion: "+seccion;
        return un.nombreasignatura;
    }
    
    public String nombres(String nombre, String carnet){
      nombrealumno = "Nombre: "+nombre+" \nCarnet: "+carnet;      
      return nombrealumno;      
    }
    
    public void notafinal(double control, double guia, double examen){
        notafinal = (control+guia+examen)/3;
        System.out.println("\nla nota final es: "+notafinal);
    }
    
}

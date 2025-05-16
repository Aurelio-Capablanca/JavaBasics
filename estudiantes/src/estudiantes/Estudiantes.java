/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Lab-11
 */
class Alumno {

    public int Id;
    public String name;
    public int edad;
    public int[] idCurso;

    public Alumno(int Id, String name, int edad, int[] idCurso) {
        this.Id = Id;
        this.name = name;
        this.edad = edad;
        this.idCurso = idCurso;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public int[] getIdCurso() {
        return idCurso;
    }

}

public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        String[] nombres = new String[]{"joaquin", "manuel", "roberto", "mardoqueo", "emerson", "fernando", "ernesto", "alvaro"};
        int[] cursos = new int[]{3, 45, 23, 5, 3, 51, 2, 32, 3, 5, 34, 66, 34};
        Alumno[] alumno = new Alumno[5];
        //alumno[0] = new Alumno(1,"c",20,cursos);
        int[] asignados = new int[3];
        for (int i = 0; i < alumno.length; i++) {
            for (int h = 0; h < asignados.length; h++) {
                asignados[h] = cursos[(int) ((Math.random() * (13 - 1)) + 1)];
            }
            alumno[i] = new Alumno((i + 1), nombres[(int) ((Math.random() * (8 - 1)) + 1)], (int) ((Math.random() * (40 - 20)) + 20), asignados);
            System.out.println(" --------------- \n" + "ID: " + alumno[i].getId() + "\n"
                    + "Nombre: " + alumno[i].getName() + "\n"
                    + "Edad: " + alumno[i].getEdad() + "\n"
                    + "Cursos: " + Arrays.toString(alumno[i].getIdCurso()));
        }

    }

}

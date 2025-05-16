/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package separarstrings;

/**
 *
 * Ejercicio: Haciendo uso de la clase LeerArchivo trabajada en clase. Se
 * necesita haga uso de ella para leer un archivo llamado Texto.txt (compartido
 * en aula virtual). Para lo cual se le solicitan las diferentes
 * funcionalidades: * 1. Retornar la cantidad de palabras (se tomará como
 * referencia el espacio) * 2. Retornar la cantidad de espacios * 3. Retornar la
 * cantidad de palabras tildadas * 4. Retornar las palabras que inicien con la
 * letra “n” * 5. Retornar las palabras que terminen con la letra “e” * 6. Salir
 *
 *
 */
public class funcionalidades {

    private final LeerArchivos read = new LeerArchivos();

    private String texto = read.leerGrafico();
    private String[] palabras = texto.split(" ");

    
    public void cantidadPalabras() {
        System.out.println("La cantidad de palabras es de : " + palabras.length);
    }

    public void cantidadEspacios() {
        int contar = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                contar++;
            }
        }
        System.out.println("la cantidad de espacios es de : " + contar);
    }

    public void inicioN() {
        int contar = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].startsWith("n")) {
                contar++;
            }
        }
        System.out.println("La cantidad de palabras que inician en 'n' es de: " + contar);
    }

    public void finalE() {
        int contar = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].endsWith("e")) {
                contar++;
            }
        }
        System.out.println("La cantidad de palabras que terminan en 'e' es de: " + contar);
    }

    public void palabrasTildadas() {
        int contar = 0;
        char[] coleccionTildes = new char[]{'á', 'é', 'í', 'ó', 'ú'};
        for (int i = 0; i < palabras.length; i++) {
            String caracteres = palabras[i];
            for (int j = 0; j < caracteres.length(); j++) {
                for (int k = 0; k < coleccionTildes.length; k++) {
                    if (caracteres.charAt(j) == coleccionTildes[k]) {
                        contar++;
                    }
                }
            }
        }
        System.out.println("palabras con tildes: " + contar);
    }
}

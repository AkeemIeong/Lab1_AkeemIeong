package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
                
        System.out.println("Bienvenido al sistema de calculo de promesio");
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraclase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaclase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraclase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaclase = entrada.nextDouble();
        
        double sumaClase = primeraclase+segundaclase+terceraclase+cuartaclase;
        double promedio = sumaClase/4;
        
         System.out.println(nombre + "el promedio de las cuatros clases es: " + promedio);
    }
    
}

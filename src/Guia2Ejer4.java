

import Model.Cilindro;
import Model.Circulo;

public class Guia2Ejer4 {

    public static void main(String[] args) {
       
        Cilindro cilindro1 = new Cilindro();
        Cilindro cilindro2 = new Cilindro(12.0,"Azul",30.0);
        
        cilindro1.imprimir();
        cilindro1.calcularArea();
        cilindro1.calcularVolumen();
        
        System.out.println("");
        
        cilindro2.imprimir();
        cilindro2.calcularArea();
        cilindro2.calcularVolumen();
        
    }
    
}

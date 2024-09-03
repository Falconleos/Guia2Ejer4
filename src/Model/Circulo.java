

package Model;

import java.util.Objects;


public class Circulo {
    
    private Double radio;
    private String color;

    public Circulo(){
        this.radio = 1.0;
        this.color = "Rojo";
    }
    
    public Circulo(Double radio,String color) {
        this.radio = radio;
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Double getRadio(){
        return this.radio;
    }
    public void setRadio(Double radio){
        this.radio = radio;
    }
    
    
    public Double calcularArea(){
        Double area = Math.PI * radio * radio;
    return area;
    }
    
    public void imprimir(){
        System.out.println("Circulo:"
                + "Radio:" + this.radio +
                "Color:" + this.color);
    }
    
    

   
    
    
    
}

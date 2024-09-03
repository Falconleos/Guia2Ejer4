
package Model;

public class Cilindro extends Circulo{
    
    Double altura;
    
    public Cilindro(){
        super();
        this.altura = 1.0;
    }

    public Cilindro(Double radio, String color,Double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Double calcularVolumen(){
        Double volumen = super.calcularArea() * altura;
        System.out.println("Volumen: " + volumen);
        return volumen; 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("altura = " + altura);
    }

    @Override
    public Double calcularArea() {
        Double area = 2 * Math.PI * getRadio() * altura + 2 * super.calcularArea();
        System.out.println("Area: " + area);
        return area;
    }
    
   
    
    
    
    
    
    
}

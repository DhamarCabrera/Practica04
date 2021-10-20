public class Rectangulo{
    private double altura;
    private double base;

  
    public Rectangulo (double altura, double base){
	this.altura=altura;
	this.base=base;
    }
    
    public Rectangulo(){
	this.altura=25.9;
	this.base=21.5;
    }
    //***************************************************************//
    public void setPerimetro(double altura, double base){
	this.altura=altura;
	this.base=base;
    }
    public String getPerimetro(){
	return "El rectángulo con altura: " + this.altura + " y base: " + this.base + ". Tiene un perímetro de: " + (this.altura*2 + this.base*2);
    }

    
    public void setArea(double base, double area){
	this.base=base;
	this.altura=altura;
	}
    public String getArea(){
	return " y una área de: " + (this.base*this.altura);
    }
    
    
     //******************* predeterminado ************************//
    public String toString(){
	return "El rectángulo con altura: " + this.altura + " y base: " + this.base + ". Tiene un perímetro de: " + (this.altura*2 + this.base*2)+ " y una área de: " + (this.altura*this.base);
    }
}

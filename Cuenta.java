public class Cuenta{
    private String titular;
    private double dineroDisponible;


    public Cuenta () {
	this.titular="Churro";
	this.dineroDisponible=75.18;
    }

    //***************************************************//    
    public Cuenta(double dineroDisponible){
	this.titular=titular;
	this.dineroDisponible=0;
    }

    public String toString(){
	    return "0";
	}
    //***************************************************//
    
    public String getTitular(){
	return this.titular;
    }
    public void setTitular(String titular){
	this.titular=titular;
    }
    public double getDineroDisponible(){
	return this.dineroDisponible;
    }
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible=0;
    	    }
}

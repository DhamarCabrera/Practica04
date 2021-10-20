public class MainCuenta{
    public static void main(String[] args){
	Cuenta dealguien = new Cuenta();

	System.out.println();
	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

	System.out.print(" >>>>>   ");
	System.out.print("Titular de la cuenta: ");
	System.out.println(dealguien.getTitular() + "   <<<<<");
	
	System.out.print("    ----> ");
	System.out.print("Dinero Disponible: ");
	System.out.println(dealguien.getDineroDisponible()+ " <----");

	
	//*****************************************************//
	System.out.println();

	Cuenta dealguienmas = new Cuenta();
	    
	System.out.print(" >>>>>   ");
	System.out.print("Titular de la cuenta: ");
	dealguienmas.setTitular("Kailani");
	System.out.println(dealguienmas.getTitular()+"   <<<<<");
	
	System.out.print("    ----> ");
	System.out.print("Dinero Disponible: ");
	System.out.println(dealguienmas.toString() + " <----");

	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
	System.out.println();
    }
}

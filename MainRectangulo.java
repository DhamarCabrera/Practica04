public class MainRectangulo{
    public static void main(String[] args){

	System.out.println();
	Rectangulo predeterminado = new Rectangulo();
	System.out.println(" ->  " +predeterminado.toString());

	System.out.println();
	
	Rectangulo deparametros = new Rectangulo();
	deparametros.setPerimetro(28.14, 11.08);
	System.out.print(" ->  " +deparametros.getPerimetro());
	deparametros.setArea(28.14, 11.08);
	System.out.println(deparametros.getArea());
	System.out.println();
    }
}

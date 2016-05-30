public class Adios{
	public static void main(String args[]){
		System.out.println("Adios");
		System.out.println("Estado: "+boleano());
	}
	
	public boolean boleano(){
		return true;
	}

	public String generarSaludo(String nombre){
		return "Hola ".concat(nombre);
	}
	public void holaMundo(){
		System.out.println("Hola mundo ");
	}
	
	public void adiosMundo(){
		System.out.println("Adios mundo ");
	}
}

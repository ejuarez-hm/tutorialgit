/**
 * Version de lanzamiento con gitflow nuevas versiones 
 */
public class Adios{
	public static void main(String args[]){
		System.out.println("Adios");
		Adios adiosObj = new Adios();
		System.out.println("Estado: "+adiosObj.boleano());
		System.out.println("Resultado: "+adiosObj.multiplicar());
		adiosObj.imprime();
	}
	
	public boolean boleano(){
		return true;
	}

	public void  mensaje(){
		System.out.println("Este es un mensaje.");
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
	public void imprime(){
		
		System.out.println("Maquina esteban");

	}
	
	public int multiplicar(){
		return 2*2;
	}
}

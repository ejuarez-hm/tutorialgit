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
	
	public void  mensaje2(){
		System.out.println("Este es un mensaje 2.");
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
		
		System.out.println("Maquina hermanos maristas");

	}
<<<<<<< HEAD
	public void EJMetodo{
		System.out.println("cambio");
=======
	
	public int multiplicar(){
		return 2*2;
>>>>>>> 6c7fe0f39e4b624c8dc53749302a0f798709800a
	}
}

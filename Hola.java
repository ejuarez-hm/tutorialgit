/**
 * Documentando cambios  
 */
public class Hola{

	public static void main(String args[]){
		System.out.println("Hola mundo");
		Hola objeto = new Hola();
		String hola=objeto.holaPersonalizado();
		System.out.println(hola);
		objeto.holaATodos();
		
	}
	public void mensaje(){
		System.out.println("Función mensaje");
		System.out.println("Función mensaje 2"); 
		System.out.println("Funcion mensaje en metodo mynor de pc esteban");
		
	}
	public String mensaje_cda(){
		System.out.println("Función mensaje");
		System.out.println("Función mensaje 2");
		return "Hola";
	}
	
	public String mensaje2(){
		System.out.println("Función mensaje2");
		System.out.println("Función mensaje2 linea 2");
		return "Hola2";
	}
	
	public int suma(){
		int a=1;
		int b=2;
		System.out.println("Hola desde suma");
		System.out.println("Hola desde suma dos veces");
		return a+b;
	}
	
	public boolean cambio_ej(){
		boolean a=true;
		return a;
	}

	public int sumaJ(){
		int p0 = 0;
		int p1 = 1;
		return 1+1;
	}

	
	public void saltos(){
		System.out.println("***TEST****");
		System.out.println("LINEA 2....");
		System.out.println("LINEA 3....");
		System.out.println("LINEA 4....");
	}
	public int funcion_ej(){
		int a;
		a=15;
		System.out.println("Linea agregada por esteban");
		int b=15;
		return a;
	}

	public String holaPersonalizado(){
		System.out.println("nueva linea");
		System.out.println("segunda linea ");
		return "hola cande!";
	}

	public String holaPersonalizadoDos(){
		System.out.println("nueva linea");
		System.out.println("segunda linea ");
		System.out.println("tercera linea ");
		return "hola cande!";
	}


	public void holaATodos(){
		System.out.println("Hola a todos los miembros del curso de Git");
	}


}

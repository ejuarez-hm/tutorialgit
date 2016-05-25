public class Hola{

	public static void main(String args[]){
		System.out.println("Hola mundo");
		Hola objeto = new Hola();
		String hola=objeto.holaPersonalizado();
		System.out.println(hola);
		System.out.println(objeto.holaATodos());
	}
	public String mensaje(){
		System.out.println("Función mensaje");
		System.out.println("Función mensaje 2");
		return "Hola";
	}

	public int suma(){
		int a=1;
		int b=2;
		System.out.println("Hola desde suma");
		System.out.println("Hola desde suma dos veces");
		return a+b;
	}

	public int sumaJ(){
		int p0 = 0;
		int p1 = 1;
		return 1+1;
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

	public void holaATodos(){
		System.out.println("Hola a todos los miembros del curso de Git");
	}

}

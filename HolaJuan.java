public class HolaJuan{
	public static void main(String args[]){
		HolaJuan b = new HolaJuan();
		System.out.println(b.bienevenida());
		System.out.println(b.palabras());
		System.out.println(b.despedida());
		System.out.println("Hola amigo Juan");
	}
	
	public String bienevenida(){
		return "Bienvenido";
	}
	public String palabras(){
		System.out.println("mas palabras");
		System.out.println("Otras palabras");
		return "GITFLOW";
	}
	public String despedida(){
		return "Adios";
	}
}

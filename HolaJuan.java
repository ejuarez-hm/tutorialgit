public class HolaJuan{
	public static void main(String args[]){
		HolaJuan b = new HolaJuan();
		System.out.println(bienevenida());
		System.out.println(palabras());
		System.out.println(despedida());
	}
	
	public String bienevenida(){
		return "Bienvenido";
	}
	public String palabras(){
		return "GITFLOW";
	}
	public String despedida(){
		return "Adios";
	}
}
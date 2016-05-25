public class Hola{

	public static void main(String args[]){
		System.out.println("Hola mundo");
		String hola=holaPersonalizado();
		System.out.println(hola);
	}
	
	public String holaPersonalizado(){
		System.out.println("nueva linea");
		System.out.println("segunda linea ");
		return "hola cande!";
	}
}

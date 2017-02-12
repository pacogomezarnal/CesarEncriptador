
public class Cesar {
	//Abecedario
	private String abcd="abcdefghijklmnñopqrstuvwxyz";
	private int paso=2;
	//Abecedario codificado
	private String abcdCesar="";
	
	public Cesar() {
		//Codificamos el abcederario
		codificarAbcd();
	}
	
	private void codificarAbcd(){
		//Dividir
		String parteInic=abcd.substring(0, paso);
		String parteFin=abcd.substring(paso, abcd.length());
		this.abcdCesar=parteFin+parteInic;
	}
	public String codificar(String mensaje){
		char letra=' ';
		int posicion=0;
		String mensajeCodifi="";
		for(int i=0;i<mensaje.length();i++){
			letra=mensaje.charAt(i);
			posicion=abcd.indexOf(letra);
			mensajeCodifi=mensajeCodifi+this.abcdCesar.charAt(posicion);
		}
		return "";
	}
	
	

}

package co.edu.eia;

public class EClientDoesnotExist extends Exception {
	public EClientDoesnotExist(){
		 super("no existe un cliente que tenga esa CC. ");
	 }
}

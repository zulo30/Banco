package co.edu.eia;

class ENegativeValue extends Exception  {
	 public ENegativeValue(){
		 super("El valor es negativo");
	 }

}
class EValueGreaterThanBalance extends Exception  {
	 public EValueGreaterThanBalance(){
		 super("El valor es Mayor al saldo");
	 }

}
class  ETypeNotValid extends Exception  {
	 public  ETypeNotValid(){
		 super("El tipo no es valido");
	 }

}
class  EAccountDeactivated extends Exception  {
	 public  EAccountDeactivated (){
		 super("la cuenta esta bloqueda");
	 }

}
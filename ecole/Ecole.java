
public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professeur prof=new Professeur("hafidi",1,"hafidi@gmail.com","chef");
		module mod=new module("GPI",2,49,prof);
		mod.afficher();
	}

}

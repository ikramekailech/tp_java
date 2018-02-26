
public class Joueur {

	public static void main(String[] args) {
		
		Grille grille1=new Grille();
		Grille grille2=new Grille();
		Joueur joueur1=new Joueur("sara",grille1);
		Joueur joueur2=new Joueur("khaoula",grille2);
		Jeu monjeu=new Jeu(joueur1,joueur2);
		monjeu.demarre();
		
		
	}
	private String nom;
	private Grille grille;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Grille getGrille() {
		return grille;
	}
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	public Joueur(String nom, Grille grille) {
		super();
		this.nom = nom;
		this.grille = grille;
	}
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joueur(String nom) {
		super();
		this.nom = nom;
	}
	
	

	

}

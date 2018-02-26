
public class Professeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professeur prof=new Professeur("hafidi",200,"hafidi@gmail.com","chef departement");
		prof.afficher();

	}
	private String nom;
	private Integer  nummerSomme;
	private String email;
	private String grade;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNummerSomme() {
		return nummerSomme;
	}
	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Professeur(String nom, Integer nummerSomme, String email, String grade) {
		super();
		this.nom = nom;
		this.nummerSomme = nummerSomme;
		this.email = email;
		this.grade = grade;
	}
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Professeur [nom=" + nom + ", nummerSomme=" + nummerSomme + ", email=" + email + ", grade=" + grade
				+ "]";
	}
public void afficher()
{
	System.out.println(toString());
}
	
	
	

}

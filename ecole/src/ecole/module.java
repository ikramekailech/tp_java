package ecole;

public class module {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	private String libelle;
	private Integer coefficient;
	private Integer  nbrHeures;
	private Professeur enseignent;
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libellé) {
		this.libelle = libelle;
	}
	public Integer getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	public Integer getNbrHeures() {
		return nbrHeures;
	}
	public void setNbrHeures(Integer nbrHeures) {
		this.nbrHeures = nbrHeures;
	}
	public Professeur getEnseignent() {
		return enseignent;
	}
	public void setEnseignent(Professeur enseignent) {
		this.enseignent = enseignent;
	}
	public module(String libelle, Integer coefficient, Integer nbrHeures, Professeur enseignent) {
		super();
		this.libelle = libelle;
		this.coefficient = coefficient;
		this.nbrHeures = nbrHeures;
		this.enseignent = enseignent;
	}
	public module() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "module [libelle=" + libelle + ", coefficient=" + coefficient + ", nbrHeures=" + nbrHeures
				+ ", enseignent=" + enseignent + "]";
	}
	
	
	public void afficher()
	{
		System.out.println(toString());
	}
	
}


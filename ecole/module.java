
public class module {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	private String libellé;
	private Integer coefficient;
	private Integer  nbrHeures;
	private Professeur enseignent;
	public String getLibellé() {
		return libellé;
	}
	public void setLibellé(String libellé) {
		this.libellé = libellé;
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
	public module(String libellé, Integer coefficient, Integer nbrHeures, Professeur enseignent) {
		super();
		this.libellé = libellé;
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
		return "module [libellé=" + libellé + ", coefficient=" + coefficient + ", nbrHeures=" + nbrHeures
				+ ", enseignent=" + enseignent + "]";
	}
	
	
	public void afficher()
	{
		System.out.println(toString());
	}
	
}

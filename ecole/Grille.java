
public class Grille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case[][] matrice1=new Case[10][10];
		Grille grille1=new Grille(matrice1);
		grille1.tir(1,2);
		grille1.afficheTirs();

	}
	
	public Case[][] matrice=new Case[10][10];
	
	public void tir(int i,int j)
	{
		this.matrice[i][j].setEtat(true);
		/**au cas du tir l etat de la case change en true*/
	}

	public Grille() {
		super();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				this.matrice[i][j]=new Case(); 
				/** constructeur d'une grille qui fait 
				                                appel à des cases qui prennent la valeur False*/
			}
		}
	}
	
	public void afficheTirs()
	{	int i,j;
		for(i=0;i<10;i++)
		{
		for(j=0;j<10;j++)
		{
			if(matrice[i][j].isEtat()==false)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("o");
			}
			
		}
		System.out.println();
		}
		
	}
	

}

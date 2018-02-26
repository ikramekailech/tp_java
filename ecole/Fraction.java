import java.math.BigInteger;

public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac=new Fraction(3000,200);
		Fraction frac2=new Fraction(3000,20);
		frac.add(frac2);

	}
	private BigInteger numerateur;
	private BigInteger denominateur;
	public Fraction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fraction(BigInteger numerateur, BigInteger denominateur) {
		super();
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}
	public Fraction(int numerateur, int denominateur) {
		super();
		this.numerateur = BigInteger.valueOf(numerateur);
		this.denominateur = BigInteger.valueOf(denominateur);
	}
	public Fraction(int numerateur) {
		super();
		this.numerateur = BigInteger.valueOf(numerateur);
		this.denominateur = BigInteger.valueOf(1);
	}
	public Fraction add(Fraction ma)
	{
		Fraction result= new Fraction();
		result.numerateur=this.denominateur.multiply(ma.numerateur).add(this.numerateur.multiply(ma.denominateur));
		result.denominateur= this.denominateur.multiply(ma.denominateur);
		return(result);
	}
	public Fraction sub(Fraction f)
	{
		Fraction result= new Fraction();
		result.numerateur=this.denominateur.multiply(f.numerateur).subtract(this.numerateur.multiply(f.denominateur));
		result.denominateur= this.denominateur.multiply(f.denominateur);
		return(result);
	}
	public Fraction mult(Fraction f) 
	{
		Fraction result= new Fraction();
		result.numerateur=this.numerateur.multiply(f.numerateur);
		result.denominateur=this.denominateur.multiply(f.denominateur);
		return (result);
	}
	public Fraction divi(Fraction f) 
	{
		Fraction result= new Fraction();
		result.numerateur=this.numerateur.multiply(f.denominateur);
		result.denominateur=this.denominateur.multiply(f.numerateur);
		return (result);
	}
	@Override
	public String toString() {
		return "Fraction [numerateur=" + numerateur + ", denominateur=" + denominateur + "]";
	}
	public double doubleValue(Fraction f)
	{
		BigInteger result;
		double t;
		result=f.numerateur.divide(f.denominateur);
		t=result.doubleValue();
		return (t);
	}
}

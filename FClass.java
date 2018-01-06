import java.math.*;

public class FClass extends GClass{

  //fields
  private Arraylist<double> catGrades;
  private double fGrade;

  //constructor
  public FClass(String className, int categoryNumber, Arraylist<String> categoryNames, Arraylist<double> categoryWeights, Arraylist<double> categoryGrades){
    super(className, categoryNumber, categoryNames, categoryWeights);
    setCatGrades(categoryGrades);
    calcFGrade();
  }

  //calculates final grade directly from constructor. this is a completed class so there will be a final grade to compute.
  public double calcFGrade()
	{
		this.fGrade = 0;
    Arraylist<double> tCW = super.getCatWeights();
		for(int i = 0; i < super.getCatNum(); i++)
			fGrade += this.catGrades.get(i)*(tCW.get(i)/100);
  	if(fGrade != 100){
  	BigDecimal bd = new BigDecimal(fGrade);
		bd = bd.round(new MathContext(3));
		double rounded = bd.doubleValue();
		this.fGrade = rounded;
    }
    return fGrade;
	}

  //getters
  public Arraylist<double> getCatGrades() {
		return this.catGrades;
	}

  public double getFGrade(){
    return this.fGrade;
  }

  //setters ... FGrade has no setter because it's a calculated value.
  public void setCatGrades(Arraylist<double> cGs) {
		this.catGrades = cGs;
	}

  	//looks good to me, except toString() should never be static. It uses
  	//the attributes of this Instance of the object to print it, so it should
  	//be non static. -L 12.23
  public String toString() {
  	String myReturn = "In your class, " + super.getName() + ", you scored ";
  	int i = 0;
    Arraylist<String> tCN = super.getCatNames();
    Arraylist<double> tCW = super.getCatWeights();
		while(i < super.getCatNum()-1) {
  		myReturn += (this.catGrades.get(i) + " on the " + tCN.get(i) + " which is worth "
  				+ tCW.get(i) + "%,");
  		i++;
  		}
		myReturn += (" and "+ this.catGrades.get(i) + " on the " + tCN.get(i) + " which is worth "
        + tCW.get(i) + "%. Your final grade is " + fGrade + ".");
		return myReturn;
  	}
}

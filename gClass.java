import java.util.Scanner;
import java.math.*;

public class gClass {

	// fields
	private String name;
	private int catNum;
	private String[] catNames;
	private double[] catWeights;
	private double[] catGrades;
	private double fGrade;
	// butchered the constructor bc it didn't make sense to me -M 12.21

	public gClass(String className, int categoryNumber) {
		setName(className);
		setCatNum(categoryNumber);
	}
	public gClass(String className, int categoryNumber, String[] categoryNames, double[] categoryWeights, double[] categoryGrades) {
		setName(className);
		setCatNum(categoryNumber);
		setCatNames(categoryNames);
		setCatWeights(categoryWeights);
		setCatGrades(categoryGrades);
	}
	// we may need to create another constructor if we have a case where we already have all the info for some reason -L 12.23

	// WE SHOULD MAKE A CLASS UnfinishedClass THAT EXTENDS THIS ONE WHICH HANDLES THE WHOLE "WHAT DO I NEED TO GET" OPERATION
	public double calcFGrade()
	{
		this.fGrade = 0;
		for(int i = 0; i < catNum; i++)
			fGrade += catGrades[i]*(catWeights[i]/100);
		return fGrade;
	}
	// getter methods -M 12.21
	public String getName() {
		return this.name;
	}

	public double [] getWeights() {
		return this.catWeights;
	}

	public String [] getCatNames() {
		return this.catNames;
	}

	public double [] getCatGrades() {
		return this.catGrades;
	}

	public int getCatNum() {
		return this.catNum;
	}

	// setter methods -L 12.23
	public void setName(String n) {
		this.name = n;
	}

	public void setCatWeights(double [] cWs) {
		this.catWeights = cWs;
	}

	public void setCatNames(String [] cNs) {
		this.catNames = cNs;
	}

	public void setCatGrades(double [] cGs) {
		this.catGrades = cGs;
	}

	public void setCatNum(int n) {
		this.catNum = n;
	}


	//looks good to me, except toString() should never be static. It uses
	//the attributes of this Instance of the object to print it, so it should
	//be non static. -L 12.23
	public String toString() {
		double fG = calcFGrade();
		if(fG != 100){
		BigDecimal bd = new BigDecimal(fG);
		bd = bd.round(new MathContext(3));
		double rounded = bd.doubleValue();
		fG = rounded;
		}

		String myReturn = "In your class, " + this.name + ", you scored ";
		int i = 0;
		while(i < this.catNum-1) {
			myReturn += (this.catGrades[i] + " on the " + this.catNames[i] + " which is worth "
					+ this.catWeights[i] + "%,");
			i++;
		}
		myReturn += (" and "+ this.catGrades[i] + " on the " + this.catNames[i] + " which is worth "
				+ this.catWeights[i] + "%. Your final grade is " + fG + ".");
		return myReturn;
	}
}

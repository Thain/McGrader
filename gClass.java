import java.util.Scanner;

public class gClass {

	// fields
	private String name;
	private int catNum;
	private String[] catNames;
	private double[] catWeights;
	private double[] catGrades;
	// butchered the constructor bc it didn't make sense to me -M 12.21

	public gClass(String className, int categoryNumber) {
		setName(className);
		setCatNum(categoryNumber);
	}
	// we may need to create another constructor if we have a case where we already have all the info for some reason -L 12.23

	// WE SHOULD MAKE A CLASS UnfinishedClass THAT EXTENDS THIS ONE WHICH HANDLES THE WHOLE "WHAT DO I NEED TO GET" OPERATION

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
		String myReturn = "In your class, " + this.name + " , you scored ";
		for (int i = 0; i < this.catNum; i++) {
			myReturn += (this.catNames[i] + " on the " + this.catGrades[i] + " which is worth "
					+ this.catWeights[i] + "%.");
		}
		return myReturn;
	}
}

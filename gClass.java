import java.util.Scanner;

public class gClass {

  //fields
  private String name;
  private int catNum;
  private double[] catWeights;
  private String[] catNames;
  private double[] catGrades;

  public gClass(String className, int categoryNumber, double[] categoryWeights, String[] categoryNames, double[] cateogryGrades)
  {
    //added this keywords - M 12.21
	this.name = className;
    this.catNum = categoryNumber;
    this.catWeights = categoryWeights;
    this.catNames = categoryNames;
    this.catGrades = cateogryGrades;
  }
  //method to populate categoryWeights and names -M 12.21
  //takes a loooot of input -M 12.21
  public void setCats() {
	  Scanner input = new Scanner(System.in);
	  //take dat input
	  System.out.println("How many categories make up your grade?");
	  this.catNum = input.nextInt();
	  this.catWeights = new double[catNum];
	  this.catNames = new String[catNum];
	  System.out.println("What are those categories?")
	  for (int i = 0; i < catNum; i++) 
		  this.catNames[i] = input.nextLine();
	  System.out.println("How much is each category worth? (%)")
	  for (int i = 0; i < catNum; i++)
		  this.catWeights[i] = input.nextDouble();
	  //populate those arrays -M 12.21
  }
  public void setGrades() {
	  //same deal as setCats, just a lil seperate
	  Scanner input = new Scanner(System.in);
	  this.catGrades = new double[this.catNum];
	  for (int i = 0; i < this.catNames.lengh; i++) {
		  System.out.println("What was your grade on the " + this.catNames[i]+"? ");
		  double myGrade  = input.nextDouble();
		  //populate catGrades
		  this.catGrades[i] = myGrade;
	  }
	  
  }
  //get methods for all the categories -M 12.21
  public String getName() {
	  return this.name;
  }
  public double getWeights(int index) {
	  return this.catWeights[index];
  }
  public String getCatNames(int index) {
	  return this.catNames[index];
  }
  public double getGrades(int index) {
	  return this.catGrades[index];
  }
  public int getNum() {
	  return this.catNum;
  }
  public static String toString(gClass grades) {
	  System.out.println("In your class," + grades.getName()", you scored")
	  for (int i = 0; i < grades.getNum(); i++) {
		  System.out.println(grades.getGrades(i) + "on the" + grades.getCatNames(i) +
		  " which is worth" + getWeights(i) + "%.");
	  }
  }
}


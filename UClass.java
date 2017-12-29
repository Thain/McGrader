public class UClass extends gClass{

  // fields
  //ungraded categories of grade
  private int uNum;
  private String[] uNames;
  private double[] uWeights;
  private double[] uGrades;
  //graded categories of grade
  private int gNum;
  private String[] gNames;
  private double[] gWeights;
  private double[] gGrades;

  //constructor
  public UClass(String name, int catNum, String[] catNames, double[] catWeights, double[] catGrades, int uNum, String [] uNames, double [] uWeights, double [] uGrades){
    super(name, catNum, catNames, catWeights);
    setUNum(uNum);
    setUNum(uNames);
    setUWeights(uWeights);
    setUGrades(uGrades);
  }

  //getters
  public double [] getUWeights() {
    return this.uWeights;
  }

  public String [] getUNames() {
    return this.uNames;
  }

  public double [] getUGrades() {
    return this.uGrades;
  }

  public int getUNum() {
    return this.uNum;
  }

  public double [] getGWeights() {
    return this.gWeights;
  }

  public String [] getGNames() {
    return this.gNames;
  }

  public double [] getGGrades() {
    return this.gGrades;
  }

  public int getGNum() {
    return this.gNum;
  }

  // setters
  public void setUWeights(double [] uWs) {
    this.uWeights = uWs;
  }

  public void setUNames(String [] uNs) {
    this.uNames = uNs;
  }

  public void setUGrades(double [] uGs) {
    this.uGrades = uGs;
  }

  public void setUNum(int un) {
    this.uNum = un;
  }

  public void setGWeights(double [] gWs) {
    this.gWeights = gWs;
  }

  public void setGNames(String [] gNs) {
    this.gNames = gNs;
  }

  public void setGGrades(double [] gGs) {
    this.gGrades = gGs;
  }

  public void setGNum(int gn) {
    this.gNum = gn;
  }

}

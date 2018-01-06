public class UClass extends FClass{

  // fields
  //ungraded categories of grade
  private int uNum;
  private ArrayList<String> uNames;
  private Arraylist<double> uWeights;
  private Arraylist<double> uGrades;
  private Arraylist<double> fGrades;

  //constructor
  public UClass(String name, int catNum, ArrayList<String> catNames, Arraylist<double> catWeights, Arraylist<double> catGrades, int uNum){
    super(name, catNum, catNames, catWeights);
    setUNum(uNum);
    setUNum(uNames);
    setUWeights(uWeights);
    setUGrades(uGrades);
  }

  //getters
  public Arraylist<double> getUWeights() {
    return this.uWeights;
  }

  public Arraylist<String> getUNames() {
    return this.uNames;
  }

  public Arraylist<double> getUGrades() {
    return this.uGrades;
  }

  public Arraylist<double> getFGrades() {
    return this.fGrades;
  }
  public int getUNum() {
    return this.uNum;
  }

  // setters
  public void setUWeights(Arraylist<double> uWs) {
    this.uWeights = uWs;
  }

  public void setUNames(ArrayList<String> uNs) {
    this.uNames = uNs;
  }

  public void setUGrades(Arraylist<double> uGs) {
    this.uGrades = uGs;
  }

  public void setFGrades(Arraylist<double> fGs) {
    this.fGrades = fGs;
  }

  public void setUNum(int un) {
    this.uNum = un;
  }

}

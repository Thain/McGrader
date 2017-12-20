public class gClass {

  //fields
  private String name;
  private int catNum;
  private double[] catWeights;
  private String[] catNames;
  private double[] catGrades;

  public gClass(String className, int categoryNumber, double[] categoryWeights, String[] categoryNames, double[] cateogryGrades)
  {
    name = className;
    catNum = categoryNumber;
    catWeights = categoryWeights;
    catNames = categoryNames;
    catGrades = cateogryGrades;
  }
}

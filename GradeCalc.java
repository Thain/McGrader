import java.util.Scanner;

public class GradeCalc {
  //here's the main method. Note that all this scanner stuff should eventually
  //be deleted because we want to make a JS/CSS gui to do that work for us,
  //and this main method should just be passed that info. -L 12.23
  public static void main(String [] args)
  {
    System.out.println("a h a h a h a h a  you're fucked anyway fam");
    Scanner input = new Scanner(System.in);

    String name;
    int catNum;

    System.out.println("What is the name of the class?");
    name = input.nextLine();
    System.out.println("How many categories make up your grade?");
    catNum = input.nextInt();

    String [] catNames = new String[catNum];
    double [] catWeights = new double[catNum];
    double [] catGrades = new double[catNum];

    System.out.println("What are those categories?");
    for (int i = 0; i < catNum; i++)
      catNames[i] =   input.nextLine();
    for (int i = 0; i < catNum; i++) {
        System.out.println("What is the weighting on the " + catNames[i] + " category? ");
          catWeights[i] = input.nextDouble();
        }
    for (int i = 0; i < catNum; i++) {
      System.out.println("What was your grade on the " + catNames[i] + "? ");
        catGrades[i] = input.nextDouble();
      }
    input.close();
    gClass firstClass = new gClass(name, catNum);
    firstClass.setCatNames(catNames);
    firstClass.setCatWeights(catWeights);
    firstClass.setCatGrades(catGrades);
    System.out.println(firstClass.toString());
  }

}

//class name
//category number of graded
//names
//weights
//grades
//category number not graded
//names
//prints:
//a cute message ab how fucked you are

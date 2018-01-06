import java.io.IOException;
import java.util.Scanner;

public class GradeCalc {
  //here's the main method. Note that all this scanner stuff should eventually
  //be deleted because we want to make a JS/CSS gui to do that work for us,
  //and this main method should just be passed that info. -L 12.23
  public static void main(String [] args) throws IOException
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

    input.nextLine();
    System.out.println("What are those categories?");
    for (int i = 0; i < catNum; i++)
      catNames[i] = input.nextLine();
    for (int i = 0; i < catNum; i++) {
        System.out.println("What is the weighting on the " + catNames[i] + " category? ");
          catWeights[i] = input.nextDouble();
        }
    GClass myclass = null;                        // create an object it'll refer to whichever subclasses we choose (woo polymorphism)
    //NOW FOR THE FUN PART
    System.out.println("Have you received the grades back for your class yet? y/n");
    char yn = (char) System.in.read();

    switch(yn){                           //this one's for you big boy ;)
    case 'y':
      for (int i = 0; i < catNum; i++) {   //for loop collects grade for each category
        System.out.println("What was your grade on the " + catNames[i] + "? ");
          catGrades[i] = input.nextDouble();
        }
      myclass = new FClass(name, catNum, catNames, catWeights, catGrades);
      break;
    case 'n':
      // gotta take info for like 80 trillion things and create a uclass object.
      // take unum (this will inform the breakpoint between ungraded and graded)
      // we will take info on the graded parts first. this way we can split the array by the first unum elements and pass the first array 
      // myclass = new UClass(name, catNum, catNames, catWeights, catGrades);
      break;
  }
    System.out.println(myclass.toString());
    input.close();
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

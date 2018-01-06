import java.util.Scanner;
import java.util.ArrayList;
public class GClass {

	// fields
	private String name;
	private int catNum;
	private Arraylist<String> catNames;
	private Arraylist<double> catWeights;

	//constructor
	public GClass(String className, int categoryNumber, Arraylist<String> categoryNames, Arraylist<double> categoryWeights) {
		setName(className);
		setCatNum(categoryNumber);
		setCatNames(categoryNames);
		setCatWeights(categoryWeights);
	}

	// getters
	public String getName() {
		return this.name;
	}

	public Arraylist<double> getCatWeights() {
		return this.catWeights;
	}

	public Arraylist<String> getCatNames() {
		return this.catNames;
	}

	public int getCatNum() {
		return this.catNum;
	}

	// setters
	public void setName(String n) {
		this.name = n;
	}

	public void setCatWeights(Arraylist<double> cWs) {
	 	double catSum = 0;
		this.catWeights = cWs;
		for(int i = 0; i<this.catNum; i++)				// catSum is the summed weights of all the categories
			catSum += cWs.get(i);
		if(catSum != 100)													// if the sum isn't 100, we can easily adjust it to make it percent based.
			for(int i = 0; i<this.catNum; i++)
				catWeights.set(i, (catWeights.get()*100)/catSum); // for every weight, perform this operation to come to new weight. ((20*100)/60 = 33.3333 ~ 33%)
	}

	public void setCatNames(Arraylist<String> cNs) {
		this.catNames = cNs;
	}

	public void setCatNum(int n) {
		this.catNum = n;
	}

}

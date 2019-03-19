package estimator;
/**
 * @author Sreelekha
 *
 */
public class estimator {
	/**
	 * To calculate the cost of the house
	 * @param material is material standard
	 * @param area is area of house
	 * @param isAutomated is whether it is automated or not
	 * @return double cost of the house
	 */
	public double cost(String material,double area,boolean isAutomated) { 
		int cost = 0;
		if(material=="low")
			cost = 1200;
		else if(material=="medium")
			cost = 1500;
		else if(material=="high" && isAutomated)
			cost = 2500;
		else
			cost = 1800;
		return area*cost;
	}
}

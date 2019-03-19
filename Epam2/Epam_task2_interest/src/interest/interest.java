package interest;
/**
 * @author Sreelekha
 *
 */
public class interest {
	/**
	 * To calculate simpleInterest
	 * @param p is principal amount
	 * @param t is time period
	 * @param r is rate of interest in years
	 */
	public double simple_interest(float p,float t, float r) {
		
		return p*t*(r/100);
	}
	/**
	 * To calculate CompoundInterest
	 * @param p is principal amount
	 * @param t is time period
	 * @param r is rate of interest in years
	 */
	public double compound_interest(float p,float t, float r) {
		
		return p* Math.pow((1 + r/100),t);
	}
}


public class AdvanceCalculator extends BasicCalculator{

	@Override
	public int sub(int a, int b) {
		return a*b;
	}
	
	public String abc() {
		return "puneet";
	}
	
	public BasicCalculator getCalc() {
		BasicCalculator calc = new BasicCalculator();
		return calc;
	}
}


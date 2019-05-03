package emirim.bmi.gui;
public class BMICalc implements BMIInter {

	@Override
	public double calc(Men men) {
		double weight = men.getWeight();
		double height = men.getHeight();
		double bmi = weight/Math.pow(height/100, 2);
		return bmi;
	}

	@Override
	public String resultPath(double bmi) {
		String result="";
		if(bmi<18.5)
			result="bmi1";
		else if(bmi<25)
			result="bmi2";
		else if(bmi<30)
			result="bmi3";
		else
			result="bmi4";
		return result;
	}

}

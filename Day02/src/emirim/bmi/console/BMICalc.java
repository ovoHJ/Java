package emirim.bmi.console;
public class BMICalc implements BMIInter {

	@Override
	public double calc(Men men) {
		double weight = men.getWeight();
		double height = men.getHeight();
		double bmi = weight/Math.pow(height/100, 2);
		return bmi;
	}

	@Override
	public String resultCom(double bmi) {
		String result="";
		if(bmi<18.5)
			result="저체중";
		else if(bmi<25)
			result="정상";
		else
			result="비만";
		return result;
	}

}

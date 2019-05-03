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
			result="��ü��";
		else if(bmi<25)
			result="����";
		else
			result="��";
		return result;
	}

}

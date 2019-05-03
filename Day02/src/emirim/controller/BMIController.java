package emirim.controller;

import emirim.bmi.console.BMICalc;
import emirim.bmi.console.BMIView;
import emirim.bmi.console.Men;

public class BMIController {

	public static void main(String[] args) {
		
		Men men = new Men();
		BMIView view = new BMIView(men);
		view.inputInfo();
		BMICalc Calc = new BMICalc();
		double bmi = Calc.calc(men);
		String com = Calc.resultCom(bmi);
		
		view.setBmi(bmi);
		view.setResultCom(com);
		view.showInfo();
	}

}

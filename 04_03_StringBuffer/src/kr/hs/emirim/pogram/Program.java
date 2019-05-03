package kr.hs.emirim.pogram;

public class Program {

	public static void main(String[] args) {
		//append
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" Project");  // 있는 곳을 가르키고 그 뒤에 붙이는 것
		str2 = sb1.append(sb2);
		System.out.println("sb1 =" + sb1);
		System.out.println("sb2 =" + sb2);
		System.out.println("str1 =" + str1);
		System.out.println("str2 =" + str2);
		System.out.println("------------------------------------");
		
		//replace8im
		StringBuffer sb3 = new StringBuffer("Funny Java");
		StringBuffer sb4 = null;
		sb4 = sb3.replace(0,  5, "HEL");
		System.out.println("sb3 = "+ sb3);
		System.out.println("sb4 = "+ sb4);
		System.out.println("------------------------------------");
		
		//reverse
		StringBuffer sb5 = sb4.reverse();
		System.out.println("sb5 = " + sb5);
		System.out.println("------------------------------------");
		
		//toString
		String str6 = sb5.toString().toUpperCase();
		System.out.println("str6 = " + str6);
	}

}

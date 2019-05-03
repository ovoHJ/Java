
public class AppendExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		StringBuffer str3 = null;
		StringBuffer str4 = null;
		
		str1 = sb1.append(" Hello");
		str2 = sb1.append(sb2);
		str3 = sb2.append(" OK");
		str4 = sb1.append(str3);
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(str1);
		System.out.println(str2);
	}

}

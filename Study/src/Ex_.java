
public class Ex_ {
	public static void main(String[] args) {
		String data1 = "10", data2 = "20";
		System.out.println("data = " + data1 + ", data2 = " + data2);
		
		System.out.println(">> parseInt()와 parseDouble()메소드 이용");
		System.out.println("data1 + data2 = " + (Integer.parseInt(data1)+Integer.parseInt(data2)));
		System.out.println("data1 + data2 = " + (Double.parseDouble(data1)+Double.parseDouble(data2)));
		
		System.out.println(">> intValue()와 doubleValue()메소드 이용");
		System.out.println("data1 + data2 = " + (Integer.valueOf(data1).intValue()+Integer.valueOf(data2).intValue()));
		System.out.println("data1 + data2 = " + (Double.valueOf(data1).doubleValue()+Double.valueOf(data2).doubleValue()));
	}
}

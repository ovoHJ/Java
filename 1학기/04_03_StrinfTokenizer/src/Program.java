import java.util.StringTokenizer;

public class Program {
	
	public static void main(String[] args) {
		String line;
		String tmpStr = "hong 용산구 10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		String name, address;
		double math, english, total, avg;
		name = parse.nextToken(); //스페이스나 tab 같은게 있어면 잘라서 넣는다
		address = parse.nextToken();
		//math = Double.valueOf(parse.nextToken()).doubleValue(); 	//String > Double -> double
		math = Double.parseDouble(parse.nextToken());		//String -> double
		//english = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.parseDouble(parse.nextToken());
		total = math + english;
		avg = total / 2.0;
		System.out.println(name + "\t" + address + "\t" + math + "\t" + english + "\t" + total + "\t" + avg);
		
		// String.split()   문자열 쪼갤 수 있는 방법
		String[] arrStr = tmpStr.split(" ");
		for(String str : arrStr) {
			System.out.print(str + "\t");
		}
	}
}

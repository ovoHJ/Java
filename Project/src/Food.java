
public class Food {
	private String name;				// 식품 이름
	private String make_date = "";		// 제조일자
	private String end_date = "";		// 유통기한
	private String left_date = "";			// 남은 날짜
	private String memo = "";			// 메모
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMake_date() {
		return make_date;
	}
	public void setMake_date(String make_date) {
		this.make_date = make_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getLeft_date() {
		return left_date;
	}
	public void setLeft_date(String left_date) {
		this.left_date = left_date;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}

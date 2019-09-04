/*
 * 2302 강혜정
 * 이 프로젝트는 우리 집 냉장고에 어떤 재료와 음식이 있는지 확인하고, 장 볼 때 이미 사놓은 재료를 사는 것을 방지해주는 프로그램을 구현하는 것입니다.
 * 또한 구매한 재료들을 추가할 수 있습니다.
 * 실행 방법은 어느 파일에서든 실행시키면 됩니다.
 */

// 이 class는 음식 class입니다
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

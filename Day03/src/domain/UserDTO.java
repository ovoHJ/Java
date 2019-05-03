package domain;

public class UserDTO {

	private int productId;		//user∞° º±≈√«— ¡¶«∞π¯»£
	private int insertMoney;	//user∞° ≈ı¿Œ«— µ∑
	private int change;			//¿‹µ∑
	
	public UserDTO() {
		
	}
	public UserDTO(int productId, int insertMoney, int change) {
		super();
		this.productId = productId;
		this.insertMoney = insertMoney;
		this.change = change;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getInsertMoney() {
		return insertMoney;
	}
	public void setInsertMoney(int insertMoney) {
		this.insertMoney = insertMoney;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
}
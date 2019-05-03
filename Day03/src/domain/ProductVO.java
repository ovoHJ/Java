package domain;

public class ProductVO {
	
	private int productId; //제품번호
	private String name; //제품명
	private int price;//가격
	private int stockNum; //재고량
	
	public ProductVO() {
		
	}

	public ProductVO(int productId, String name, int price, int stockNum) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stockNum = stockNum;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
}

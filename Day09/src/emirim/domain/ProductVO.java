package emirim.domain;

public class ProductVO {

	private int productID;   //��ǰ��ȣ
	private String productName;   //��ǰ��
	private int price;   //����
	private int stockNum;   //���
	
	public ProductVO() {
	// TODO Auto-generated constructor stub
	}
	public ProductVO(int productID, String productName, int price, int stockNum) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.stockNum = stockNum;
	}

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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

	@Override
	public String toString() {
		return "ProductVO [productID=" + productID + ", productName=" + productName + ", price=" + price + ", stockNum="
				+ stockNum + "]";
	}
		
}

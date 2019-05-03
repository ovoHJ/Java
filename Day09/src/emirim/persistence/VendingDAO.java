package emirim.persistence;

import java.util.ArrayList;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VendingDAO {
	
	private ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
	
	public void addProduct(ProductVO product) {
		productList.add(product);
	}
	
	public ProductVO selectProduct(UserDTO user) {
		return productList.get(user.getProductId());
	}
	
	public ArrayList<ProductVO> getProductList() {
		return productList;
	}
	
}

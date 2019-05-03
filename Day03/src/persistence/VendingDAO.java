package persistence;

import java.util.ArrayList;

import domain.ProductVO;
import domain.UserDTO;

public class VendingDAO {
	
	private ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
	
	public void addProduct(ProductVO product) { //나중에 제품 추가
		productList.add(product);
	}
	
	public ProductVO selectProduct(UserDTO user) { // 유저가 제품을 선택했을 때, 하나만 반환
		return productList.get(user.getProductId());
	}
	
	public ArrayList<ProductVO> getProductList() { //전체를 다 반환
		return productList;
	}
	
}

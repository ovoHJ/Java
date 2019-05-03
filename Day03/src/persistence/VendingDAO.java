package persistence;

import java.util.ArrayList;

import domain.ProductVO;
import domain.UserDTO;

public class VendingDAO {
	
	private ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
	
	public void addProduct(ProductVO product) { //���߿� ��ǰ �߰�
		productList.add(product);
	}
	
	public ProductVO selectProduct(UserDTO user) { // ������ ��ǰ�� �������� ��, �ϳ��� ��ȯ
		return productList.get(user.getProductId());
	}
	
	public ArrayList<ProductVO> getProductList() { //��ü�� �� ��ȯ
		return productList;
	}
	
}

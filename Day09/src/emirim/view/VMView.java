package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VMView {
// 	��ü ��ǰ�� ȭ�鿡 ���
	public void displayProducts(ArrayList<ProductVO> productList) {
		System.out.println("��������������������������������������������������������������������������");
		for (ProductVO productVO : productList) {
			System.out.println("[" +productVO.getProductID() + "]" + productVO.getProductName() + " :: " + productVO.getPrice());
		}
		System.out.println("��������������������������������������������������������������������������");
	}
	
//	����ڰ� �Է��� �� �ִ� ȭ��
	public void inputUserInfo(UserDTO user, Scanner s1) {
		System.out.println(" 1. 1000��, 2. 2000��, 3. 3000��");
		System.out.print(" �� ���� �־��ּ���_");
		int moneyId = s1.nextInt();
		user.setInserMoney(moneyId * 1000);
		System.out.print(" �� ��ǰ��ȣ�� �Է����ּ���_");
		int productId = s1.nextInt();
		user.setProductId(productId);
	}
	
//	������ ��ǰ�� ���� ����� ���
	public void displayResult(ProductVO product, UserDTO user) {
		int stockNum = product.getStockNum();
		if(stockNum > 0) {
			product.setStockNum(stockNum--);
			if(product.getPrice() < user.getInserMoney()) {
				System.out.println(product.getProductName() + "�� ���Խ��ϴ�");
				int change = user.getInserMoney() - product.getPrice();
				user.setChange(change);
				System.out.println("�ܵ��� " + change + "���Դϴ�.");
			}
			else {
				System.out.println("���� �ݾ��� �����մϴ�.");
				System.out.println("�����ߴ� " + user.getInserMoney() + "���� ��ȯ�Ǿ����ϴ�.");
			}
		}
		else {
			System.out.println("���� ��ǰ�� �����Ǿ����ϴ�.");
			System.out.println("�����ߴ� " + user.getInserMoney() + "���� ��ȯ�Ǿ����ϴ�.");
		}
	}
}

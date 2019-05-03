package view;

import java.util.ArrayList;
import java.util.Scanner;

import domain.ProductVO;
import domain.UserDTO;

public class VMView {

	public void displayProducts(ArrayList<ProductVO> productList) {
		for (ProductVO productVO : productList) {
			System.out.println("��������������������������������������������������������");
			System.out.println(" " + productVO.getProductId() + ". [[" + productVO.getName() + "]] (�� " + productVO.getPrice() + ")");
			System.out.println("��������������������������������������������������������");
		}
	}
	
	public void inputInfo(UserDTO user, Scanner sc) {
		System.out.println("[     ���� ������ �� ��ǰ�� �����ϼ���     ]");
		System.out.println(" 1. 1000��, 2. 2000��, 3. 3000��");
		System.out.print(" �� �� ���� : ");
		int moneyId = sc.nextInt();
		user.setInsertMoney(moneyId * 1000);
		System.out.print(" �� ��ǰ ����(��ǰ��ȣ �Է�) : ");
		int productId = sc.nextInt();
		user.setProductId(productId);
		
		
	}
	
	public void displayResult(ProductVO product, UserDTO user) {
		//��� üũ
		int stockNum = product.getStockNum();
		if(stockNum > 0) {
			product.setStockNum(stockNum--);
			if(product.getPrice() < user.getInsertMoney()) {
				System.out.println(product.getName() + "�� ���Խ��ϴ�");
				int change = user.getInsertMoney() - product.getPrice();
				user.setChange(change);
				System.out.println("�ܵ��� " + change + "���Դϴ�.");
			}
			else {
				System.out.println("���� �ݾ��� �����մϴ�.");
				System.out.println("�����ߴ� " + user.getInsertMoney() + "���� ��ȯ�Ǿ����ϴ�.");
			}
		}
		else {
			System.out.println("���� ��ǰ�� �����Ǿ����ϴ�.");
			System.out.println("�����ߴ� " + user.getInsertMoney() + "���� ��ȯ�Ǿ����ϴ�.");
		}
	}
	
}
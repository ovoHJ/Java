package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VMView {
// 	전체 제품을 화면에 출력
	public void displayProducts(ArrayList<ProductVO> productList) {
		System.out.println("┌───────────────────────────────────┐");
		for (ProductVO productVO : productList) {
			System.out.println("[" +productVO.getProductID() + "]" + productVO.getProductName() + " :: " + productVO.getPrice());
		}
		System.out.println("└───────────────────────────────────┘");
	}
	
//	사용자가 입력할 수 있는 화면
	public void inputUserInfo(UserDTO user, Scanner s1) {
		System.out.println(" 1. 1000원, 2. 2000원, 3. 3000원");
		System.out.print(" ⇒ 돈을 넣어주세요_");
		int moneyId = s1.nextInt();
		user.setInserMoney(moneyId * 1000);
		System.out.print(" ⇒ 제품번호를 입력해주세요_");
		int productId = s1.nextInt();
		user.setProductId(productId);
	}
	
//	선택한 제품에 대한 결과를 출력
	public void displayResult(ProductVO product, UserDTO user) {
		int stockNum = product.getStockNum();
		if(stockNum > 0) {
			product.setStockNum(stockNum--);
			if(product.getPrice() < user.getInserMoney()) {
				System.out.println(product.getProductName() + "이 나왔습니다");
				int change = user.getInserMoney() - product.getPrice();
				user.setChange(change);
				System.out.println("잔돈이 " + change + "원입니다.");
			}
			else {
				System.out.println("투입 금액이 부족합니다.");
				System.out.println("투입했던 " + user.getInserMoney() + "원이 반환되었습니다.");
			}
		}
		else {
			System.out.println("현재 제품은 매짐되었습니다.");
			System.out.println("투입했던 " + user.getInserMoney() + "원이 반환되었습니다.");
		}
	}
}

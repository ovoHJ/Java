package emirim.controller;

import java.util.Scanner;

import emirim.domain.MovieVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;
import emirim.view.MovieReservationView;

public class MovieReservationController {
	public static void main(String[] args) {
		int[] movieIds = {1206, 2683, 3692, 4960, 5184};
		String[] names = {"Ʈ���϶���", "����", "��Ŭ����", "�극��ŷ��pt1", "�극��ŷ��pt2"};
		int[] overAges = {12, 12, 12, 15, 15};
		String[] genres = {"�θǽ�", "�θǽ�", "�θǽ�", "�θǽ�", "�θǽ�"};
		int[] prices = {9000, 9000, 9000, 9000, 9000};
		
		MovieDAO dao = new MovieDAO();
		
		for(int i = 0 ; i < movieIds.length;i++) { //��ȭ ���� ����
			dao.addMovie(new MovieVO(movieIds[i], names[i], overAges[i], genres[i], prices[i]));
		}
		
		MovieReservationView view = new MovieReservationView();
		view.displayMovies(dao); //��ȭ ���� ���
		
		UserDTO user = new UserDTO();
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		while(true) {
			view.inputInfo(user, sc); //����� �Է� ȭ�� (��ȭ ����)
			
			MovieVO movie = dao.selectedMovie(user); 
			
			System.out.print("�� �����Ͻðڽ��ϱ�? (Y/N) : ");
			String answer = s.nextLine();
			System.out.println();
			if(answer.equals("Y") || answer.equals("y")) {
				view.payCard(movie);
				view.displayTicket(movie);
				break;
			}
			else {
				view.NotpayCard();
			}
		}
		
		sc.close();
		s.close();
	}
}
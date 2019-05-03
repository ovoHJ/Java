package emirim.controller;

import java.util.Scanner;

import emirim.domain.MovieVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;
import emirim.view.MovieReservationView;

public class MovieReservationController {
	public static void main(String[] args) {
		int[] movieIds = {1206, 2683, 3692, 4960, 5184};
		String[] names = {"트와일라잇", "뉴문", "이클립스", "브레이킹던pt1", "브레이킹던pt2"};
		int[] overAges = {12, 12, 12, 15, 15};
		String[] genres = {"로맨스", "로맨스", "로맨스", "로맨스", "로맨스"};
		int[] prices = {9000, 9000, 9000, 9000, 9000};
		
		MovieDAO dao = new MovieDAO();
		
		for(int i = 0 ; i < movieIds.length;i++) { //영화 정보 저장
			dao.addMovie(new MovieVO(movieIds[i], names[i], overAges[i], genres[i], prices[i]));
		}
		
		MovieReservationView view = new MovieReservationView();
		view.displayMovies(dao); //영화 정보 출력
		
		UserDTO user = new UserDTO();
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		while(true) {
			view.inputInfo(user, sc); //사용자 입력 화면 (영화 선택)
			
			MovieVO movie = dao.selectedMovie(user); 
			
			System.out.print("│ 결제하시겠습니까? (Y/N) : ");
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
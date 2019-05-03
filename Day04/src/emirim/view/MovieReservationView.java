package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.MovieVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;

public class MovieReservationView {
	public void displayMovies(MovieDAO dao) {
		ArrayList<MovieVO> movieList = dao.getMovieList();
		
		for (MovieVO movieVO : movieList) {
			System.out.println(" ─────────────── BTV Reservation ───────────────\n");
			System.out.printf("│ movieID : %d\n", movieVO.getMovieId());
			System.out.printf("│ 영화 제목 : %s\n", movieVO.getMovieTitle());
			System.out.printf("│ 영화 장르 : %s\n", movieVO.getGenre());
			System.out.printf("│ 제한 연령 : %d\n", movieVO.getOverAge());
			System.out.printf("│ 예매 가격 : %d원\n", movieVO.getPrice());
			System.out.println(" ───────────────────────────────────────────────\n");
		}
	}
	
	public void inputInfo(UserDTO user, Scanner sc) {
		System.out.println(" ────────────────── 사용자 영화 선택 ──────────────────");
		System.out.print("│ 영화 선택 (movieId 입력)  :  ");
		int selecteMovieId = sc.nextInt();
		user.setSelectedMovieId(selecteMovieId);
	}
	
	public void payCard(MovieVO movie) {
		System.out.printf("> %s 영화의 예매가 진행됩니다. %d원이 카드로 결제되었습니다.\n", movie.getMovieTitle(), movie.getPrice());
	}
	
	public void NotpayCard() {
		System.out.println("> 결제가 취소되었습니다. 입력 화면으로 돌아가겠습니다.\n");
	}
	
	public void displayTicket(MovieVO movie) {
		System.out.println(" ─────────────── 영화 티켓 출력 ───────────────\n");
		System.out.printf("│ 영화 제목 : %s\n", movie.getMovieTitle());
		System.out.printf("│ 예매 가격 : %d원\n", movie.getPrice());
		System.out.printf("│ 영화 장르 : %s\n", movie.getGenre());
		System.out.printf("│ 연령 제한 : %d\n\n", movie.getOverAge());
		System.out.printf("│ %d관 11:50 AM\n", 7);
		System.out.printf("│ 좌석   %s\n", "B21");
		System.out.println(" ────────────────────────────────────────\n");
	}
}
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
			System.out.println(" ������������������������������ BTV Reservation ������������������������������\n");
			System.out.printf("�� movieID : %d\n", movieVO.getMovieId());
			System.out.printf("�� ��ȭ ���� : %s\n", movieVO.getMovieTitle());
			System.out.printf("�� ��ȭ �帣 : %s\n", movieVO.getGenre());
			System.out.printf("�� ���� ���� : %d\n", movieVO.getOverAge());
			System.out.printf("�� ���� ���� : %d��\n", movieVO.getPrice());
			System.out.println(" ����������������������������������������������������������������������������������������������\n");
		}
	}
	
	public void inputInfo(UserDTO user, Scanner sc) {
		System.out.println(" ������������������������������������ ����� ��ȭ ���� ������������������������������������");
		System.out.print("�� ��ȭ ���� (movieId �Է�)  :  ");
		int selecteMovieId = sc.nextInt();
		user.setSelectedMovieId(selecteMovieId);
	}
	
	public void payCard(MovieVO movie) {
		System.out.printf("> %s ��ȭ�� ���Ű� ����˴ϴ�. %d���� ī��� �����Ǿ����ϴ�.\n", movie.getMovieTitle(), movie.getPrice());
	}
	
	public void NotpayCard() {
		System.out.println("> ������ ��ҵǾ����ϴ�. �Է� ȭ������ ���ư��ڽ��ϴ�.\n");
	}
	
	public void displayTicket(MovieVO movie) {
		System.out.println(" ������������������������������ ��ȭ Ƽ�� ��� ������������������������������\n");
		System.out.printf("�� ��ȭ ���� : %s\n", movie.getMovieTitle());
		System.out.printf("�� ���� ���� : %d��\n", movie.getPrice());
		System.out.printf("�� ��ȭ �帣 : %s\n", movie.getGenre());
		System.out.printf("�� ���� ���� : %d\n\n", movie.getOverAge());
		System.out.printf("�� %d�� 11:50 AM\n", 7);
		System.out.printf("�� �¼�   %s\n", "B21");
		System.out.println(" ��������������������������������������������������������������������������������\n");
	}
}
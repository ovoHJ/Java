package emirim.domain;

public class UserDTO {
	private int pay; //����ڰ� �����ϴ� �ݾ�
	private int selectedMovieId; //����ڰ� ������ ��ȭ id
	
	public UserDTO() {
		
	}	
	public UserDTO(int pay, int selectedMovieId) {
		super();
		this.pay = pay;
		this.selectedMovieId = selectedMovieId;
	}


	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getSelectedMovieId() {
		return selectedMovieId;
	}
	public void setSelectedMovieId(int selectedMovieId) {
		this.selectedMovieId = selectedMovieId;
	}
}
package emirim.domain;

public class UserDTO {
	private int pay; //사용자가 지불하는 금액
	private int selectedMovieId; //사용자가 선택한 영화 id
	
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
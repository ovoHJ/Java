package emirim.persistence;

import java.util.ArrayList;

import emirim.domain.MovieVO;
import emirim.domain.UserDTO;

public class MovieDAO {
	ArrayList<MovieVO> movieList = new ArrayList<MovieVO>();
	
	public void addMovie(MovieVO movie) {
		movieList.add(movie);
	}
	
	public MovieVO selectedMovie(UserDTO user) {
		for (MovieVO movieVO : movieList) {
			if(user.getSelectedMovieId() == movieVO.getMovieId()) {
				return movieVO;
			}
		}
		return null;
	}
	
	public ArrayList<MovieVO> getMovieList() {
		return movieList;
	}
	
}

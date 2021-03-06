package model;
/*
 * Author: Eoin Kelly 
 * Student No: 20074820
 * Date: 03/11/17
 */
import com.google.common.base.Objects;
import static com.google.common.base.MoreObjects.toStringHelper;


public class Ratings {
	static Long counter = 0l;

	public Long id;
	 public Long userId = (long) 0;
	public Long movieId = (long) 0;
	public int rating = 0;

	public Ratings() {
	}

	public Ratings(Long userID, Long movieId, int rating) {
		this.id = counter++;
		this.userId = userID;
		this.movieId = movieId;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return toStringHelper(this).addValue(id).addValue(userId).addValue(movieId).addValue(rating).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.userId, this.movieId, this.rating);
	}
	
	@Override
	  public boolean equals(final Object obj) {
	    if (obj instanceof Ratings){
	      final Ratings other = (Ratings) obj;
	      return Objects.equal(userId, other.userId) 
	          && Objects.equal(movieId, other.movieId)
	          && Objects.equal(rating, other.rating);
	    }else{
	      return false;
	    }
	  }
}

package aula12.Ex3;

public class Movie {

	private String title;
	private float score;
	private String genre;
	private String rating;
	private int runtime;

	public Movie(String title, float score, String genre, String rating, int runtime) {
		this.title = title;
		this.score = score;
		this.genre = genre;
		this.rating = rating;
		this.runtime = runtime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getScore() {
		return this.score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getRuntime() {
		return this.runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "{" +
			" title='" + getTitle() + "'" +
			", score='" + getScore() + "'" +
			", genre='" + getGenre() + "'" +
			", rating='" + getRating() + "'" +
			", runtime='" + getRuntime() + "'" +
			"}";
	}

}


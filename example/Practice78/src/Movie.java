//보건관리학과 20170809 홍은영

public class Movie {
	private String title;
	private String director;
	private Date viewDay;

	public String getTitle() { return title;}
	public void setTitle(String title) { this.title = title;}
	
	public String getDirector() { return director;}
	public void setDirector(String director) { this.director = director;}
	
	public Date getViewDay() { return viewDay;}
	public void setViewDay(Date viewDay) { this.viewDay = viewDay;}
	
	public Movie() {
		title = "모름";
		director = "모름";
		viewDay = new Date(1999, 9, 9);
		
		//this("모름", "모름", new Date(1999, 9, 9));
	}
	
	public Movie(String title, String director, Date viewDay) {
		this.title = title;
		this.director = director;
		this.viewDay = new Date();
		this.viewDay = viewDay;
	}
	
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
		viewDay = new Date(1999, 9, 9);
		
		//this(title, director, new Date(1999, 9, 9));
	}
	
	public String toString() {
		String rslt = "";
		rslt += "제목: " + getTitle() + "\n";
		rslt += "감독: " + getDirector() + "\n";
		rslt += "관람일: " + getViewDay().toString() + "\n";
		
		return rslt;
	}
}

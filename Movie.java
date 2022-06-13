import java.io.IOException;
import java.util.Random;


public class Movie {
   private MovieAnalyzer movieAnalyzer;
    private int id;
    private String title;
    private int year;
    private int duration;
    private String category;
    private int rating;
    private String director;
    private String company;

    public Movie(){
       movieAnalyzer=new MovieAnalyzer();
        this.id=movieAnalyzer.getNumOfMovies()+1;
        this.title="";
        this.year=0;
        this.duration=0;
        this.category="";
        this.rating=0;
        this.director="";
        this.company="";



    }

    public int getId() {
        return id;
    }

    public void setId(int num) {
        this.id =id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

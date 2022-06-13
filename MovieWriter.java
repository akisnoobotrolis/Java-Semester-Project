import java.io.*;

public class MovieWriter {
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;




   MovieWriter() {
       file=new File("movies.txt");
       try {
           this.fw=new FileWriter(file,true);
       } catch (IOException e) {
           e.printStackTrace();
       }
       this.bw = new BufferedWriter(fw);

    }

    void addMovie(Movie movie) throws IOException {

        String content=movie.getId()+" "+movie.getTitle()+" "+ movie.getYear()
                +" "+ movie.getDuration() +" "+movie.getCategory()
                +" "+movie.getDirector()+" "+movie.getCompany()+" "+ movie.getRating() +"\n";
        this.bw.write(content);
        this.bw.close();

    }
}

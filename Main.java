import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file=new File("movies.txt");

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        AddMovieFrame addMovieFrame= new AddMovieFrame();
    }
}

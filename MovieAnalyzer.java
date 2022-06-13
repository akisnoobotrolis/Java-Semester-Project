import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MovieAnalyzer {
    File file;
    private int numOfMovies;
    private Scanner scanner;
    private float duration;
    private int[] array;
    private String maxCategory;
    private int numOfMaxCategory;
    private String oldestMovie;
    private int yearOfOldestMovie;
    private String newestMovie;
    private int yearOfNewestMovie;


    MovieAnalyzer() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("movies.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.array = new int[8];
        String title, category, director, company;
        int year, maxYear, minYear, sumDuration, id, dur, rating;
        sumDuration = 0;
        maxYear = 0;
        minYear = 2025;
        int lines = 0;

        while (scanner.hasNextInt()) {
                id=scanner.nextInt();
                title = scanner.next();
                year = scanner.nextInt();
                dur = scanner.nextInt();
                category = scanner.next();
                if (year < minYear) {
                    this.yearOfOldestMovie = year;
                    this.oldestMovie = title;

                }
                if (year > maxYear) {
                    this.yearOfNewestMovie = year;
                    this.newestMovie = title;

                }

                sumDuration = sumDuration + dur;

                if (category.equals("Action"))
                    array[0]++;
                else if (category.equals("Comedy"))
                    array[1]++;
                else if (category.equals("Drama"))
                    array[2]++;
                else if (category.equals("Fantasy"))
                    array[3]++;
                else if (category.equals("Horror"))
                    array[4]++;
                else if (category.equals("Mystery"))
                    array[5]++;
                else if (category.equals("Romance"))
                    array[6]++;
                else if (category.equals("Thriller"))
                    array[7]++;
                else if (category.equals("Western"))
                    array[8]++;

                director = scanner.next();
                company = scanner.next();
                rating = scanner.nextInt();


                lines++;



        }

        scanner.close();
        int max = array[0];
        int maxp=0;
        for (int i = 1; i < array.length; i++)
            if (array[i] > max) {
                max = array[i];
                maxp = i;
            }
        this.numOfMaxCategory=max;
        if (maxp==0)
            this.maxCategory = "Action";

        else if (maxp==1)
            this.maxCategory = "Comedy";
        else if (maxp==2)
            this.maxCategory = "Drama";
        else if (maxp==3)
            this.maxCategory = "Fantasy";
        else if (maxp==4)
            this.maxCategory = "Horror";
        else if (maxp==5)
            this.maxCategory = "Mystery";
        else if (maxp==6)
            this.maxCategory = "Romance";
        else if (maxp==7)
            this.maxCategory = "Thriller";
        else if (maxp==8)
            this.maxCategory = "Western";

        this.duration = sumDuration;
        this.numOfMovies = lines;


    }

    public int getNumOfMovies() {
        return numOfMovies;
    }


    public float getAverageDuration() {
        return this.duration / this.numOfMovies;
    }


    public String getMaxCategory() {
        return maxCategory;
    }


    public int getNumOfMaxCategory() {
        return numOfMaxCategory;
    }


    public String getOldestMovie() {
        return oldestMovie;
    }


    public int getYearOfOldestMovie() {
        return yearOfOldestMovie;
    }


    public String getNewestMovie() {
        return newestMovie;
    }


    public int getYearOfNewestMovie() {
        return yearOfNewestMovie;
    }


}

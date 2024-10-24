import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

public class TvSeries implements Serializable {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating;

    public TvSeries() {
        System.out.println("Tv-Shows name?");
        name = scanner.nextLine();
    }

    public TvSeries(String inName) {
        this.name = inName;
    }


    public void addEpisodes(int numOfEpisodes, int season) {

        if (season > episodes.size()) {
            for (int i = 0; i < season - 1; i++) {
                episodes.add(0);
            }
        }
        episodes.add(season - 1, numOfEpisodes);

    }

    public void changeRating(int newRating) {
        rating = newRating;
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
    }

}
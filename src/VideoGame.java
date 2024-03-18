

public class VideoGame {
    String name, genre;
    int releaseYear;


    public VideoGame (String name, String genre, int releaseYear){

        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;

    }

    public void displayAllDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Genre: " + this.genre);
        System.out.println("Year: " + this.releaseYear);
    }
}

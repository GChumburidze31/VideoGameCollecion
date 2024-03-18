public class MainProgram {
    public static void main(String[] args) {

        VideoGame[] newArray = populateAnArray();
        displayCollections(newArray);


    }

    public static void displayCollections(VideoGame[] passedArray) {
        for (VideoGame myGames : passedArray) {
            System.out.println();
            myGames.displayAllDetails();
            System.out.println();

        }
    }

    public static VideoGame[] populateAnArray() {

        VideoGame[] myVideoGames = new VideoGame[15];


        for (int i = 0; i < myVideoGames.length; i++) {

            String name = "Game " + i;
            String genre = "Genre" + i;
            int releaseYear = 2000 + i;
            myVideoGames[i] = new VideoGame(name, genre, releaseYear);


        }
        return myVideoGames;
    }


}


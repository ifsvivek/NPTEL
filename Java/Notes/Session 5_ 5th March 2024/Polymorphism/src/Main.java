import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Movie("RRR");
//        theMovie.watchMovie();
//
//        Movie theMovie = new Adventure("RRR");
//        theMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("Adventure", "RRR");
//        theMovie.watchMovie();
//        Movie theMovie1 = Movie.getMovie("ScienceFiction", "Robot");
//        theMovie1.watchMovie();
        Scanner s = new Scanner(System.in);
//        List list = new ArrayList<String>();
        while(true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction or Q for quit):");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}

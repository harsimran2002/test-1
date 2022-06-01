class Tenflix {
    public static void main(String args[]) {
        // *
        // initialize the values for movie 1
        String movie1Name = "Fast and Furious";
        String movie1DirectorName = "John Cena";
        String movie1ProductionHouse = "Warner Bros";
        String movie1Actors[] = { "Dwayne Johnson", "Paul Walker", "Vin Diesel" };
        // create a movie object via constructor
        Movie movie1 = new Movie(movie1Name, movie1DirectorName,  movie1ProductionHouse,
                movie1Actors);
        movie1.printMovieInfo(); // print the movie info

        System.out.println();
        // *
        // initialize the values for movie 2
        String movie2Name = "Titanic";
        String movie2DirectorName = "Marshall Mathers";
        String movie2ProductionHouse = "Tom Tim Productions";
        String movie2Actors[] = { "Ali Fazal", "Billie Eilish", "Shawn Mendes" };
        // create a movie object via constructor
        Movie movie2 = new Movie(movie2Name, movie2DirectorName, movie2ProductionHouse,
                movie2Actors);
        movie2.printMovieInfo(); // print the movie info

        System.out.println();
        // *
        // initialize the values for movie 3
        String movie3Name = "Spiderman: No way home";
        String movie3DirectorName = "Stan Lee";
        String movie3ProductionHouse = "Cheems Production Co.";
        String movie3Actors[] = { "Tobey Maguire", "Andrew Garfield", "Tom Holland" };
        // create a movie object via constructor
        Movie movie3 = new Movie(movie3Name, movie3DirectorName,  movie3ProductionHouse,
                movie3Actors);
        movie3.printMovieInfo(); // print the movie info
    }
}

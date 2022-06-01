
public class Movie {
    private String name;
    private String director;
    private String productionHouse;
    private String[] actors;
    private int len=3;
    public Movie() {
    }

    public Movie(String name, String director,String productionHouse,String[] actors){
        this.name = name;
        this.director = director;
        
        this.productionHouse = productionHouse;
        this.actors = actors;
       
    }

    // member methods
    // method to calculate the budget of the movie
    public float calculateBudget() {
        float budget = 0; // initialize with 0 salary
        for (int i = 0; i < len; i++) {
            budget += 10000; // sum up the salary of the actors
        }
        return budget;
    }

    

    // method to print the movie info
    public void printMovieInfo() {
        System.out.println("Movie Name: " + name);
        System.out.println("Director Name: " + director);
        System.out.println("Production Company: " + productionHouse);
        System.out.println("Total Budget: $" + String.format("%.2f", calculateBudget()));
    }
}

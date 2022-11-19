package less9;

public class Burgers {
    private String bun;
    private String meat;
    private int doubleMeat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise) {

        this(bun,meat,cheese,greens);
        this.mayonnaise = mayonnaise;

        System.out.println("Classic burger recipe: " + bun + " " + meat + " "
                + cheese + " " + greens + " " + this.mayonnaise);
    }

    public Burgers(String bun, String meat, String cheese, String greens) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Diet burger recipe without mayonnaise: " + bun + " " + meat + " "
                + cheese + " " + greens);
    }
    public Burgers(int doubleMeat,String bun,String cheese,String greens, String mayonnaise) {

        this.doubleMeat = doubleMeat;
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("With double meat recipe: " +"meat"+ " " + this.doubleMeat + " " + this.bun + " " +
        this.cheese + " " + this.greens + " " + this.mayonnaise);
    }
    public String classicBurger(){
        return "Classic burgers: " + bun + " " + meat + " " + cheese + " " + greens + " " + mayonnaise;
    }
    public String dietBurger(){
        return "Diet Burger: " + bun + " " + meat + " " + cheese + " " + greens;
    }
    public String doubleBurger(){
        return "Double Burger: "  + doubleMeat + " " + cheese + " " + greens + " " + mayonnaise;
    }
}

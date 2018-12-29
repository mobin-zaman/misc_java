class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eating lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }
    public String plot(){
        return "Aliens attempt to take over mother earth";
    }
}

class Mazerunner extends Movie{
    public Mazerunner(){
        super("maze runner");
    }
    public String plot(){
        return "kids try and escape a maze";
    }
}

class Starwars extends Movie{
    public Starwars(){
        super("Star wars");
    }
    public String plot(){
        return "Imperial army takes over universe";
    }
}

class forgetable extends Movie{
    public forgetable(){
        super("Forgatable");
    }
}

public class Main {
    public static void main(String args[]){

    }
}

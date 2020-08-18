public class Game {
    private String name;

    public Game(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Game) {
            Game f = (Game) o;
            return this.name == f.name;
        }
        return false;
    }
}

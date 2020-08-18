import java.util.HashSet;
import java.util.Set;

public class Store {
    private Set<Game> availableGames;
    
    public Store(Set<Game> games){
        this.availableGames = new HashSet<Game>();
        this.availableGames.addAll(games);
    }
    public Store(Game game){
        this.availableGames = new HashSet<Game>();
        this.availableGames.add(game);
    }
    public Store(){
        this.availableGames = new HashSet<Game>();
    }
    public Set<Game> getAvailableGames(){
        return this.availableGames;
    }
    public void addToStore(Game g){
        availableGames.add(g);
    }
    public void removeFromStore(Game g){
        availableGames.remove(g);
    }
    @Override
    public String toString(){
        return "This store contains the following games: " + availableGames;
    }
}

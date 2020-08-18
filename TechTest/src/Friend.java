import java.util.HashSet;
import java.util.Set;

public class Friend {
    private String name;
    private Set<Friend> friendsCollection;
    private Set<Game> gamesCollection;

    public Friend(String name){
        this.name = name;
        this.friendsCollection = new HashSet<Friend>();
        this.gamesCollection = new HashSet<Game>();
    }

    public String getName(){
        return this.name;
    }
    public Set<Friend> getFriendsCollection() {
        return friendsCollection;
    }
    public Set<String> getFriendsNames(){
        Set<String> friendsNames = new HashSet<String>();
        friendsCollection.forEach(elem->friendsNames.add(elem.getName()));
        return friendsNames;
    }
    public void addFriend(Friend f){
        friendsCollection.add(f);
        f.friendsCollection.add(this);
    }

    public void addFriend(Set<Friend> f){
        friendsCollection.addAll(f);
        f.forEach(elem -> elem.friendsCollection.add(this));
    }

    public void deleteFriend(Friend f){
        friendsCollection.remove(f);
        f.deleteFriend(this);
    }
    public Set<Game> getGamesCollection(){
        return gamesCollection;
    }
    public void addGame(Store s, Game g){
        if(s.getAvailableGames().contains(g)) gamesCollection.add(g);
        else System.out.println(g+" game is not available in store");
    }
    public void deleteGame(Game g){
        gamesCollection.remove(g);
    }

    @Override
    public String toString(){
        return this.name + " has " + this.getFriendsNames() + " as friend and the following games: " + this.gamesCollection;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Friend){
            Friend f = (Friend) o;
            return this.name==f.name;
        }
        return false;
    }


}

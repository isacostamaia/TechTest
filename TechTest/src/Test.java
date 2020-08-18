import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String args[]) {
        Friend isa = new Friend("Isabella");
        Friend bre = new Friend("Breno");
        Friend manu = new Friend("Manuella");
        Friend isalima = new Friend("Isa Lima");
        Friend joao = new Friend("Joao");

        isa.addFriend(bre);
        Set<Friend> isaothersf = new HashSet<Friend>();
        isaothersf.add(manu);
        isaothersf.add(isalima);
        isa.addFriend(isaothersf);
        bre.addFriend(joao);
        manu.addFriend(bre);

        Game callOfDuty = new Game("Call of Duty");
        Game totalWar = new Game("Total War");
        Game heavyRain = new Game("Heavy Rain");
        Game mariaClaraEJP = new Game("Maria Clara e JP");

        Store store = new Store(totalWar);
        store.addToStore(heavyRain);
        store.addToStore(mariaClaraEJP);

        isa.addGame(store, heavyRain);
        bre.addGame(store, totalWar);
        manu.addGame(store, mariaClaraEJP);
        joao.addGame(store, callOfDuty);

        System.out.println(isa);
        System.out.println(bre);
        System.out.println(manu);
        System.out.println(isalima);
        System.out.println(joao);
    }
}
import java.util.SortedSet;
import java.util.TreeSet;

public class Thanos {

    public static void main(String[] args) {

        TreeSet<Hero> heroes = new TreeSet<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Doctor Strange", 42));

        // TODO 1 : Retrieve and remove the oldest hero in one line
        Hero oldest = heroes.pollLast();

        System.out.println("\nOldest hero:");
        System.out.println(oldest == null ? "No heroes available " : oldest.getName());

        // TODO 2: Show heroes by age (descending)
        System.out.println("\nHeroes by age (descending) :");
        TreeSet<Hero> descendingHeroes = (TreeSet<Hero>) heroes.descendingSet();
        for (Hero hero : descendingHeroes) {
            System.out.println(hero.getName() + ", " + hero.getAge());
        }

        // TODO 3: Show heroes by age (ascending),from Spider-Man (include) to Iron Man (include)

        Hero spiderman = new Hero("Spider-Man", 18);
        Hero ironman = new Hero("Iron Man", 48);
        heroes.add(spiderman);
        heroes.add(ironman);
        SortedSet<Hero> subSet = heroes.subSet(spiderman, true, ironman, true);



        System.out.println("\nSubset of heroes :");
        for (Hero hero : subSet) {
            System.out.println(hero.getName() + ", " + hero.getAge());
        }
    }
}
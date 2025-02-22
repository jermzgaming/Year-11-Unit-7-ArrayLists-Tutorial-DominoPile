import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int index1 = rand.nextInt(pile.size());
            int index2 = rand.nextInt(pile.size());
            Domino a = pile.get(index1);
            pile.set(index1, pile.get(index2));
            pile.set(index2, a);
        }
    }
}

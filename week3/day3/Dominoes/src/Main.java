import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    ArrayList<Domino> newDomino = new ArrayList<>();
    newDomino.add(dominoes.get(0));
  for ( int j=0; j < dominoes.size(); j++) {
    for (int i = 0; i < dominoes.size(); i++) {
      if (newDomino .get(j).getValues()[1] == dominoes.get(i).getValues()[0]) {
        newDomino.add(dominoes.get(i));
        //for (int j = 0; j < 1; j++) {
        //if (dominoes.get(i).getValues()[0] == dominoes.get(i).getValues()[1]) {
        //System.out.println(dominoes.get(i).getValues()[0]);
        //}
        //}
      }
    }
  }
        System.out.println(newDomino);



      return dominoes;

    }
  }




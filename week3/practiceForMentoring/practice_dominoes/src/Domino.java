import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Domino {
  private int left;
  private  int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public Domino() {
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  public List<Domino> orderDominoes(){
   List<Domino> dominoList = Dominoes.initializeDominoes();
   List<Domino> orderedDominoList = new ArrayList<>();
   orderedDominoList.add(dominoList.get(0));
    for (int i = 0; i < orderedDominoList.size() ; i++) {
      for (int j = 1; j <dominoList.size() ; j++) {
        if( orderedDominoList.get(i).getRightSide()==dominoList.get(j).getLeftSide()){
          orderedDominoList.add(dominoList.get(j));
        }

      }
    }
    System.out.println(orderedDominoList);
    return orderedDominoList;
  }
}
// [2, 4],
// [4, 3],
// [3, 5] ...

import java.util.List;

public class NitChipMir {

    public static int getIndex(List<Integer> listName, int number) {
        if (listName == null){
            return  -2;
        }
            for (int i = 0; i < listName.size(); i++) {
                if (listName.get(i) == number) {
                    return i;
                }
            }
        return -1;
    }

}

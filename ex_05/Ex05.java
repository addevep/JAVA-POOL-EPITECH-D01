import java.util.ArrayList;

public class Ex05 {

    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < var.length; i++) {
            list.add(var[i]);
        }
        return list;
    }
}
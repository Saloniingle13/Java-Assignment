import java.util.*;

public class ListT {
    static void ListT(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" pink ", " violet ", " black ");
        ListT(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}
import java.util.Collections;
import java.util.Comparator;

public class DescendingLengthStringComparator implements Comparator<String> {


    public Comparator<String> reversed() {
        return Collections.reverseOrder();
    }

    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}





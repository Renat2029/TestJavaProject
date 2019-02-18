package GenericHometask2;

import java.util.Comparator;

public class LengthComparator<T extends String> implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {


        return o1.toString().length() - o2.toString().length();

        //return 0;
    }
}

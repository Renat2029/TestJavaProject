package GenericHometask2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    // You need to implement LengthComparator implements Comparator
    public static void test() {
        List<String> s = Arrays.asList("aaa", "b", "cd");
        // Should return {b, cd , aaa}

        Collections.sort(s, new LengthComparator());
        //Collections.sort(List<T> list, Comparator<? super T> cmp)
       // Collections.sort(s, new LengthComparator<? extends String>)
        System.out.println(s);
    }


    public static void main(String[] args) {

        test();
    }

}

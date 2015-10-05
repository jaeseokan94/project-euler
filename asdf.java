package projectEuler;

import java.util.List;
import java.util.ArrayList;

class Example {

    static void testArray(long[] longs) {
        System.out.println("testArray");
    }

    static void testGeneric(List<Long> longs) {
        System.out.println("testGeneric");
    }

    @SuppressWarnings("unchecked")
    public static void main(String... arguments) {
        List<Long> fakeLongs = new ArrayList<Long>();
        List<Object> mischiefManaged = (List<Object>)(Object)fakeLongs;
        mischiefManaged.add(new Object());
        // this call succeeds and prints the value.
        // we could sneak in a wrong type into this function
        // and it remained unnoticed
        testGeneric(fakeLongs);

        long[] realLongs = new long[1];
        // this will fail because it is not possible to perform this cast
        // despite the compiler thinks it is.
        Object[] forgedLongs = (Object[])(Object)realLongs;
        forgedLongs[0] = new Object();
        testArray(realLongs);
    }
}
public class Strings {
/* Strings
    ~ Strings are immutable in Java
    ~ Classes like StringBuilder and StringBuffer allow you to make string-like objects that are mutable
    ~ StringBuffer is thread safe

    ~ String Literals and String Objects are different
    ~ String A and B reference the same object and value
    ~ String OA and OB reference two separate objects
*/
    public static void literalVsObject() {
        // String Literals
        String A = "abc";
        String B = "abc";
        // String Objects
        String OA = new String("abc");
        String OB = new String("abc");
        System.out.println(A == B);         // true
        System.out.println(A.equals(B));    // true
        System.out.println(OA == OB);       // false
        System.out.println(OA.equals(OB));  // true
    }
}
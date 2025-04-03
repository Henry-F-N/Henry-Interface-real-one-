/**
 * Runs the iterator examples
 * @version 1.0
 * @since 2025-04
 * @author J. Cihlar
 */

public class IteratorRunner {
    public static void main(String []args) {
        int [] values = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    
        ForwardIterator fi = new ForwardIterator(values);
        while(fi.hasMore()) {
            System.out.print(fi.getNext() + " ");
        }
        System.out.println();
    }
}
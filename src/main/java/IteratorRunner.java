/**
 * Runs the iterator examples
 * @version 1.0
 * @since 2025-04
 * @author J. Cihlar
 */

public class IteratorRunner {
    public static void main(String []args) {
        int [] values = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Iterator [] interators = new Iterator[] {
            new ForwardIterator(values),
            new BackwardIterator(values)
        };
    
        for(Iterator it : interators){
            while(it.hasMore()) {
                System.out.print(it.getNext() + " ");
            }
            System.out.println();
        }
        
    }
}
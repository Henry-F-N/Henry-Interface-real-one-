/**
 * Defines an iterator that simply moves through the array from beginning to end
 * @version 1.0
 * @since 2025-04
 */

public class ForwardIterator implements Iterator {
        /** the array to iterate over */
    int [] arr;
        /** the current index */
    int index;

    /**
     * Constructor that sets arr and current index to 0.
     * @param a
     */
    public ForwardIterator(int [] a) {
        arr = a;
        index = 0;
    }

    /**
     * Gets the next item in the iteration. Raises an ArrayIndexOutOfBoundsException if there are no more items.
     * @return int the next item in the iteration.
     */
    public int getNext() {
        index++;
        return arr[index - 1]; // 
    }

    /**
     * Whether iteration has more elements. Should be called as a guard
     * before every call to getNext()
     * @return whether there are more items in the iteration
     */
    public boolean hasMore() {
        return index < arr.length;
    }
}
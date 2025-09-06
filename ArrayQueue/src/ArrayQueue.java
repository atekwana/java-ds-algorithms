public class ArrayQueue<T> {

    protected int[] arr;
    protected  int topOfQueue;
    protected  int begOfQueue;

    /**
     * @param size
     */
    public ArrayQueue(int size) {

        this.arr = new int[size];
        this.topOfQueue = -1;
        this.begOfQueue = -1;

        System.out.println("Array Queue size: " + size);

    }




}

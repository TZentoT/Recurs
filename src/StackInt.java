import java.util.Arrays;

public class StackInt {
    private static final int DEFSIZE = 16;
    private int[] array;
    private int head;

    public StackInt() {
        array = new int[DEFSIZE];
        head = 0;
    }

    public final void push(int val) { array[head++] = val;  /*System.out.println(Arrays.toString(array));*/}

    public final int pop() { return array[--head]; }

    public final int top() { return array[head-1]; }

}

public class Calc extends Compf {
    private StackInt s;
    int val;int num=0;

    private static int char2int(char c) {
        return (int)c - (int)'0';
    }

    @Override
    protected int symOther(char c) {
        if (c < '0' || c > '9') {
            System.out.println("Недопустимый символ: " + c);
            System.exit(0); }
        return SYM_OTHER;
    }

    @Override
    protected void nextOper(char c) {
        int second = s.pop();
        int first = s.pop();
        switch (c) {
            case '+': s.push(first + second); break;
            case '-': s.push(first - second); break;
            case '*': s.push(first * second); break;
            case '/': s.push(first / second); break;
            case '%': s.push(first % second); break;
        }
    }

    @Override
    protected void nextOther(char c) {
        if (getIterator() > 1) {
            s.push(s.pop()*10+char2int(c));
            //setIterator(0);
        }
        else  s.push(char2int(c));
    }

    public Calc() { s = new StackInt(); }

    @Override
    public final void compile(char[] str) {
        super.compile(str);
        System.out.println("" + s.top());
    }

}

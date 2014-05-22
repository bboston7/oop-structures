public class Insert<T> extends OopList<T> {
    private final T x;

    public Insert(T x, OopList<T> list) {
        this.x = x;
        this.list = list;
    }

    @Override public boolean isEmpty() { return false; }
    @Override public T head() { return x; }
    @Override public OopList<T> tail() { return list; }
}

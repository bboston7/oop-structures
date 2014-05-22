public class Empty<T> extends OopList<T> {

    @Override public boolean isEmpty() { return true; }
    @Override public T head() { throw new IllegalStateException(); }
    @Override public OopList<T> tail() { throw new IllegalStateException(); }

}

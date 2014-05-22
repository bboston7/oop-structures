public abstract class OopList<T> {

    OopList<T> list;

    public static <T> OopList<T> getNewList() { return new Empty<T>(); }

    // These functions may need to be overridden in certain classes
    public T head() { return list.head(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public OopList<T> tail() { return list.tail(); }

    public OopList<T> insert(T x) { return new Insert<T>(x, this); }
    public OopList<T> remove(T x) { return new Remove<T>(x, this); }
    // TODO: ? extends T would be better for append
    public OopList<T> append(OopList<T> app) { return new Append<T>(app, this); }
    public OopList<T> drop(int at) { return new Drop<T>(at, this); }

    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder line = new StringBuilder("[");
        line.append(head());
        OopList<T> current = tail();
        while (!current.isEmpty()) line.append(",").append(current.head());
        line.append("]");

        return line.toString();
    }
}

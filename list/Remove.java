public class Remove<T> extends OopList<T> {
    public Remove(T x, OopList<T> list) {
        if (list.isEmpty()) this.list = new Empty<T>();
        else if (list.head().equals(x)) this.list = list.tail();
        else this.list = new Insert<T>(list.head(), new Remove<T>(x, list.tail()));
    }
}

public class Drop<T> extends OopList<T> {
    public Drop(int at, OopList<T> list) {
        if (at == 0) this.list = new Empty<T>();
        else list = this.list = new Insert<T>(list.head(), new Drop<T>(at - 1, list.tail()));
    }
}

public class Append<T> extends OopList<T> {
    public Append(OopList<T> app, OopList<T> list) {
        if (list.isEmpty()) this.list = app;
        else this.list = new Insert<T>(list.head(), new Append<T>(list.tail(), app));
    }
}

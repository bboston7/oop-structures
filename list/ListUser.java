public class ListUser {
    public static void main(String[] args) {
        OopList<Integer> list = OopList.getNewList();

        System.out.println("empty?: " + list.isEmpty());
        for (int i = 0; i < 5; ++i) list = list.insert(i);
        System.out.println("empty?: " + list.isEmpty());
        printList(list);
        list = list.remove(3);
        printList(list);
        System.out.println("empty?: " + list.isEmpty());
        for (int i = 0; i < 5; ++i) list = list.remove(i);
        System.out.println("empty?: " + list.isEmpty());
    }

    public static void printList(OopList<Integer> list) {
        if (list.isEmpty()) System.out.println();
        else {
            System.out.print(list.head() + ", ");
            printList(list.tail());
        }

    }
}

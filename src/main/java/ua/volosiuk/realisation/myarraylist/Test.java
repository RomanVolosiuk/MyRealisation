package main.java.ua.volosiuk.realisation.myarraylist;

public class Test {
    public static void main(String[] args) {

        MyArrayList<Boolean> stringList = new MyArrayList<>();
        stringList.add(true);

        SomeClass s = new SomeClass();
        MyArrayList<SomeClass> someClassList = new MyArrayList<>();
        someClassList.add(s);
        someClassList.show();

        MyArrayList<Integer> test = new MyArrayList<>(3);
        {
            test.add(2);                                                         // add()
            test.add(4);
            test.add(6);
            test.add(8);
            test.add(4);
            test.add(8);
        }
        test.show("initial array");

        test.remove(2);                                                    // remove()
        test.show("remove() 2 index");
        test.set(2, 9);                                                          // set()
        test.show("set() int 9 to index 2");
        test.add(1,8);                                              // add(index, o)
        test.show("add(index 1, element 8)");

        System.out.println("method indexOf(4): " + test.indexOf(4));             // indexOf()
        System.out.println("method lastIndexOf(4): " + test.lastIndexOf(4));  // lastIndexOf()
        System.out.println("method size(): " + test.size());                     // size()
        System.out.println("method get(3): " + test.get(3));                     // get()
        System.out.println("method isEmpty(): " + test.isEmpty());               // isEmpty()
        System.out.println("method contains(A): " + test.contains("A"));          // contains()

        test.clear();
        test.show("clear()");
    }
}
class SomeClass {}
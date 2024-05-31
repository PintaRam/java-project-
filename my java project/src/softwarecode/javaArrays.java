import java.util.*;

public class javaArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(100);
        list.add(20);
        System.out.println(list);
        Iterator list2 = list.iterator();
        while (list2.hasNext()) {
            System.out.println(list2.next());
        }
        System.out.println(list.get(3));
        list.set(2, 1000);
        System.out.println(list.get(2));
        Collections.sort(list);
        System.out.println(list);
    }
}

import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        
        list.add(1,80);
        System.out.println(list);
        int element = list.get(2);
        System.out.println(element);
        list.remove(2);
        list.set(2,30);
        System.out.println(list.contains(20));
        System.out.println(list.contains(30));
        list.add(0,100);
        System.out.println(list);
 
    }
}

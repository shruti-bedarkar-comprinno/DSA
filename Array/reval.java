import java.util.ArrayList;

class reval {

    
    public static void swap(ArrayList<Integer> list, int ind1, int ind2) {
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(45);
        list.add(10000);

        System.out.println("Before swap: " + list);

        swap(list, 1, 2);  // swap index 1 and 2

        System.out.println("After swap: " + list);
    }
}



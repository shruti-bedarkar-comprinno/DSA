import java.util.ArrayList;
class reval {
public static void main(String[] args) {
    public static void sawp(ArrayList<Integer> list , int ind1, int ind2 ) {
    int temp = list.get(ind1);
    list.set(ind1, list.get(ind2));
    list.set(ind2, list.get(temp));

}
System.out.println(list);

}
    ArrayList<Integer> list = new ArrayList<>();
     list.add(12);
     list.add(34);
     list.add(45);
     list.add(10000);
    //  for(int i=0;i<a.size();i++){
    //  System.out.println(a.get(i));
    //  }
    //  System.out.println("--------");
    //  for(int i=a.size()-1;i>=0;i--) {
    //     System.out.println(a.get(i));
    //  }
   //     int max = Integer.MIN_VALUE;
  //     for(int i=0;i<a.size();i++) 
   //     {
   //         if(a.get(i)>max){
  //             max = a.get(i);
//         }
//     }
// System.out.println("maximum value will be:" + max);
//swap code
}
}




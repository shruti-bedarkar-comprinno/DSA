public class SearchInString {
    public static int search1(String name,char target) {
        for(int i=0;i<name.length();i++){
            if(target == name.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }

public static boolean search2(String name, char target) {
   for(char ch : name.toCharArray()) {
    if(ch == target) {
    return true;
}
   }
   return false;
}
    public static void main(String args[]) {
        String name = "shruti";
        char target = 'u';
    //    System.out.println(search1(name,target));
    System.out.println(search2(name,target));
    }
}

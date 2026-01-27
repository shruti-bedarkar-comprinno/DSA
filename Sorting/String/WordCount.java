public class WordCount {
    public static void main(String[] args) {
        String str = "Java is very easy";
        String[] words = str.split(" ");

        System.out.println("Word count: " + words.length);
    }
}

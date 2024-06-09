public class goodNumber {
    public static void main(String[] args) {
        System.out.println("hello shashi");
        int num = 113456789;
        String convertedString = Integer.toString(num);
        System.out.println(convertedString);
        String[] words = convertedString.split("\\s+");
        System.out.println(words[2]);

    }

}

import java.util.ArrayList;

class charRepeatCount {
    public static void main(String[] args) {
        String names = "shashidharpapishetty";
        char[] charArr = names.toCharArray();
        ArrayList<Character> charListRepeats = new ArrayList<Character>();
        ArrayList<Character> repeated = new ArrayList<Character>();

        // Find the repeated characters
        for (int i = 0; i < charArr.length; i++) {
            if (charListRepeats.contains(charArr[i]) && !repeated.contains(charArr[i])) {
                repeated.add(charArr[i]);
            } else {
                charListRepeats.add(charArr[i]);
            }
        }

        // Print repeated characters
        System.out.println("Repeated Characters: " + repeated);

        // Count occurrences of each character and print the result
        for (char c : repeated) {
            int count = 0;
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == c) {
                    count++;
                }
            }
            System.out.println(c + " --> " + count);
        }
    }
}

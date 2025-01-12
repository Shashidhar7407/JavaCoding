package ArrayList;

import java.util.ArrayList;

class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add(0, "shashi");
        players.add(1, "manoj");
        System.out.println(players);
        players.add("vishnu");
        System.out.println(players);

        ArrayList<Integer> count = new ArrayList<>();
        count.add(1);
        count.add(2);
        System.out.println(count);
    }
}

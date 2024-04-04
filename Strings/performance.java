package Strings;

public class performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i <26;i++){
            char c=(char)(97+i);
            char ch=(char) ('a'+i);
            // System.out.println(c);
            // System.out.println(ch);
            series=series+ch;   
            // System.out.println(series);
        }
        System.out.println(series.length());
        System.out.println(series);
    }
    
}

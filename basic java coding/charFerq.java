public class charFerq {

    static int get_discout_coupon(String Coupon_code){
        int[] char_Array=new int[25];
        String target_word="shashi";
        for(char c:target_word.toCharArray()){
            char_Array[c-'a']++;
        }

        int[] available_frequency=new int[25];
        for(char c:Coupon_code.toCharArray()){
            available_frequency[c='a']++;
            }
            int max_value=int.MAX_VALUE;
            for(char c:target_word.toCharArray()){
                int required=char_Array[c-'a'];
                if(required>0){
                    max_value=Math.min(max_value,);
                }
            }




    }
    public static void main(String[] args) {
        
    }
    
}

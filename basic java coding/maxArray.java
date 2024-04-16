public class maxArray {
    public static void main(String[] args) {
        int[] array1 = {2, 3, -4, 5};
        int max=array1[0];
        for(int i=1; i<array1.length; i++){
            if(array1[i]>max){
                max=array1[i];
        }
    }
    System.out.println(max);
}
}
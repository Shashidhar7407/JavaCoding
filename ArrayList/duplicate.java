import java.util.*;

class duplicate {
    public static void main(String[] args) {
int[] arr={1,2,2,3,4,4,5};
HashSet<Integer> set=new HashSet<>();
for(int num:arr){
set.add(num);
}

int[] uniqueElementsArray=new int[set.size()];
for(int i=0;i<arr.length;i++){
if(i<=set.size()){
uniqueElementsArray[i]=(Integer)(set.get(i));
}
else{
uniqueElementsArray[i]=Integer.parseInt("-");

}

System.out.println(Arrays.toString(uniqueElementsArray));
    }
}
import java.util.*;


public class subarr {
    public static void maxnumarr(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                currentsum=0;
                int end=j;
               for(int k=start;k<=end;k++){
                currentsum += num[k];
                
               }
               System.out.println(currentsum);
               if (maxsum<currentsum) {
                maxsum=currentsum;
               }
               
            }
           
        }
        System.out.println("maximum sum is"+maxsum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8};
        maxnumarr(num);
    }
}

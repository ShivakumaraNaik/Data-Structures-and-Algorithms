import java.util.*;


public class binsrc {
    public static int Binarysrc(int num[],int key){
       int start =0 , end=num.length-1;
       while (start <= end) {
        int mid = (start+end)/2;

        if(num[mid]==key){
            return mid;
        }
        if (num[mid]<key) {
                start=mid+1;
            
        }else{
            end=mid-1;
        }
        
       }

        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,4,10,6,7,8};
        int key = 10;
        System.out.println("key is at the index   "+Binarysrc(num, key));
    }
}

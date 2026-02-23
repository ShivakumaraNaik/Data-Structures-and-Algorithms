package arrays;

public class prac {
    public static int check (int num[]){
        for(int i=0;i<num.length;i++){
            if(num[i]==num[i+1]){
                return false;
            }else{
                return true;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,1};
        check(num);
    }
}

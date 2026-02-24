public class substring {

    public static String sub(String str,int si,int ei){
        String str1 = "";
        for(int i=0;i<=ei-1;i++){
            str1 += str.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(sub(str, 0, 5));
    }
}

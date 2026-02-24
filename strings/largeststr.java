public class largeststr {
    public static void main(String[] args) {
        String str[]={"apple","mango","banana"};

        String lar=str[0];

        for(int i=1;i<str.length;i++){
            if(lar.compareTo(str[i])<0){
                lar=str[i];
            }
        }
        System.out.println(lar);
    }
}

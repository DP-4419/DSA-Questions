public class reverse{
    public static String reverse(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
            rev += s.charAt(i);
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverse("deepak"));
    }
}
import java.util.Scanner;;
public class vowel {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
      char alpha =scan.next().charAt(0);
      if(alpha>='a' && alpha<='z' )
       if(alpha== 'a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
      {
      System.out.println(alpha+ " is a vowel");
      }else{
        System.out.println("It is consonant");
      }


    }
    
}

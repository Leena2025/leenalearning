import java.util.Scanner;
public class score {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int score=scan.nextInt();
        if(score>=0 && score<=100)
         if(score>=50)
        {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }
    
}

import java.util.Scanner;
public class elseif{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        if(age>0 && age<=12){
            System.out.println("Child");
        }else if(age>=13 && age<=19){
            System.out.println("Teenager");
        }else if(age>=20 && age<=59){
            System.out.println("Adult");
        }else if(age>=60){
            System.out.println("Senior citizen");
        }else{
            System.out.println("Invalid age");
        }
    }
}
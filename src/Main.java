
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    //    int age= 20;
      //  if(age>=18) {
        //    System.out.println("Major");
        //}else{
          //  System.out.println("minor");
//
  //      }
   // Scanner input=new Scanner(System.in);
     //   System.out.println("PLease enter your age ");
     //   int age=input.nextInt();
        //if(age>=18){
       //     System.out.println("Major");

    //    }else{
      //      System.out.println("Minor21");
        //}
    //else if
        Scanner input=new Scanner(System.in);
        System.out.println("PLease enter your marks ");
        int score=input.nextInt();
        if(score>=70){
            System.out.println("Grade A");
        }else if(score<70 && score  <=50) {
            System.out.println("Garde B");
        } else if(score<50 && score>=30) {
            System.out.println("Grade B");
        }else{
            System.out.println("Fail");

        }

    }

}
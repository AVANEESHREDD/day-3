
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
      //  Scanner input=new Scanner(System.in);
        //System.out.println("PLease enter your marks ");
//        int score=input.nextInt();
//        if(score>=70){
//            System.out.println("Grade A");
//        }else if(score<70 && score  <=50) {
//            System.out.println("Garde B");
//        } else if(score<50 && score>=30) {
//            System.out.println("Grade B");
//        }else{
//            System.out.println("Fail");
//
//        }
// Nested if else
Scanner sc=new Scanner(System.In);
        System.out.println("PLease enter your name");
        String name=sc.next();
        int price=100;
        System.out.println("D you have any coupon code, reply 'Yes' or 'no'");
        char hasCoupon=sc.next().charAt(0);
        //SAVE50 , SAVE3O are the coupon codes
        if(hasCoupon='Y'){
            System.out.println("coupon code");
            String couponcode=sc.next|();
            if (couponcode equals to ("Save50")){
                price = (int) (100 * 0.5);
                System.out.println("name+YOu have to pay " + price"rupees only!!");
            }
            } else if (couponCode.equals("Save30")) {
            System.out.println(name+"You have to pay"+price"rupees only !!");

        }
    }
    }

}
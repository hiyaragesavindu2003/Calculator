 import java.util.Scanner;


 public class cal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.println("01.Addition");
            System.out.println("02.Substraction");
            System.out.println("03.Maltipication");
            System.out.println("04.Divsion");
            System.out.print("Enter the num. as your operation: ");
         
            
            int Op = input.nextInt();

            System.out.print("Enter two num:");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();

            calculater a1 = new calculater(num1,num2);
            switch (Op) {
                case 1:
                    System.out.println("Answer :"+ a1.add());
                    break;
                
                case 2:
                    System.out.println("Answer :"+ a1.sub());
                    break;
                 
                 case 3:
                    System.out.println("Answer :"+ a1.mul());
                    break;
                    
                 case 4:
                    System.out.println("Answer :"+ a1.div());
                    break;  
                
                  
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
            


            //calculate.op();


            
            
    }
 }
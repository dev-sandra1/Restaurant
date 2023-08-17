import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) { 

        Scanner entry = new Scanner(System.in);
        int totalAcount = 0;
        boolean close = false;

        do {
        System.out.print("Hello!! Welcome to Sam's Restaurant :3" 
            + "\n Menu:"
            + "\n 1.Drinks" 
            + "\n 2.Meals" 
            + "\n 3.Desserts"
            + "\n option: ");
            int option = entry.nextInt();

        switch (option) {
            case 1: 
                totalAcount += drinks();
            break;

            case 2:totalAcount += eat();
            break;

            case 3: totalAcount += dessert();
            break;
            
             default:
            System.out.println("wrong option");
            close = true;
             System.out.print("Total acount is: " + totalAcount);
        }
       
        } while (!close);
    }


     public static int drinks(){  
        Scanner entry = new Scanner(System.in);

        System.out.print("drinks" 
                + "\n 1.Coke = $100" 
                + "\n 2.Wate = 90"
                + "\n 3.Soda = 200"
                + "\n option: ");
        int option = entry.nextInt();

        if(option == 1){
            return 100;
        } else if(option == 2){
            return 90;
        }else{ return 200;}
        
        
    }
      public static int eat(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Eats"
        + "\n 1.Maruchan = 20"
        + "\n 2.Spaghetti = 30"
        + "\n 3.Rice = 100"
        + "\n option: ");
        int option = entry.nextInt();

        if(option == 1){
            return 20; 
        }else if(option == 2){
        return 30;
        } 
            return 100;
        
      }

      public static int dessert(){
        Scanner entry = new Scanner(System.in);
        System.out.print("Dessert" 
            + "\n 1.cookies = $80" 
            + "\n 2.cake = $400" 
            + "\n 3.pay = $500"
            + "\n option: ");
        int option = entry.nextInt();
        
        if(option == 1){
            return 80;
        }else if(option == 2){
            return 400;
        }  
         
        return 500;

      }
}
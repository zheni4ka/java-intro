import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class Homework {

    public static void pauseclear()
    {
        
        try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
        }
        
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static boolean isCorrect(int num1, int num2, int res)
    {
        if(num1 * num2 == res) return true;
        return false;
    }
    
    
    public static void Task()
    {
        int score = 1;

        for(int i = 1; i <= 12; i++)
        {  
            System.out.println("Your score: " + score);
            int num1 = new Random().nextInt(10);
            int num2 = new Random().nextInt(10);
            
            int res = 0;
            
            System.out.println(num1 + " * " + num2);
            
            res = new Scanner(System.in).nextInt();

            if(isCorrect(num1, num2, res)) 
            {
                System.out.println("Correct!!!");
                score++;
            } else System.out.println("Incorrect(((");

            pauseclear();
        }
    }
    
    public static void main(String[] args) {
        Task();
    }
}
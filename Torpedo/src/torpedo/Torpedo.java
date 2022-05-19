package torpedo;

import java.util.Random;
import java.util.Scanner;


public class Torpedo {
    static int palyahossza = 7;
    static int hajohossza = 3;
    static int lovesekSzama = 0;
    static int[] lovesekHelye = new int[7];
    static int[] hajoHelye = new int[hajohossza];
    
    public static void main(String[] args) {

    }
    
    public static void hajoELhelyez(){
        Random rnd = new Random();
        int hajoKezdo = rnd.nextInt(palyahossza-hajohossza)+1;
        for (int i = 0; i < hajoHelye.length; i++) {
            hajoHelye[i] = hajoKezdo+i;
        }
    }
    
    public static void loves(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Adj meg egy számot hogy melyik területre akarsz torpedozni: ");
            int loves = sc.nextInt();
        }while(true);
        
    }

    public static void kiiratas(){
        System.out.printf("%d találatból süllyedt el a hajó!",lovesekSzama);
    }
}
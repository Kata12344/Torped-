package torpedo;

import java.util.Scanner;

public class Torpedo {
    static int palyahossza = 7;
    static int hajohossza = 3;
    static int lovesekSzama = 0;
    static int[] lovesekHelye = new int[7];
    static int[] hajoHelye = new int[3];
    
    public static void main(String[] args) {

    }
    
    public static void hajoELhelyez(){
    }
    
    public static void loves(){
        Scanner sc = new Scanner(System.in);
        int találatokSzama = 0;
        boolean sullyedt;
        do{
            sullyedt = hajohossza == találatokSzama;
            System.out.print("Adj meg egy számot hogy melyik területre akarsz torpedozni: ");
            int loves = sc.nextInt();
            for (int i = 0; i < hajoHelye.length; i++) {
                if(loves == hajoHelye[i]){
                    találatokSzama++;
                }
            }
        }while(sullyedt);
        
    }

    public static void kiiratas(){
    
    }
}
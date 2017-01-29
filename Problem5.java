/**
 * A Java brute force attempt at Project Euler #5
 * Methods are static for simplicity.
 *
 * By Jacob Richard
 */
public class Problem5{
    public static void main(String[] args){
        int startValue = 21;

        while(!checkDivisibility(startValue)){
            startValue++;
        }
        System.out.println(startValue);
    }

    public static boolean checkDivisibility(int item){
        boolean divis = true;
        int numberToDivide = 20;
        while(divis == true && numberToDivide > 1){
            int result = item % numberToDivide;
            if(result != 0){
                divis = false;
            }
            numberToDivide--;
        }
        return divis;
    }
}


public class Solution {
    public static boolean isPrime(int num){
        int counter = 2;
        if (num == 1 || num == 0){
            return false;
        }
        else{
            while (counter < num){
                if (num % counter == 0){
                    return false;
                }
                counter++;
            }
            return true;
        }
        
    }
    public static void main(String[] args){
        System.out.println(Solution.isPrime(100)); // -> false
        System.out.println(Solution.isPrime(2)); //-> true
        System.out.println(Solution.isPrime(0));  //-> false
        System.out.println(Solution.isPrime(1));  //-> false
        System.out.println(Solution.isPrime(31)); //-> true
    }
}
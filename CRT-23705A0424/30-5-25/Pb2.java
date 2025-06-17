public class Main{
    public static void main(String[] args){
        int num = 145;
        int count = 0;
        while(num != 0){
            num = num/10;
            int lastDigit = num%10;
            if(lastDigit%2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
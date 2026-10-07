import java .util.Scanner; 
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int reverse=0;
        int original=num;
        while(num!=0){
            int n=num%10;
            reverse=reverse*10+n;
            num=num/10;
        
        }
        if(original==reverse){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It id not palindrome");

        }
        sc.close();

        

    }
    
}

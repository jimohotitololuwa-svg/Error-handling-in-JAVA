public class Main{
    public static void main(String[]args){
        try{
            int a = 10;
            int b= 0; 
            int result = a/b;
            System.out.println(result);

            int [] number = {1,2,3,4,5};
            System.out.println(number[10]);

        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index is out of bounds.");
        }
        
        finally{
        System.out.println("this always run no matter what ");
    }
}
}
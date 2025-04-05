package trycatch;

public class Second {
    public static void  main(String[] args){
        int[] array = {10,5,0,2};

        for (int i =0; i<array.length; i++)
        {
            try{
                int result = 100/array[i];
                System.out.println(result);
            } catch(ArithmeticException e){
                System.out.println("0-a bolme xetasi ");
            }
        }
    }
}

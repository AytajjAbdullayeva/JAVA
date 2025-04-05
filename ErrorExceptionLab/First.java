public class First {
    public static void main(String[] args){
        int x = 5;
        int[] array = new int[x];

        try {
            array[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("X dəyəri aşılıb!");
        }
    }
}

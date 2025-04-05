package trycatch;

public class Fourth {
    public static void main(String[] args) {
        try {
            int size = Integer.MAX_VALUE;
            int[] bigArray = new int[size];

            for (int i = 0; i < bigArray.length; i++) {
                bigArray[i] = i;
                if (i % 10_000_000 == 0) {
                    System.out.println("Element əlavə edildi: " + i);
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemory");
        }
    }
}

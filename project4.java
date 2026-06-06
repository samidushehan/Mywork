public class project4 {
    public static void main(String[] args) {
        System.out.println("        Multiplication table");
        System.out.println("     1  2  3  4  5  6  7  8  9");
        System.out.println("---------------------------------------");
        
        int count = 1;
        //int num = 1;
        
        //int value  = 0;

        while (count <= 9) {
            int num = 1;
            System.out.printf("%2d |", count);
            while (num <=9) {
                int value = count * num;
                System.out.printf("%2d ", value);
                num++;
                
            }
     
            System.out.println();
            count++;
        
        }
   }
}
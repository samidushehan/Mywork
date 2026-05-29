import java.util.Scanner;
public class pactrical3_3 {
    public static void main(String[] args){
       try( Scanner input = new Scanner(System.in);){

        System.out.println("-------------------------------");
        System.out.println("Read Data");
        System.out.println("-------------------------------");

        System.out.print("Please enter Item code   : ");
        String itemcode = input.next();
        input.nextLine();
        System.out.print("Please enter Descripsion : ");
        String Description = input.nextLine();
        System.out.print("Please Enter Unit Price  : ");
        double unitprice = input.nextDouble();
        System.out.print("Please Enter Quantity    : ");
        int quantity = input.nextInt();

        System.out.println("-------------------------------");
        double totalprice = unitprice * quantity ;
        System.out.println("-------------------------------");
        System.out.println("Product Purchasing INVOICE");
        System.out.println("-------------------------------");

        double VAT = totalprice * 0.12 ;
        Double NBT = (totalprice + VAT) * 0.02 ;
        System.out.printf("Item code %20s " ,  itemcode );
        System.out.printf("\nDescription %19s " , Description);
         System.out.printf("\nUnit Price%21.2f" , unitprice);
        System.out.printf("\nQuantity%20d" , quantity);
        System.out.printf("\nTotal Price%21.2f" , totalprice);
        System.out.printf("\nVAT(12%%) %25s" , VAT);
        System.out.printf("\nNBT(2%%) %26s" , NBT);

        System.out.printf("\n---------------------------------------------");
        double Netamount = totalprice + VAT + NBT ;
        System.out.printf("\nnet amount %25s" , Netamount);        
        System.out.printf("\n---------------------------------------------");
       }
    }
    
}

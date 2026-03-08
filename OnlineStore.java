import java.util.ArrayList;
import java.util.Collections;

public class OnlineStore {

    public static void main(String[] args){

        ArrayList<Double> OrderAmounts = new ArrayList<>();
        OrderAmounts.add(100.00);
        OrderAmounts.add(300.00);              //1.
        OrderAmounts.add(400.00);
        OrderAmounts.add(600.00);
        OrderAmounts.add(500.00);
        OrderAmounts.add(200.00);

        OrderAmounts.removeIf(Order -> Order < 500);          //2.

        for(int i=0; i<OrderAmounts.size(); i++){
            if(OrderAmounts.get(i) > 5000){
                OrderAmounts.set(i, OrderAmounts.get(i) * 0.9);                //3.
            }
        }

        double totalrev=0;

        for(double temp : OrderAmounts){
            totalrev = totalrev + temp;                     //4.
        }

        Collections.sort(OrderAmounts);

        // Display results
        System.out.println("Sorted Orders: " + OrderAmounts);       //5.
        System.out.println("Total Revenue: " + totalrev);
    }
}

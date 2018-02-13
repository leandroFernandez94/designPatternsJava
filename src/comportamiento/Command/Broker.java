package comportamiento.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leandro on 7/1/17.
 */

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}

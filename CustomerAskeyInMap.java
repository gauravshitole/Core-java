package Collection;

import java.util.HashMap;
import java.util.Map;

public class CustomerAskeyInMap {
    public static void main(String[] args){
        Customer shubham=new Customer(1,"Shubham","Punjab","sdfs1231a","532256754","2453225643","shu@gmail.com");
        Customer shami=new Customer(2,"Shami","up","sdfswsd12","53224354","34453223253","shami@gmail.com");


        Map<Customer,String> customerToMapPan =new HashMap<>();
        customerToMapPan.put(shubham,shubham.getPan());
        customerToMapPan.put(shami,shami.getPan());

        System.out.println("Customer Pan"+customerToMapPan);
        System.out.println("Shubham pan"+customerToMapPan.get(shubham));

        Customer shubhamCopy=new Customer(1,"Shubham","Punjab","sdfs1231a","532256754","2453225643","shu@gmail.com");
        System.out.println("shubhamCopy  "+customerToMapPan.get(shubhamCopy));
    }
}

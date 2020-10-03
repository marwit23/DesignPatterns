package behavioral.nullobject;

public class CustomerFactory {

    static final String[] names = {"Rob", "Joe", "Julie"};

    static AbstractCustomer getCustomer(String name){

        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

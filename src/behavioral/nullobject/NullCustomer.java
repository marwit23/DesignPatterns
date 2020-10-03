package behavioral.nullobject;

public class NullCustomer extends AbstractCustomer {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "No available customer in database";
    }
}

package creational.singleton;

class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    static SingleObject getInstance(){
        return instance;
    }

    void showMessage(){
        System.out.println("Hello World!");
    }
}

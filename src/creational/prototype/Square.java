package creational.prototype;

class Square extends Shape {

    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Draw Square");
    }
}
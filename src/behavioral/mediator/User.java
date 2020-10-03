package behavioral.mediator;

class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}

class Cellphone {

    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling friend...");
    }
}

class Main2 {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.ring();
        phone.vibrate();
        phone.callFriend();
    }
}

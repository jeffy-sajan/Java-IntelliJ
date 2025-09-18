interface Camera {
    void takePhoto();
}

interface Phone {
    void makeCall(String number);
}

class Smartphone implements Camera, Phone {
    public void takePhoto() {
        System.out.println("Photo taken.");
    }
    public void makeCall(String number) {
        System.out.println("Calling " + number + ".");
    }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.takePhoto();
        sp.makeCall("123-456-7890");
    }
}

public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnLight() {
        light.turnOn();
    }

    public void turnOffLight() {
        light.turnOff();
    }

    public void turnOnTV() {
        tv.turnOn();
    }

    public void turnOffTV() {
        tv.turnOff();
    }

    public void turnOnAirConditioning() {
        airConditioning.turnOn();
    }

    public void turnOffAirConditioning() {
        airConditioning.turnOff();
    }

    public void turnOnAll() {
        System.out.println("\n--- Activating All Home Services ---");
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        System.out.println("\n--- Deactivating All Home Services ---");
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}

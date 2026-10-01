public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        // Controlling individual services seamlessly
        System.out.println("--- Individual Service Controls ---");
        homeInterface.turnOnLight();
        homeInterface.turnOffLight();
        
        homeInterface.turnOnTV();
        homeInterface.turnOffTV();

        // Controlling all services simultaneously via Facade
        homeInterface.turnOnAll();
        homeInterface.turnOffAll();
    }
}

public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();

        System.out.println("--- Individual Service Controls ---");
        homeInterface.turnOnLight();
        homeInterface.turnOffLight();
        
        homeInterface.turnOnTV();
        homeInterface.turnOffTV();

        homeInterface.turnOnAll();
        homeInterface.turnOffAll();
    }
}

public class PlatformInfo {
    public static void main(String[] args) {

        System.out.println("=== HCL Hackathon ===");
        System.out.println("Java Version: "
                + System.getProperty("java.version"));

        System.out.println("Operating System: "
                + System.getProperty("os.name"));

        System.out.println("OS Architecture: "
                + System.getProperty("os.arch"));

        System.out.println("Available Processors: "
                + Runtime.getRuntime().availableProcessors());

        System.out.println("Maximum JVM Memory: "
                + Runtime.getRuntime().maxMemory() / (1024 * 1024)
                + " MB");
    }
}
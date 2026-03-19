public class tap6 {
    static class Config {
        static String appName;
        static int version;

        static {
            appName = "MyApplication";
            version = 2;
            System.out.println("Static block executed");
        }
    }

    public static void main(String[] args) {
        System.out.println(Config.appName);
    }
}
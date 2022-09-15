

package selenium_core;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(String type) throws Exception {
        DriverManager driverManager;

        if ("CHROME".equals(type)) {
            driverManager = new ChromeDriverManager();
        } else {
            throw new Exception("Browser: " + type + " is not currently supported!\nPlease use CHROME  browser!");
        }
        return driverManager;
    }
}
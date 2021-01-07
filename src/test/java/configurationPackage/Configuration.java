package configurationPackage;


public class Configuration
{
    private static Configuration instance;
    public String siteURL = "https://keytorc.com";

    public static Configuration getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }
    private static synchronized void createInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
    }


    public String getSiteURL()
    {
        return siteURL;
    }
}
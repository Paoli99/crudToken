package factoryBrowser;

public class FactoryBrowser {
    public static IBrowser make(String browserType) {
        IBrowser browser;

        switch (browserType.toLowerCase()) {
            case "edge":
                browser = new Edge();
                break;
            case "chrome":
                browser = new Chrome();
                break;
            default:
                browser = new Firefox();
                break;
        }

        return browser;

    }
}

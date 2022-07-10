package homework01_07;

public class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Firefox browser is opened");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Firefox browser is closed");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Firefox browser's window is maximized");
    }
    @Override
    public void findElement() {
        System.out.println("Firefox browser's element is found");
    }
}

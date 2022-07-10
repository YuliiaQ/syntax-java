package homework01_07;

public class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Chrome browser is opened");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Chrome browser is closed");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Chrome browser's window is maximized");
    }
    @Override
    public void findElement() {
        System.out.println("Chrome browser's element is found");
    }
}

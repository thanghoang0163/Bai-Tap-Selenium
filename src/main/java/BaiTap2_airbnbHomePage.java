import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaiTap2_airbnbHomePage {
    public static void main(String[] args) throws InterruptedException {
        // Start Chrome browser
        ChromeOptions options = new ChromeOptions();

        // Set browser version
        options.setBrowserVersion("149");

        // Turn off automation bar notification
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        ChromeDriver driver = new ChromeDriver(options);
        // Open in full screen mode
//        driver.manage().window().maximize();

        // Open website on Chrome
        driver.get("https://demo5.cybersoft.edu.vn/");

        Thread.sleep(1000);

        // =================================================================
        // Do bài tập chỉ yêu cầu xác định locator nên em không có thực hiện
        // các hành động như click, sendKey,...
        // mà chỉ lấy locator như xPath, id, ...
        // ==================================================================

        // 1. Website logo
        By byLogo = By.xpath("//a[img[@alt='Cyber Logo']]");
        WebElement logo = driver.findElement(byLogo);

        // 2. Home navigation
        By byHomeCategory = By.xpath("//a[@href='/'][text()='Home']");
        WebElement homeCategory = driver.findElement(byHomeCategory);

        // 3. About navigation
        By byAboutCategory = By.xpath("//a[@href='/'][text()='About']");
        WebElement aboutCategory = driver.findElement(byAboutCategory);

        // 4. Profile
        By byProfile = By.xpath("//button[img[contains(@class,'h-10')]]");
        WebElement profile = driver.findElement(byProfile);

        // 5. Location component
        By byLocation = By.xpath("//div[p[text()='Địa điểm']]");
        WebElement location = driver.findElement(byLocation);

        // 6. Date time component
        By byDateTime = By.xpath("//div[p[contains(normalize-space(),' –')]]");
        WebElement addGuest = driver.findElement(byDateTime);

        // 7. Guest component
        By byGuest = By.xpath("//div[p[text()='Thêm khách']]");
        WebElement guest = driver.findElement(byGuest);

        // 8. Increase guest component
        By byIncreaseGuest = By.xpath("//button[div[text()='+']]");
        WebElement increaseGuest = driver.findElement(byIncreaseGuest);

        // 9. Decrease guest component
        By byDecreaseGuest = By.xpath("//button[div[text()='-']]");
        WebElement decreaseGuest = driver.findElement(byDecreaseGuest);

        // 10. Hồ Chí Minh location component
        By byHoChiMinhLocation = By.xpath("//a[descendant::h2[text()='Hồ Chí Minh']]");
        WebElement HoChiMinhLocation = driver.findElement(byHoChiMinhLocation);

        // 11. Cần Thơ location component
        By bytxtCanThoLocation = By.xpath("//h2[text()='Cần Thơ']");
        WebElement txtCanThoLocation = driver.findElement(bytxtCanThoLocation);

        // 12. Accommodation component
        By byAccommodation = By.xpath("//button[text()='Loại nơi ở']");
        WebElement Accommodation = driver.findElement(byAccommodation);

        // 13. Price component
        By byPrice = By.xpath("//button[text()='Giá']");
        WebElement price = driver.findElement(byPrice);

        // 14. Driving time component
        By byDrivingTime = By.xpath("//p[contains(normalize-space(),'6.5')]");
        WebElement drivingTime = driver.findElement(byDrivingTime);

        Thread.sleep(2000);

        // Quit Chrome Driver: Close browser & kill process chromedriver
        driver.quit();
    }
}
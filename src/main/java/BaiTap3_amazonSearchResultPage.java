import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaiTap3_amazonSearchResultPage {
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
        driver.get("https://www.amazon.com/");

        Thread.sleep(1000);

        // =================================================================
        // Do bài tập chỉ yêu cầu xác định locator nên em không có thực hiện
        // các hành động như click, sendKey,...
        // mà chỉ lấy locator như xPath, id, ...
        // ==================================================================

        // 1. Product image
        By byProductImage = By.xpath("//img[@data-image-index='1']");
        WebElement productImage = driver.findElement(byProductImage);

        // 2. Product old price and currency
        By byOldProductPrice = By.xpath("(//div[contains(@aria-hidden,'522,730')][span[text()='List: ']])[1]");
        WebElement oldProductPrice = driver.findElement(byOldProductPrice);

        // 3. Product new price and currency
        By byProductPrice = By.xpath("//span[@class='a-price']/span[@class='a-offscreen' and contains(., '2,482,445')]");
        WebElement productPrice = driver.findElement(byProductPrice);

        // 4. Search "adidas"
        By byTxtSearch = By.xpath("//input[@type='text']");
        WebElement txtSearch = driver.findElement(byTxtSearch);
        txtSearch.sendKeys("adidas");

        // 5. Cart
        By byCart = By.xpath("//div[@id='nav-tools']/a[@id='nav-cart']");
        WebElement cart = driver.findElement(byCart);

        // 8. Product name
        By byProductName = By.xpath("//a/h2[@aria-label=\"Men's Basic 3-Stripes Tricot Track Suit\"]/span");
        WebElement productName = driver.findElement(byProductName);

        // 9. Product delivery
        By byProductDelivery = By.xpath("//div[contains(text(), '823,822 delivery')]");
        WebElement productDelivery = driver.findElement(byProductDelivery);

        // 10. Product category
        By byProductCategory = By.xpath("(//h2/span[text()='adidas'])[1]");
        WebElement productCategory = driver.findElement(byProductCategory);

        // 12. Men checkbox
        By byChkMen = By.xpath("//span[text()='Men']/preceding-sibling::div/descendant::input[@type='checkbox']");
        WebElement chkMen = driver.findElement(byChkMen);

        // 13. Search results
        By bySearchResults = By.xpath("//h2/span[contains(normalize-space(),'results for')]");
        WebElement searchResult = driver.findElement(bySearchResults);

        Thread.sleep(2000);

        // Quit Chrome Driver: Close browser & kill process chromedriver
        driver.quit();
    }
}
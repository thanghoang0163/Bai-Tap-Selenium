import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaiTap1_hrmAdminPage {
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
        driver.get("https.//opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

        Thread.sleep(2000);

//        // Step 1. Enter username
//        By byUsername = By.xpath("//input[@name='username']");
//        WebElement txtUsername = driver.findElement(byUsername);
//        txtUsername.sendKeys("admin");
//
//        // Step 2. Enter password
//        By byPassword = By.xpath("//input[@name='password']");
//        WebElement txtPassword = driver.findElement(byPassword);
//        txtPassword.sendKeys("admin123");
//
//        // Step 3. Click submit button
//        By bySubmit = By.xpath("//button[@type='submit']");
//        WebElement btnSubmit = driver.findElement(bySubmit);
//        btnSubmit.click();

        // =================================================================
        // Do bài tập chỉ yêu cầu xác định locator nên em không có thực hiện
        // các hành động như click, sendKey,...
        // mà chỉ lấy locator như xPath, id, ...
        // ==================================================================

        // 1. Admin Category
        By byAdminCategory = By.xpath("//a[contains(@class,'oxd-main-menu-item')][span[text()='Admin']]");
        WebElement adminCategory = driver.findElement(byAdminCategory);

        // 2. PIM Category
        By byPIMCategory = By.xpath("//a[contains(@class,'oxd-main-menu-item')][span[text()='PIM']]");
        WebElement PIMCategory = driver.findElement(byPIMCategory);

        // 3. Leave Category
        By byLeaveCategory = By.xpath("//a[contains(@class,'oxd-main-menu-item')][span[text()='Leave']]");
        WebElement leaveCategory = driver.findElement(byLeaveCategory);

        // 4. Username Input
        By byUsernameTxt = By.xpath("//label[normalize-space()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input[contains(@class,'oxd-input--active')]");
        WebElement usernameTxt = driver.findElement(byUsernameTxt);

        // 5. User Role Dropdown Menu
        By byUserRoleDropdownMenu = By.xpath("(//div[contains(@class,'oxd-select-text')])[1]");
        WebElement userRoleDropdownMenu = driver.findElement(byUserRoleDropdownMenu);

        // 6. Admin Option
        By byAdminOption = By.xpath("//div[@class='oxd-select-option'][ span[text()='Admin']]");
        WebElement adminOption = driver.findElement(byAdminOption);

        // 7. ESS Option
        By byESSOption = By.xpath("//div[@class='oxd-select-option'][ span[text()='ESS']]");
        WebElement ESSOption = driver.findElement(byESSOption);

        // 8. Employee Name Input
        By byEmployeeNameTxt = By.xpath("//input[@placeholder='Type for hints...']");
        WebElement employeeNameTxt = driver.findElement(byEmployeeNameTxt);

        // 9. Reset Button
        By byResetBtn = By.xpath("//button[contains(@class,'oxd-button') and contains(normalize-space(),'Reset')]");
        WebElement resetBtn = driver.findElement(byResetBtn);

        // 10. Search Button
        By bySearchBtn = By.xpath("//button[contains(@class,'oxd-button') and contains(normalize-space(),'Search')]");
        WebElement searchBtn = driver.findElement(bySearchBtn);

        // 11. User Management
        By byUserManagementTab = By.xpath("(//li[contains(@class,'oxd-topbar-body-nav-tab')])[1]");
        WebElement userManagementTab = driver.findElement(byUserManagementTab);

        // 12. Admin Username Cell
        By byAdminUserNameCell = By.xpath("(//div[@role='cell'][div[text()='Admin']])[1]");
        WebElement adminUserNameCell = driver.findElement(byAdminUserNameCell);

        // 13. ESS User Role Cell
        By byESSUserRoleCell = By.xpath("(//div[@role='cell'][div[text()='ESS']])[1]");
        WebElement ESSUserRoleCell = driver.findElement(byESSUserRoleCell);

        // 14. Delete Button
        By byDeleteButton = By.xpath("(//button[contains(@class,'oxd-icon-button')][i[contains(@class,'bi-trash')]])[1]");
        WebElement deleteButton = driver.findElement(byDeleteButton);

        // 15. Edit Button
        By byEditButton = By.xpath("(//button[contains(@class,'oxd-icon-button')][i[contains(@class,'bi-pencil-fill')]])[1]");
        WebElement editButton = driver.findElement(byEditButton);

        // 16. User Role Column Header
        By byUserRoleColumnHeader = By.xpath("//div[@role='columnheader' and text()='User Role']");
        WebElement userRoleColumnHeader = driver.findElement(byUserRoleColumnHeader);

        // 17. Employee Name Column Header
        By byEmployeeNameColumnHeader = By.xpath("//div[@role='columnheader' and text()='Employee Name']");
        WebElement employeeNameColumnHeader = driver.findElement(byEmployeeNameColumnHeader);

        // 18. Breadcrumb
        By byBreadcrumbMenu = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");
        WebElement breadcrumbMenu = driver.findElement(byBreadcrumbMenu);

        // 19. Left Side Arrow Button
        By byLeftSideArrowButton = By.xpath("//button[contains(@class,'oxd-icon-button') and @role='none']");
        WebElement leftSideArrowButton = driver.findElement(byLeftSideArrowButton);

        // 20. Up Arrow Button
        By byUpArrowBtn = By.xpath("//div[@class='--toggle']/button[@class='oxd-icon-button']");
        WebElement upArrowBtn = driver.findElement(byUpArrowBtn);

        // 21. Add Button
        By byAddBtn = By.xpath("//button[contains(@class,'oxd-button') and contains(normalize-space(),'Add')]");
        WebElement addBtn = driver.findElement(byAddBtn);

        Thread.sleep(2000);

        // Quit Chrome Driver: Close browser & kill process chromedriver
        driver.quit();

    }
}
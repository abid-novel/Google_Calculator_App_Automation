import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase {
    @FindBy(id = "com.google.android.calculator:id/digit_3")
    MobileElement btn3;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/digit_6")
    MobileElement btn6;
    @FindBy(id = "com.google.android.calculator:id/result_preview")
    MobileElement btnPreview;

    public TestCase(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String openApp() {
        btn3.click();
        btnPlus.click();
        btn6.click();
        return btnPreview.getText();
    }
}

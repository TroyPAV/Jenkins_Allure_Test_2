/**
 * Главная страница сайта Appleinsider.ru
 */
package page_object;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {


    private final SelenideElement textBoxInput = $x("//input[@type = 'text']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Выполняется поиск по строке и нажимается Enter
     * @param searchString поисковая строка
     */
    public void search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
    }
}

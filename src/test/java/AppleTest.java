import org.junit.Assert;
import org.junit.Test;
import page_object.MainPage;
import page_object.SearchResultsPage;

public class AppleTest extends BaseTest{

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String SEARCH_WORD = "iphone-13";

    @Test
    public void checkHref(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(SEARCH_STRING);
        SearchResultsPage resultsPage = new SearchResultsPage();
        String href = resultsPage.getHrefFromFirstArticle();
        Assert.assertTrue(href
                .contains(SEARCH_WORD));
    }
}

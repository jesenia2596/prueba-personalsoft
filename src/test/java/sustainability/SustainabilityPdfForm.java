package sustainability;

import org.openqa.selenium.By;

public class SustainabilityPdfForm {

    public static By BUTTON_ABOUT_US = By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/section/div[3]/nav/div/ul/li[4]/a");


    public static By BUTTON_CORPORATE_INFORMATION = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[1]/section/div[3]/div/div/div/div[2]/ul/li[3]/a");
    public static By BUTTON_SUSTAINABILITY = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[1]/section/div[3]/div/div/div/div[2]/ul/li[3]/ul/li/div[1]/ul[3]/li[1]/a");
    public static By BUTTON_GENERATION_SUSTAINABILITY = By.cssSelector("a[href='#tab5']");

    public static By BUTTON_PDF = By.xpath("//*[@id=\"tab5\"]/table/tbody/tr[1]/td[2]/span/a");
    public static By TITLE_PDF = By.partialLinkText("Sostenible");


}

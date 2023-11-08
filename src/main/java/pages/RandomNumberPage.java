package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RandomNumberPage {
    private final SelenideElement FieldGuess;
    private final SelenideElement BtnSubmit;
    private final SelenideElement BtnBuild;
    private final SelenideElement BtnRtd;
    private final SelenideElement LabelFB;

    public RandomNumberPage() {
        FieldGuess = $(By.name("numberGuess"));
        BtnSubmit = $(By.id("submitButton"));
        BtnBuild = $(By.name("buildNumber"));
        BtnRtd = $(By.id("rollDiceButton"));
        LabelFB = $(By.id("feedbackLabel"));
    }
    public void openPage() {
        open("https://testsheepnz.github.io/random-number.html");
    }

    public void ChangeBuild(String valueBuild) {
        BtnBuild.selectOptionByValue(valueBuild);
    }

    public void ClickBtnRtd() throws InterruptedException {
        BtnRtd.click();
        Thread.sleep(1500);
    }

    public void InputFieldGuess(String value1){
        FieldGuess.setValue(value1);
    }
    public void ClickSubmit() {BtnSubmit.click();}

    public void CheckLabelFb(String answer) {
        LabelFB.shouldBe(visible);
        LabelFB.shouldBe(Condition.text(answer));
    }
    public void ScrollBottom(){
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)")    ;
    }
}

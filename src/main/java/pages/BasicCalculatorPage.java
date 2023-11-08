package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasicCalculatorPage {
    private final SelenideElement FirstNumber;
    private final SelenideElement SecondNumber;
    private final SelenideElement BtnBuild;
    private final SelenideElement BtnOperation;
    private final SelenideElement Answer;


    public BasicCalculatorPage() {
        FirstNumber = $(By.name("number1"));
        SecondNumber = $(By.name("number2"));
        BtnBuild = $(By.name("selectBuild"));
        BtnOperation = $(By.name("selectOperation"));
        Answer = $(By.name("numberAnswer"));
    }
    public void openPage() {
        open("https://testsheepnz.github.io/BasicCalculator.html");
    }
    public void firstNumber(String number1) {
        FirstNumber.setValue(number1);
    }
    public void secondNumber(String number2) {
        SecondNumber.setValue(number2);
    }
    public void calculate() {
        $(By.id("calculateButton")).click();
    }
    public void result(String valueAnswer) {
        Answer.shouldBe(Condition.value(valueAnswer), Duration.ofSeconds(5));
    }

    public void ChangeBuild(String valueBuild) {
        BtnBuild.selectOptionByValue(valueBuild);
    }
    public void ChangeOperation(String valueOp) {
        BtnOperation.selectOptionByValue(valueOp);
    }
    public void ScrollBottom(){
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)")    ;
    }
}


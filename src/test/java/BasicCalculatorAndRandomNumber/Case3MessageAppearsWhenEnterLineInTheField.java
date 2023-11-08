package BasicCalculatorAndRandomNumber;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.RandomNumberPage;

public class Case3MessageAppearsWhenEnterLineInTheField {

    @Test
    void MessageAppearsWhenEnterLineInTheField() throws InterruptedException {
        RandomNumberPage rndnum = new RandomNumberPage();
        rndnum.openPage();
        rndnum.ScrollBottom();
        rndnum.ChangeBuild(String.valueOf(0));
        rndnum.ClickBtnRtd();
        rndnum.InputFieldGuess("string");
        rndnum.ClickSubmit();
        rndnum.CheckLabelFb("string: Not a number!");
        Selenide.closeWindow();
    }

}

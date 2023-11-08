package BasicCalculatorAndRandomNumber;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.BasicCalculatorPage;

public class Case2ConcatenationOfTwoStrings {

    @Test
    void ConcatenationOfTwoStrings(){
        BasicCalculatorPage calculator = new BasicCalculatorPage();
        calculator.openPage();
        calculator.ScrollBottom();
        calculator.ChangeBuild(String.valueOf(0));
        calculator.firstNumber("gs");
        calculator.secondNumber("bu");
        calculator.ChangeOperation(String.valueOf(4));
        calculator.calculate();
        calculator.result("gsbu");
        Selenide.closeWindow();
    }
}

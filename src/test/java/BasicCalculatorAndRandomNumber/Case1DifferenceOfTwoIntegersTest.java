package BasicCalculatorAndRandomNumber;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.BasicCalculatorPage;


public class Case1DifferenceOfTwoIntegersTest {

    @Test
    void DifferenceOfTwoIntegersTest(){
        BasicCalculatorPage calculator = new BasicCalculatorPage();
        calculator.openPage();
        calculator.ScrollBottom();
        calculator.ChangeBuild(String.valueOf(0));
        calculator.firstNumber(String.valueOf(2));
        calculator.secondNumber(String.valueOf(3));
        calculator.ChangeOperation(String.valueOf(1));
        calculator.calculate();
        calculator.result(String.valueOf(-1));
        Selenide.closeWindow();
    }
}

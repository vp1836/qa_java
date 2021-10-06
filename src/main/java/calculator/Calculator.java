package calculator;

import lombok.Getter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

@Getter
public class Calculator {

    private String calculatorName;

    NumberFormat numberFormat = NumberFormat.getInstance(Locale.FRANCE);

    DecimalFormat df = new DecimalFormat("#####.##");

    public Calculator(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    public double add(double firstNum, double secondNum) {
        return Double.parseDouble((df.format(firstNum + secondNum)));
    }

    public double subtract(double firstNum, double secondNum) {
        return Double.parseDouble((df.format(firstNum - secondNum)));
    }

    public double multiply(double firstNum, double secondNum) {
        return Double.parseDouble(df.format(firstNum * secondNum));
    }

    public double divide(double firstNum, double secondNum) {
        return Double.parseDouble((df.format(firstNum / secondNum)));
    }
}

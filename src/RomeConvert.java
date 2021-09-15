public class RomeConvert {
    String[] romeNumIn = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
    String[] romeNumOut = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};


    public int arabicConvert(String str) {
        int x = 0;
        for (int i = 0; i < romeNumIn.length; i++) {
            if (str.equals(romeNumIn[i])) {
                x = i;
            }
        }
        return x;
    }

    public String romeResult(int res) {

        return romeNumOut[res];
    }


    public void operation(String a, char oper, String b) {
        Calculator calc = new Calculator();
        int firstNum;
        int secondNum;
        int result;
        int count = 0;

        for (String s : romeNumIn) {
            if (a.toUpperCase().equals(s)) {
                a = a.toUpperCase();
                count++;
            }
            if (b.toUpperCase().equals(s)) {
                b = b.toUpperCase();
                count++;
            }
        }
        if (count == 0) {
            firstNum = Integer.parseInt(a);
            secondNum = Integer.parseInt(b);
            System.out.println(calc.calclog(firstNum, oper, secondNum));
        } else if (count == 1) {
            System.err.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно!");
        } else if (count == 2) {
            firstNum = arabicConvert(a);
            secondNum = arabicConvert(b);
            result = calc.calclog(firstNum, oper, secondNum);
            System.out.println(romeResult(result));
        }
    }
}


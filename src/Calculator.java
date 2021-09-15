public class Calculator {

    public int calclog(int x, char y, int z) {
        int result = 0;

        if (x > 0 && x < 11 && z > 0 && z < 11 ) {
            switch (y) {
                case '-':
                    result = x - z;
                    break;
                case '+':
                    result = x + z;
                    break;
                case '*':
                    result = x * z;
                    break;
                case '/':
                    result = x / z;
                    break;
                default:
                    System.err.println("Неверный знак!");
            }
        }

        return result;
    }


}

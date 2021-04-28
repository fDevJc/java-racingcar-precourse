public class ValidationChecker {
    public Boolean validNumber(String number) {
        return number.matches("^[0-9]+$");
    }

    public boolean isGreaterThanZero(int number) {
        return number > 0;
    }
}

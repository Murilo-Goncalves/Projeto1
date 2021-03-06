package model;

public class InputData {
    public static String inputString(String s) throws StringException.EmptyStringException {
        if (s.equals("")) throw new StringException.EmptyStringException();
        else return s;
    }
    public static String inputSign(String str) throws StringException.SignException,
                                                    StringException.EmptyStringException {
        if (str.length() < 4 || str.length() > 8) {
            throw new StringException.SignException();
        }
        else return str;
    }
}

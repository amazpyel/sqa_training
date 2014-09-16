/**
 * Created with IntelliJ IDEA.
 * Author: Oleksandr Pylkevych o.pylkevych@gmail.com
 * Date: 9/16/14
 * Time: 2:28 PM
 */
public class Warmup_1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (weekday == vacation) || weekday == false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 4 * a;
        } else {
            return a + b;
        }
    }

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking == true) && ((hour < 7) || (hour > 20));
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || (a + b) == 10;
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ((a >= 0 && b < 0 && negative != true) || (b >= 0 && a < 0 && negative != true) || (a < 0 && b < 0 && negative == true)) {
            return true;
        } else {
            return false;
        }
    }

    public String notString(String str) {
        if ((str.length() >= 3) && "not".equals(str.substring(0, 3))) {
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        if (n == 0) {
            return str.substring(1, str.length());
        }
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }

    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        if (str.length() < 2) return str + str + str;
        return str.substring(0, 2) + str + str.substring(0, 2);
    }

    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        return "hi".equals(str.substring(0, 2));
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) return false;
        else {
            return (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
        }
    }

    public String delDel(String str) {
        if ((str.length() <= 3) || !"del".equals(str.substring(1, 4))) return str;
        return str.charAt(0) + str.substring(4, str.length());
    }

    public boolean mixStart(String str) {
        return str.length() >= 3 && "ix".equals(str.substring(1, 3));
    }

    public String startOz(String str) {
        if ((str.length() < 2) || "oz".equals(str.substring(2))) return str;
        String result = "";
        if (str.charAt(0) == 'o') {
            result += str.charAt(0);
        }
        if (str.charAt(1) == 'z') {
            result += str.charAt(1);
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else return c;
    }

    public int close10(int a, int b) {
        if (a == b) return 0;
        if (Math.abs(10 - a) < Math.abs(10 - b)) return a;
        if (Math.abs(10 - b) < Math.abs(10 - a)) return b;
        return 0;
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            if (a > b) return a;
            else return b;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        else return 0;
    }

    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + n) {
            result += str.charAt(i);
        }
        return result;
    }
}

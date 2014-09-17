/**
 * Created with IntelliJ IDEA.
 * Author: Oleksandr Pylkevych o.pylkevych@gmail.com
 * Date: 9/16/14
 * Time: 5:38 PM
 */
public class String_1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String last = str.substring(str.length() - 2, str.length());
        return last + last + last;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;
        if (a.length() > b.length()) return b + a + b;
        return a + b + a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front) return str.substring(0, 1);
        return str.substring(str.length() - 1, str.length());
    }

    public String withouEnd2(String str) {
        if (str.length() <= 2) return "";
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        return str.length() >= 2 && "ly".equals(str.substring(str.length() - 2, str.length()));
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        if ((str.length() < index + 2) || (index < 0)) return str.substring(0, 2);
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if ((str.length() <= 3) && !str.equals("bad")) return false;
        return "bad".equals(str.substring(0, 3)) || "bad".equals(str.substring(1, 4));
    }

    public String atFirst(String str) {
        if (str.length() < 1) return "@@";
        if (str.length() < 2) return str + "@";
        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() != 0) return "@" + b.substring(b.length() - 1, b.length());
        if (b.length() == 0 && a.length() != 0) return a.substring(0, 1) + "@";
        if (a.length() == 0 && b.length() == 0) return "@@";
        return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) return a + b;
        if (a.charAt(a.length() - 1) == b.charAt(0)) return a.substring(0, a.length()) + b.substring(1, b.length());
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() >= 2)
            return str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length()) + str.substring(str.length() - 2, str.length() - 1);
        return str;
    }

    public String seeColor(String str) {
        if (str.length() < 3 || (str.length() < 4 && !(str.substring(0, 3).equals("red")))) return "";
        if (str.substring(0, 3).equals("red")) return "red";
        if (str.substring(0, 4).equals("blue")) return "blue";
        return "";
    }

    public boolean frontAgain(String str) {
        return str.length() >= 2 && str.substring(0,2).equals(str.substring(str.length()-2, str.length()));
    }

    public String minCat(String a, String b) {
        if(a.length() > b.length()) return a.substring(a.length() - b.length(), a.length()) + b;
        if(b.length() > a.length()) return a + b.substring(b.length() - a.length(), b.length());
        return a + b;
    }

    public String extraFront(String str) {
        if(str.length() > 2) return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        return str + str + str;
    }

    public String without2(String str) {
        if (str.length() > 1) {
            if (str.substring(0,2).equals(str.substring(str.length()-2, str.length()))) {
                return str.substring(2, str.length());
            }
            return str;
        }
        if (str.length() == 1) return str;
        return "";
    }

    public String deFront(String str) {
        String result = "";
        if(str.length() >= 2) {
            if (str.charAt(0) == 'a') {
                result += 'a';
            }
            if (str.charAt(1) == 'b') {
                result += 'b';
            }
            return result + str.substring(2, str.length());
        }
        return result;
    }

    public String startWord(String str, String word) {
        if (word.length() > str.length()) return "";
        if (str.substring(0, word.length()).equals(word)) return word;
        if (str.substring(1, word.length()).equals(word.substring(1)))
            return str.charAt(0) + word.substring(1);
        return "";
    }

    public String withoutX(String str) {
        if(str.length() >= 2) {
            if(str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(1, str.length()-1);
            }
            if(str.charAt(0) == 'x' && str.charAt(str.length() - 1) != 'x') {
                return str.substring(1, str.length());
            }
            if(str.charAt(0) != 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(0, str.length()-1);
            }
        }
        if (str.length() < 1)  return str;
        if (str.length() == 1 && str.charAt(0) == 'x') return "";
        return str;
    }

    public String withoutX2(String str) {
        if(str.length() >=2) {
            if(str.charAt(0) == 'x' || str.charAt(1) == 'x') {
                if(str.substring(0,2).equals("xx")) return str.substring(2,str.length());
                if(str.charAt(0) == 'x' && str.charAt(1) != 'x') return str.substring(1,str.length());
                if(str.charAt(0) != 'x' && str.charAt(1) == 'x') return str.substring(0,1)+ str.substring(2,str.length());
            }
        }
        if (str.length() <= 1) return "";
        return str;
    }
}

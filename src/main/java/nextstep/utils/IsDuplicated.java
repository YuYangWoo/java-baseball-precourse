package nextstep.utils;

public class IsDuplicated {

    public static boolean isCheck(String num) {
        for(int i = 0; i < num.length()-1; i++) {
            if(i == 0) {
                if(num.charAt(i) == num.charAt(i + 1) || num.charAt(i) == num.charAt(i + 2)) return true;
            }
            if(i == 1) {
                if(num.charAt(i) == num.charAt(i + 1)) return true;
            }
        }
        return false;
    }
}

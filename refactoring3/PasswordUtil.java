package refactoring3;

import java.util.regex.Pattern;

public class PasswordUtil {

    public static boolean checkValidPassword(String newPassword) {
        boolean result = true;

        // 서버설정으로부터 비밀번호 정책 받아오기
        // ...

        // 패스워드 정책
        String pwdCValidType    = "U,L,S,N";
        String pwdMinLength     = "8";
        String pwdMaxLength     = "20";

        // 비밀번호 길이 체크 로직
        // if (짧거나 길다면) return false;
        
        // 정규표현식 생성
        String regExpStrMust = "^";

        // 비밀번호 정책 배열 생성
        String[] validType = pwdCValidType.split(",");

        for(int i =0; i < validType.length; i++){
            switch (validType[i]){
                case "U" :  // 대문자
                    regExpStrMust += "(?=.*[A-Z])";
                    break;
                case "L" :  // 소문자
                    regExpStrMust += "(?=.*[a-z])";
                    break;
                case "S" :  // 특수문자
                    regExpStrMust += "(?=.*[~!@#$%^&*+=_{}:;'\"<>,./()|-])";
                    break;
                case "N" :  // 숫자
                    regExpStrMust += "(?=.*[0-9])";
                    break;
            }
        }

        // 비멀번호 유효성 검사
        if(Pattern.compile(regExpStrMust).matcher(newPassword).find()){
            return true;
        } else {
            return false;
        }

    }
}

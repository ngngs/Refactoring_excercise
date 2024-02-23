package refactoring3;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
public class refactoredPasswordUtil {


    public static boolean checkValidPassword(String newPassword) {
        boolean result = true;

        // 서버설정으로부터 비밀번호 정책 받아오기
        // ...

        // 패스워드 정책
        String pwdCValidType    = "3,U,L,S,N";
        String pwdMinLength     = "8";
        String pwdMaxLength     = "20";

        // 비밀번호 길이 체크 로직
        // if (짧거나 길다면) return false;

        // 정규표현식
        String upperRegex = "(?=.*[A-Z])";      // 대문자
        String smallRegex = ".(?=.*[a-z])";      // 소문자
        String specialRegex = "(?=.*[~!@#$%^&*+=_{}:;'\"<>,./()|-])";   // 특수문자
        String numberRegex = "(?=.*[0-9])";     // 숫자

        // 정규표현식 MAP 생성
        Map<String, Pattern> checkValidType = new HashMap<>();
        checkValidType.put("U", Pattern.compile(upperRegex));
        checkValidType.put("L", Pattern.compile(smallRegex));
        checkValidType.put("S", Pattern.compile(specialRegex));
        checkValidType.put("N", Pattern.compile(numberRegex));

        // 비밀번호 정책 배열 생성
        String[] validType = pwdCValidType.split(",");

        // 비밀번호 검사를 위한 int값 생성
        int requiredCount = Integer.parseInt(validType[0]);
        int satisfiedCount = 0;


        // 비멀번호 유효성 검사
        for (String valid : validType){
            if (isNumeric(valid)) continue;

            Pattern checkRegex = checkValidType.get(valid);
            if (checkRegex.matcher(newPassword).find()) satisfiedCount++;
        }

        // 검사한 비밀번호 유효성 수가 부족하다면 false return
        return satisfiedCount >= requiredCount;
    }

    public static boolean isNumeric(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}

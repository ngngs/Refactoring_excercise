package refactoring3;

public class testPasswordUtil {

    public static void main(String[] args) {

        // 유효한 비밀번호 (대문자, 소문자, 특수문자, 숫자 중 3가지 포함)
        String[] validPasswords = {
                "ValidPassword1!",   // 대문자, 소문자, 숫자 포함
                "PaSsWoRd123@",      // 대문자, 소문자, 특수문자 포함
                "SecurePwd!2022",    // 대문자, 특수문자, 숫자 포함
                "9StrongPwd!",       // 소문자, 특수문자, 숫자 포함
                "Passw0rd!!2024",    // 대문자, 소문자, 특수문자 포함
                "My$ecurePwd11",     // 대문자, 특수문자, 숫자 포함
                "Pwd!9876My",        // 대문자, 특수문자, 숫자 포함
                "V@lidP@ssw0rd"      // 대문자, 소문자, 특수문자 포함
        };

        // 유효하지 않은 비밀번호
        String[] invalidPasswords = {
                "NoNumbers",                   // 특수문자, 숫자 없음
                "nouppercaseor123",            // 특수문자, 대문자 없음
                "SPECIAL123123",               // 특수문자, 소문자 없음
                "12@3456789",                  // 대문자, 소문 없음
                "onlylower@caseletters",       // 대문자, 숫자 없음
                "abcd1234567",                 // 대문자, 특수문자 없음
                "ACD213456",                   // 소문자, 특수문자 없음
                "ABCD@#!@%$",                  // 소문자, 숫자 없음
                "AacDfdfasd"                   // 특수문자, 숫자 없음
        };

        for (String test : validPasswords){
            if(refactoredPasswordUtil.checkValidPassword(test)){
                System.out.println("테스트 통과");
            } else {
                System.out.println("테스트 실패" + test);
            }
        }

        System.out.println("=================");

        for (String test : invalidPasswords){
            if (refactoredPasswordUtil.checkValidPassword(test)){
                System.out.println("테스트 실패" + test);
            } else {
                System.out.println("테스트 통과");
            }
        }

    }

}

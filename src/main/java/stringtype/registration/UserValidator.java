package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return !"".equals(username);
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);

    }

    public boolean isValidEmail(String email) {

        int emailAtLocation = email.indexOf("@");

        int emailDotLocation = email.indexOf(".");

        int emailLength = email.length();

        boolean atAndDotAdequancy = (emailAtLocation > 0) && (emailDotLocation > emailAtLocation + 1) && ( emailLength != emailDotLocation + 1 );
        
        return atAndDotAdequancy;

    }
}

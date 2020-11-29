package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;

        if ( !emailAtValidator(email) ) {
            throw new IllegalArgumentException("Email address in not correct, \'@\' is missing!");
        } else if ( !emailDotValidator(email) ) {
            throw new IllegalArgumentException("Email address in not correct, \'.\' is missing!");
        } else {
            this.email = email;
        }
    }

    private boolean emailAtValidator(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }

    private boolean emailDotValidator(String email) {
        if (email.contains(".")) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        return ( firstName + " " + lastName );
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {

        String firstName = "György";
        String lastName = "Czinky";
        String email = "czinkygyorgy@gmail.com";

        User user = new User(firstName, lastName, email);

        System.out.println("\n" + user.getFullName());
        System.out.println(user.email);

    }
}

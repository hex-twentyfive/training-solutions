package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void getFullNameTest() {
        User user = new User("György", "Czinky", "czinkygyorgy@gmail.com");
        assertEquals("György Czinky",user.getFullName());
    }

    @Test
    public void validEmailValidationTest() {
        User user = new User("György", "Czinky", "czinkygyorgy@gmail.com");
        assertEquals("czinkygyorgy@gmail.com", user.getEmail());
    }

    @Test
    public void notValidEmailValidationTest() {
        Exception exceptionAt = assertThrows(IllegalArgumentException.class, () -> new User("György", "Czinky", "czinkygyorgygmail.com"));
        assertEquals("Email address in not correct, \'@\' is missing!", exceptionAt.getMessage());

        Exception exceptionDot = assertThrows(IllegalArgumentException.class, () -> new User("György", "Czinky", "czinkygyorgy@gmailcom"));
        assertEquals("Email address in not correct, \'.\' is missing!", exceptionDot.getMessage());
    }

}

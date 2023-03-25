import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    public static final String CORRECT_LOGIN = "user";
    public static final String CORRECT_EMAIL = "email@mail.ru";
    public static final String INCORRECT_EMAIL = "email.ru";

    @Test
    public void shouldCreateUserWhenParametersIsCorrect() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        Assertions.assertEquals(CORRECT_LOGIN, user.getLogin());
        Assertions.assertEquals(CORRECT_EMAIL, user.getEmail());
    }


    @Test
    public void emailValidation() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User(CORRECT_LOGIN, INCORRECT_EMAIL));
        Assertions.assertDoesNotThrow(() -> new User(CORRECT_LOGIN, CORRECT_EMAIL));
    }

    @Test
    public void loginAndEmailMustNotBeEquals() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User(CORRECT_LOGIN, CORRECT_LOGIN));
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

class Program {
    public boolean checkIsAdult(int age) {
        return age >= 18;
    }
}

public class ProgramTest {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        // Дописать проверку с понятным сообщением
        assertEquals("Возраст больше 18 лет должен возвращать true", true, isAdult);
    }
}

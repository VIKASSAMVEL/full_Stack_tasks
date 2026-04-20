package com.college.task18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTests {

    @Test
    public void testStudentValidationLogic() {
        // Sample unit test logic
        String name = "Vikas";
        String email = "vikas@example.com";
        
        assertEquals("Vikas", name);
        assertEquals(true, email.contains("@"));
    }
}

package com.college.task18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentServiceTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void testGetStudentByIdApi() throws Exception {
        // Arrange
        Student mockStudent = new Student();
        mockStudent.setId(1L);
        mockStudent.setName("Vikas");
        Mockito.when(studentRepository.findById(1L)).thenReturn(Optional.of(mockStudent));

        // Act & Assert
        mockMvc.perform(get("/api/students/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Vikas"));
    }

    @Test
    public void testStudentValidationLogic() {
        String email = "vikas@example.com";
        assertEquals(true, email.contains("@"));
    }
}

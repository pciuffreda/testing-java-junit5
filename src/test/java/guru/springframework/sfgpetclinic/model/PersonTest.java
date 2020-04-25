package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1L, "John", "Doe");

        //then
        assertAll("Test props set",
                () -> assertEquals(person.getFirstName(), "John"),
                () -> assertEquals(person.getLastName(), "Doe"));
    }

    @Test
    void groupedAssertionsMsg() {
        //given
        Person person = new Person(1L, "John", "Doe");

        //then
        assertAll("Test props set",
                () -> assertEquals(person.getFirstName(), "John", "First Name Failed"),
                () -> assertEquals(person.getLastName(), "Doe", "Last Name Failed"));
    }
}
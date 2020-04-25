package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Jim", "Black");
        owner.setCity("New York");
        owner.setTelephone("3334455666");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Jim", owner.getFirstName(), "First name did not match"),
                        () -> assertEquals("Black", owner.getLastName())),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("New York", owner.getCity(), "City did not match"),
                        () -> assertEquals("3334455666", owner.getTelephone())));
    }
}
package logic.person;

import java.util.Objects;

/**
 * Created by seb on 26.05.16.
 */
public abstract class Person implements Personality {

    private PersonDetails personDetails;

    public Person(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personDetails, person.personDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personDetails);
    }
}
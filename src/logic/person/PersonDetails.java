package logic.person;

import java.util.Objects;

/**
 * Created by seb on 26.05.16.
 */
public class PersonDetails {

    private String name;
    private Integer age;

    public PersonDetails(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDetails that = (PersonDetails) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

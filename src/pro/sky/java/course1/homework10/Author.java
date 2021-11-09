package pro.sky.java.course1.homework10;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {

        return this.firstName;
    }
    public String getSecondName() {

        return this.secondName;
    }
    @Override
    public String toString() {

        return firstName + " " + secondName;
    }
      @Override
    public boolean equals(Object obj) {
        Author otherAuthor = (Author) obj;
        if (this.firstName == otherAuthor.firstName && this.secondName == otherAuthor.secondName) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName + secondName);
    }

}



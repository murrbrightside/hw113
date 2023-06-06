package dz;

public class Author {
    private String lastName;
    private String firstName;

    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String toString (Author author){
        return "Имя автора " + author.getFirstName() + " Фамилия " + author.getLastName();
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) return false;
        Author a = (Author) obj;
        return getFirstName() == a.getFirstName() && getLastName() == a.getLastName();
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getFirstName(), getLastName());
    }
}

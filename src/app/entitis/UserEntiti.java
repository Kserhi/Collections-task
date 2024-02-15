package app.entitis;

public class UserEntiti {


    private String name;
    private String email;

    public UserEntiti(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", email='" + email + '\'';
    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

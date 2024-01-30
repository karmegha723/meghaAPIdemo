package org.example.pojo;

public class Data {
    private String id;
    private String email;
    private  String first_name;
    private String  last_name;
    private String avatar;


    public String getId() {
        return id;
    }

    // Setter
    public void setId(String newName) {
        this.id = newName;
    }

    public String getEmail() {
        return email;
    }

    // Setter
    public void setEmail(String newName) {
        this.email = newName;
    }
    public String getFirst_name() {
        return first_name;
    }

    // Setter
    public void setFirst_name(String newName) {
        this.first_name = newName;
    }
    public String getLast_name() {
        return last_name;
    }

    // Setter
    public void setLast_name(String newName) {
        this.last_name = newName;
    }
    public String getAvatar() {
        return avatar;
    }

    // Setter
    public void setAvatar(String newName) {
        this.avatar = newName;
    }

}

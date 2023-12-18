package Quiz4Prep.Annotations;

@UserPermission(1)
public class Admin {
    private String username;

    public Admin(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString(){
        return this.username;
    }
}

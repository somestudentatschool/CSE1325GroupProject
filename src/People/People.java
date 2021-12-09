package People;

public class People {

    //variables used to make a random person constructor
    String username;
    String degree;

    //Person constructor using their username, password, and degree
    public People(String username, String degree)
    {
        this.username = username;
        this.degree = degree;
    }

    public String getDegree()
    {
        return degree;
    }

    public String getUsername()
    {
        return username;
    }

}

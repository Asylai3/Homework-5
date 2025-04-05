package Part1;

public class Agent {
    private String name;
    private boolean isLoggedIn;

    public Agent(String name, boolean isLoggedIn) {
        this.name = name;
        this.isLoggedIn = isLoggedIn;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getName() {
        return name;
    }
}

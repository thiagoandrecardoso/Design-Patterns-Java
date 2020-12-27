package singleton;

public class People {
    private static People instance;

    private String name;

    private People() {
    }

    public static synchronized People getInstance() {
        if (instance == null) {
            instance = new People();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

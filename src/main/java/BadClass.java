import java.util.Objects;

public class BadClass {

    public String name;

    private BadClass() {

    }

    public String getName() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
       return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

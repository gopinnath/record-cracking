package ind.gopinnath;

public record Individual(int identifier, String firstName, String lastName) {

    public Individual {
        if(identifier < 1) throw new IllegalArgumentException("Invalid Identifier");
    }
}

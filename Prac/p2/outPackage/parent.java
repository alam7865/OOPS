package outPackage;

public class parent {
    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field"; // Package-private
    private String privateField = "Private Field";

    public void showFields() {
        System.out.println("Inside Parent:");
        System.out.println("Public: " + publicField);
        System.out.println("Protected: " + protectedField);
        System.out.println("Default: " + defaultField);
        System.out.println("Private: " + privateField);
    }
}

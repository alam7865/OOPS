package outPackage;

import outPackage.parent;

public class child {
    public static void main(String[] args) {
        parent parent = new parent();

        System.out.println("Access from Non-Subclass (Different Package):");
        System.out.println("Public: " + parent.publicField); // Accessible
        // System.out.println("Protected: " + parent.protectedField); // Not accessible
        // System.out.println("Default: " + parent.defaultField); // Not accessible
        // System.out.println("Private: " + parent.privateField); // Not accessible
    }
}

package at.first.app;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {};

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory Method");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return "hungarian Rhapsody";
    }
}

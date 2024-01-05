package at.first.app;

public class ClassicalMusic implements Music{

    public void doMyinit() {
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

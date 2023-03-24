package exceptions.CheckedException;

public class ClassNotFoundEx {

    public static void main(String[] args) {
        try {
            Class.forName("exceptions.UncheckedExeption.lalit");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

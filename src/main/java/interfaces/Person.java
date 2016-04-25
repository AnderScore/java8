package interfaces;

public interface Person {

    default String says() {
        return "hello";
    }
}

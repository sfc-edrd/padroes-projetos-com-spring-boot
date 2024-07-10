package lab.learning.gof.pure_java.facade;

public record Customer(
        String name,
        String postalCode,
        String city,
        String state
) {
}

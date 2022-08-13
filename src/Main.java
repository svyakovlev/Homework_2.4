public class Main {
    public static void main(String[] args) {
        try {
            Service.createUser("java_skypro", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException le) {
            System.out.println("Неверный login");
        } catch (WrongPasswordException pe) {
            System.out.println("Неверный password или confirmPassword");
        }
    }
}
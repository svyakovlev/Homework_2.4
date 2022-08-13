public class Service {
    public static boolean createUser(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (!login.matches("\\w{1,20}")) {
            throw new WrongLoginException();
        }
        if (password.length() > 20) {
            throw new WrongPasswordException();
        }
        if (!password.matches("\\w{1,20}")) {
            throw new WrongPasswordException();
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException();
        }
        return true;
    }
}

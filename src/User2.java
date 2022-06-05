public class User2 {
    //2
    private static String login;
    private static String password;

    public static void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь с логином: " + login + " и паролем: " + password + " отправил запрос");
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User2.createQuery();
    }
}

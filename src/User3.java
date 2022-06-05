public class User3 {
    //3
    private static String login;
    private static String password;
    public static class Query
    {
        public void printToLog() {
            System.out.println("Пользователь с логином: " + login + " и паролем: " + password + " отправил запрос");
        }
    }
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
    public static void main(String[] args) {
        User3.Query query = new User3.Query();
        query.printToLog();
    }
}

public class User {
    //1
    private String login;
    private String password;

    public class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином: " + login + " и паролем: " + password + " отправил запрос");
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User();
        user.createQuery();
        User.Query query1 = user.new Query();
        User.Query query2 = new User().new Query();
        query1.printToLog();
        query2.printToLog();
    }
}

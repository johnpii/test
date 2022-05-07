public class Main {
    public Main() {
    }
    //1
    public static void method(String stroka) {
        System.out.println(stroka.charAt(stroka.length() - 1));
        System.out.println(stroka.endsWith("!!!"));
        System.out.println(stroka.startsWith("I like"));
        System.out.println(stroka.contains("Java"));
        System.out.println(stroka.indexOf("Java"));
        System.out.println(stroka.replace("a", "o"));
        System.out.println(stroka.toUpperCase());
        System.out.println(stroka.toLowerCase());
        System.out.println(stroka.substring(stroka.indexOf("Java"), stroka.indexOf("Java") + 4));
    }
    //2
    public static void method2(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b));
        stringBuilder.delete(0, stringBuilder.length());
        System.out.println(stringBuilder.append(a).append(" - ").append(b).append(" = ").append(a - b));
        stringBuilder.delete(0, stringBuilder.length());
        System.out.println(stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a * b));
        String st = stringBuilder.toString();
        int c = st.indexOf("=");
        System.out.println(stringBuilder.insert(c, "равно").deleteCharAt(c + 5));
        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder = new StringBuilder(st);
        System.out.println(stringBuilder.replace(c, c + 1, "равно"));
    }
    //3
    public static void method3(String str, String oldString, String newString) {
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());

        int pos;
        while((pos = stringBuilder.indexOf(oldString)) != -1) {
            stringBuilder.replace(pos, pos + oldString.length(), newString);
        }

        System.out.println(stringBuilder);
    }
    //4
    public static void method4(String str) {
        System.out.println(str.substring((str.length() - 1) / 2, str.length() / 2 + 1));
    }
    //5
    public static void method5(String surname, int ocenka, String predmet) {
        System.out.printf("Студент %1$s получил %2$d по %3$s", surname, ocenka, predmet);
    }

    public static void main(String[] args) {
        //1
        method("I like Java!!!");
        System.out.println();
        //2
        method2(3, 56);
        System.out.println();
        //3
        method3("Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.", "object-oriented programming", "OOP");
        System.out.println();
        //4
        method4("string");
        System.out.println();
        //5
        method5("Иванов", 100, "математике");
    }
}
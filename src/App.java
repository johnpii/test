import java.util.Scanner;
public enum App {
    aunt {
        public void aunt()
        {
            System.out.println("Введите логин: ");
            System.out.println("Введите пароль: ");
        }
    }, viewKat {
        public void viewKat() {
            System.out.println("Сейчас доступны каталоги: Все для дома, Технологии, Все для авто");
        }
    }, view {
        public void viewKat() {
            System.out.println("Дотупные товары: Тарелка, вилка, ложка");
        }
    }, choice {
        public void choice() {
            System.out.println("Выбран товар");
        }
    }, buy {
        public void buy() {
            System.out.println("Вы купили товары");
        }
    };
    }

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько экземпляров класса Ноутбук
        Ноутбук ноутбук1 = new Ноутбук("Lenovo ThinkPad", "Lenovo", 1200, 2022);
        Ноутбук ноутбук2 = new Ноутбук("MacBook Pro", "Apple", 2000, 2021);
        Ноутбук ноутбук3 = new Ноутбук("Dell XPS", "Dell", 1500, 2022);

        // Выводим экземпляры класса на печать
        System.out.println(ноутбук1);
        System.out.println(ноутбук2);
        System.out.println(ноутбук3);

        // Сравниваем пару экземпляров
        System.out.println("Равны ли ноутбук1 и ноутбук2: " + ноутбук1.equals(ноутбук2));

        // Создаем множество ноутбуков
        Set<Ноутбук> ноутбуки = new HashSet<>();
        ноутбуки.add(ноутбук1);
        ноутбуки.add(ноутбук2);
        ноутбуки.add(ноутбук3);

        // Находим один экземпляр в наборе
        Ноутбук искомыйНоутбук = new Ноутбук("Lenovo ThinkPad", "Lenovo", 1200, 2022);
        if (ноутбуки.contains(искомыйНоутбук)) {
            System.out.println("Найден ноутбук: " + искомыйНоутбук);
        } else {
            System.out.println("Ноутбук не найден");
        }
    }
}

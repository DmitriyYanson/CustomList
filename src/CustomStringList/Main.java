package CustomStringList;

public class Main {
    public static void main(String[] args) {
        // Создаем объект CustomStringList
        CustomStringList customStringList = new CustomStringList(new String[]{"apple", "banana", "orange"});

        // Вызываем методы для проверки
        customStringList.add("grape");
        customStringList.addIfNotExists("banana");
        customStringList.addIfNotExists("kiwi");

        // Выводим результаты
        System.out.println("Список после добавления:");
        for (String str : customStringList.getList()) {
            System.out.println(str);
        }

        System.out.println("Самое длинное слово: " + customStringList.longestWord());
        System.out.println("Проверка наличия слова 'apple': " + customStringList.check(new String[]{"apple"}));
        System.out.println("Проверка наличия всех слов: " + customStringList.check(new String[]{"orange", "banana", "kiwi"}));
    }
}


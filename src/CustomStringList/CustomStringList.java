package CustomStringList;

public class CustomStringList {
    // 1. Приватное свойство для хранения списка строк
    private String[] list;
    public String[] getList() {
            return this.list;
    }



    // 2. Конструктор, принимающий массив строк и присваивающий его свойству list
    public CustomStringList(String[] initialArray) {
        this.list = initialArray;
    }


    // Метод check
    public boolean check(String[] stringsToCheck) {
        // Пройдитесь по всем элементам массива stringsToCheck
        for (String str : stringsToCheck) {
            // Используйте метод contains для проверки наличия строки в списке list
            // Если хотя бы одной строки нет в списке, верните false
            if (!contains(str)) {
                return false;
            }
        }

        // Если все строки находятся в списке, верните true
        return true;
    }

    // Добавьте метод contains для проверки наличия строки в списке
    public boolean contains(String targetString) {
        for (String str : this.list) {
            if (str.equals(targetString)) {
                return true;
            }
        }
        return false;
    }



    // Метод longestWord
    public String longestWord() {
        // Проверка на случай пустого списка
        if (this.list == null || this.list.length == 0) {
            return null; // или выбросить исключение, в зависимости от вашего случая
        }

        String longest = this.list[0]; // Предполагаем, что первое слово самое длинное

        // Пройдитесь по всем остальным словам в списке
        for (String word : this.list) {
            // Если текущее слово длиннее, чем текущее самое длинное, обновите его
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Верните самое длинное слово
        return longest;
    }






    // Метод add
    public void add(String newString) {
        // Проверка на случай пустого списка
        if (this.list == null) {
            // Если список пуст, создайте новый массив с одним элементом
            this.list = new String[]{newString};
        } else {
            // Создайте новый массив, увеличив его размер на 1
            String[] newList = new String[this.list.length + 1];

            // Копируйте старые элементы в новый массив
            System.arraycopy(this.list, 0, newList, 0, this.list.length);

            // Добавьте новый элемент в конец нового массива
            newList[this.list.length] = newString;

            // Присвойте новый массив свойству list
            this.list = newList;
        }
    }



    // Метод addIfNotExists
    public void addIfNotExists(String newString) {
        // Проверка на случай пустого списка
        if (this.list == null) {
            // Если список пуст, создайте новый массив с одним элементом
            this.list = new String[]{newString};
            System.out.println("Строка \"" + newString + "\" добавлена в массив.");
        } else {
            // Проверяем, есть ли строка в массиве
            if (!contains(newString)) {
                // Создайте новый массив, увеличив его размер на 1
                String[] newList = new String[this.list.length + 1];

                // Копируйте старые элементы в новый массив
                System.arraycopy(this.list, 0, newList, 0, this.list.length);

                // Добавьте новый элемент в конец нового массива
                newList[this.list.length] = newString;

                // Присвойте новый массив свойству list
                this.list = newList;

                System.out.println("Строка \"" + newString + "\" добавлена в массив.");
            } else {
                // Если строка уже существует, выведите сообщение
                System.out.println("Строка \"" + newString + "\" в массиве уже есть.");
            }
        }
    }




}

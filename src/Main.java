public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        /* Создайте подключенный к системе управления версиями Git проект,
        отредактируйте .gitignore.
        Добавьте в проект код на ваше усмотрение. Сделайте коммиты.
        Подключите удаленный репозиторий. Запушьте изменения
        на удаленный репозиторий.
        Пришлите ссылку на удаленный репозиторий в личку в слак */

        System.out.println("Первый  вариант решения кантовского шагомера");
        int step = 1;
        while (step <= 300) {
            System.out.println(pedometerForKant(step));
            step++;
        }
    }

    public static String pedometerForKant(int step) {
        return (step % 6 == 0) ? " Himmel und Erde " : ((!(step == 100)) ? step + "" +
                " " : "Sagen Sie mir, kann man in Ihrem Land durch Null teilen? ");
    }
}



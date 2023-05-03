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
        System.out.println ("Второй  вариант решения кантовского шагомера");
        int step1 = 1;
        while (step1 <=300 ) {
            if (step1 % 6 == 0) {System.out.println(" Himmel und Erde ");}
            if (step1 == 100) { System.out.println("Sagen Sie mir, kann man in Ihrem Land durch Null teilen?");
            } else { System.out.println(step1 + " ");}
            step1++;
        }
    }

    public static String pedometerForKant(int step) {
        return (step % 6 == 0) ? " Himmel und Erde " : ((!(step == 100)) ? step + "" +
                " " : "Sagen Sie mir, kann man in Ihrem Land durch Null teilen? ");
    }
}



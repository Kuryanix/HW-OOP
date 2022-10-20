public class Main {
    public static void main(String[] args) {

        // Задание 1.1 и 1.2

        Human maxim1 = new Human();
        maxim1.name = "Максим";
        maxim1.city = "Минск";
        maxim1.age = 35;
        maxim1.profession = "бренд-менеджер";

        Human anna1 = new Human();
        anna1.name = "Аня";
        anna1.city = "Москва";
        anna1.age = 29;
        anna1.profession = "методист образовательных программ";

        Human kate1 = new Human();
        kate1.name = "Катя";
        kate1.city = "Калининград";
        kate1.age = 28;
        kate1.profession = "продакт-менеджер";

        Human artem1 = new Human();
        artem1.name = "Артем";
        artem1.city = "Москва";
        artem1.age = 27;
        artem1.profession = "директор по развитию бизнеса";

        maxim1.infoWithYear();
        anna1.infoWithYear();
        kate1.infoWithYear();
        artem1.infoWithYear();

        System.out.println();
        // Задание 2.1

        Human maxim = new Human("Максим", 35, "Москва", "бренд-менеджер");
        Human anna = new Human("Аня", -29, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 27, "Москва", "директор по развитию бизнеса");

        maxim.info();
        anna.info();
        kate.info();
        artem.info();

        System.out.println();
        // Задание 1.3

        Car lada1 = new Car();
        lada1.brand = "Lada";
        lada1.country = "Россия";
        lada1.year = "2015";
        lada1.engine = "1.7 л.";
        lada1.color = "желтый";
        lada1.model = "Granta";

        Car audi1 = new Car();
        audi1.brand = "Audi";
        audi1.country = "Германия";
        audi1.year = "2020";
        audi1.engine = "3.0 л.";
        audi1.color = "черный";
        audi1.model = "A8";

        Car bmw1 = new Car();
        bmw1.brand = "BMW";
        bmw1.country = "Германия";
        bmw1.year = "2021";
        bmw1.engine = "3.0 л.";
        bmw1.color = "черный";
        bmw1.model = "Z8";

        Car kia1 = new Car();
        kia1.brand = "KIA";
        kia1.country = "Южная Корея";
        kia1.year = "2018";
        kia1.engine = "2.4 л.";
        kia1.color = "красный";
        kia1.model = "Sportage 4-го поколения";

        Car hyundai1 = new Car();
        hyundai1.brand = "Hyundai";
        hyundai1.country = "Южная Корея";
        hyundai1.year = "2016";
        hyundai1.engine = "1.6 л.";
        hyundai1.color = "оранжевый";
        hyundai1.model = "Avante";

        lada1.carInfo();
        audi1.carInfo();
        bmw1.carInfo();
        kia1.carInfo();
        hyundai1.carInfo();

        System.out.println();
        // Задание 2.2

        Car lada = new Car("Lada", "Granta", "1.7 л.", "желтый", "2015", "Россия");
        Car audi = new Car("Audi", "A8", "3.0 л.", "черный", "2020", "Германия");
        Car bmw = new Car("BMW", "Z8", "3.0 л.", "черный", "2021", "Германия");
        Car kia = new Car("KIA", "Sportage 4-го поколения", "2.4 л.", "красный", "2018", "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", "1.6 л.", "оранжевый", "2016", "Южная Корея");

        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();

    }
}
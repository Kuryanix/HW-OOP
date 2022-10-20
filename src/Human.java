public class Human {

    // Задание 1.1; 1.2; 2.1 и 3.1

    public String name;
    public int birthDate;
    public String city;
    public String profession;

    public Human() {
        checkName(name);
        checkBirthDate(birthDate);
        checkCity(city);
        checkProfession(profession);
    }
    public Human(String name, int birthDate, String city, String profession) {
        checkName(name);
        checkBirthDate(birthDate);
        checkCity(city);
        checkProfession(profession);
    }

    public void checkName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }

    public void checkBirthDate(int birthDate) {
        if (birthDate < 0) {
            this.birthDate = Math.abs(birthDate);
        } else {
            this.birthDate = birthDate;
        }
    }

    public void checkCity(String city) {
        if (city == null || city.isEmpty()) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }

    public void checkProfession(String profession) {
        if (profession == null || profession.isEmpty()) {
            this.profession = "Информация не указана";
        } else {
            this.profession = profession;
        }
    }

    public void info() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + birthDate + " году. Я работаю на должности " + profession + ". Будем Знакомы!");
    }
}

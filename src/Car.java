public class Car {

    // Задание 1.3; 2.2 и 3.2

    public String brand;
    public String model;
    public String engine;
    public String color;
    public String year;
    public String country;

    public Car() {
        checkBrand(brand);
        checkModel(model);
        checkEngine(engine);
        checkColor(color);
        checkYear(year);
        checkCountry(country);
    }
    public Car(String brand, String model, String engine, String color, String year, String country) {
        checkBrand(brand);
        checkModel(model);
        checkEngine(engine);
        checkColor(color);
        checkYear(year);
        checkCountry(country);
    }

    public void checkBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public void checkModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public void checkCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public void checkEngine(String engine) {
        if (engine == null || engine.isEmpty()) {
            this.engine = "1.5 л.";
        } else {
            this.engine = engine;
        }
    }

    public void checkColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void checkYear(String year) {
        if (year == null || year.isEmpty()) {
            this.year = "2000";
        } else {
            this.year = year;
        }
    }

    public void carInfo() {
        System.out.println("Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engine + ", цвет: " + color + ", год производства: " + year + ", страна производитель: " + country);
    }
}

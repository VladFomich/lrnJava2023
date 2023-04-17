package Seminar_6;

public class Laptop {
    private String brand;
    private String model;
    private String processor;
    private int ramSize;
    private int storageSize;
    private String color;
    private double price;

    public Laptop(String brand, String model, String processor, int ramSize, int storageSize,
                  String color, double price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Ноутбук ||Бренд = '%s , Модель = '%s , Процессор = '%s', Оперативная память = %d, " +
                "Жесткий диск = %d, Основной цвет = '%s', Цена = %s||")
                .formatted(brand, model, processor, ramSize, storageSize, color, price);
    }
}

import java.util.UUID;

public class Item  {
    String id;
    String itemName;
    int price;
    String brand;
    int storage;
    double screenSize;

    public Item() {}

    // Laptop's constructor method.
    public Item(String id, String itemName, int price, String brand, int storage, double screenSize, int camera, int battery) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.battery = battery;
    }

// id = getBrand().charAt(0) + getBrand().charAt(1) + HUA
    int camera;
    int battery;
    int ram;

    // Cellphone's constructor method.
    public Item(String id, String itemName, int price, String brand, int storage, int screenSize, int ram) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }
    public static String uniqueID(){

        UUID uuid = UUID.randomUUID();
        String uniqueId = uuid.toString();
        return uniqueId;
    }
    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public int getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }

    public String  toString(){
        return "|| id: " + id + " || name: " + itemName + " || Price: " + price + "TL || Storage : " + storage + " || Screen: " + screenSize + " || Camera: " + camera + " || Battery: " + battery;
    }
}

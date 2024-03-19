
import java.util.*;

public class SmartPhoneManager extends SmartPhone {
    private static TreeSet<SmartPhone> smartPhones = new TreeSet<>(new Comparator<SmartPhone>() {
        @Override
        public int compare(SmartPhone o1, SmartPhone o2) {
            return o2.getId().compareTo(o1.getId());
        }
    });
    private static Scanner input = new Scanner(System.in);

    public SmartPhoneManager(String id, String itemName, int price, String brand, int storage, double screenSize, int camera, int battery) {
        super(id, itemName, price, brand, storage, screenSize, camera, battery);
    }

    public SmartPhoneManager() {
    }

    public void smartPhoneLister() {

        smartPhones.add(new SmartPhone(uniqueID(), "Samsung Galaxy A51", 3199, "Samsung", 128, 6.5, 32, 4000));
        smartPhones.add(new SmartPhone(uniqueID(), "IPhone 11", 10000, "Apple", 64, 6.1, 5, 3200));
        smartPhones.add(new SmartPhone(uniqueID(), "Redmi Note 10 Pro", 2250, "Xiaomi", 128, 6.5, 64, 4100));
        smartPhones.add(new SmartPhone(uniqueID(), "Nova 11i ", 11250, "Huawei", 128, 6.5, 64, 4000));
        smartPhones.add(new SmartPhone(uniqueID(), "Nova Y70", 7800, "Huawei", 256, 6.2, 64, 3600));

        for (SmartPhone i : smartPhones) {
            System.out.println(i);
        }
    }

    public String toString() {
        return "|| id: " + id + " || name: " + itemName + " || Price: " + price + "TL || Storage : " + storage + " || Screen: " + screenSize + " || Camera: " + camera + " || Battery: " + battery;
    }

    public void smartPhoneAdd() {
        System.out.print("Name: ");
        setItemName(input.nextLine());
        System.out.print("Price: ");
        setPrice(input.nextInt());
        System.out.print("Brand: ");
        input.nextLine();
        setBrand(input.nextLine());
        System.out.print("Storage: ");
        setStorage(input.nextInt());
        System.out.print("ScreenSize: ");
        setScreenSize(input.nextDouble());
        System.out.print("Camera: ");
        setCamera(input.nextInt());
        System.out.print("Battery: ");
        setBattery(input.nextInt());
        smartPhones.add(new SmartPhone(uniqueID(), getItemName(), getPrice(), getBrand(), getStorage(), getScreenSize(), getCamera(), getBattery()));
        System.out.println("Your item has been added: ");
    }

    public void smartPhoneDelete() {
        System.out.print("Enter the item name to delete: ");
        String deleteToBe = input.nextLine();

        Iterator<SmartPhone> iterator = smartPhones.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            SmartPhone phone = iterator.next();
            if (phone.getItemName().equalsIgnoreCase(deleteToBe)) {
                iterator.remove();
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println(deleteToBe + " removed from the list.");
        } else {
            System.out.println(deleteToBe + " not found in the list.");
        }
    }
}

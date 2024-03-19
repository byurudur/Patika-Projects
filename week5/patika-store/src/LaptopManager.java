import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class LaptopManager extends Laptop {
    public LaptopManager(){}
    private static TreeSet<Laptop> laptops = new TreeSet<>(new Comparator<Laptop>() {
        @Override
        public int compare(Laptop o1, Laptop o2) {
            return o2.getId().compareTo(o1.getId());
        }
    });
    private static Scanner input = new Scanner(System.in);

    public LaptopManager(String id, String itemName, int price, String brand, int storage, int screenSize, int ram) {
        super(id, itemName, price, brand, storage, screenSize, ram);
    }


    public void laptopLister() {

        laptops.add(new Laptop(uniqueID(), "IdeaPad Slim 3", 14899, "Lenovo", 512, 15, 16));
        laptops.add(new Laptop(uniqueID(), "VivoBook", 19999, "Asus", 256, 13, 8));
        laptops.add(new Laptop(uniqueID(), "Aspire 5", 14999, "Acer", 1, 16, 16));
        laptops.add(new Laptop(uniqueID(), "MacBook Pro", 95000, "Apple", 2, 16, 32));
        laptops.add(new Laptop(uniqueID(), "Victus", 35000, "HP", 256, 14, 16));

        for (Laptop i : laptops) {
            System.out.println(i);
        }
    }

    public String laptopToString() {
        return "|| id: " + id + " || name: " + itemName + " || Price: " + price + "TL || Storage : " + storage + " || Screen: " + screenSize + " || RAM: " + ram;
    }

    public void laptopAdd() {
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
        setScreenSize(input.nextInt());
        System.out.println("RAM: ");
        setRam(input.nextInt());
        laptops.add(new Laptop(uniqueID(), getItemName(), getPrice(), getBrand(), getStorage(), (int) getScreenSize(), getRam()));
        System.out.println("Your item has been added: ");
    }

    public void laptopDelete() {
        System.out.print("Enter the item name to delete: ");
        String deleteToBe = input.nextLine();

        Iterator<Laptop> iterator = laptops.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Laptop laptop = iterator.next();
            if (laptop.getItemName().equalsIgnoreCase(deleteToBe)) {
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

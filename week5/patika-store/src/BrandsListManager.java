import java.util.ArrayList;

public class BrandsListManager {
    public void brandsList(){
        ArrayList<String> brandsArray = new ArrayList<>();
        brandsArray.add("-Apple");
        brandsArray.add("-Asus");
        brandsArray.add("-Casper");
        brandsArray.add("-HP");
        brandsArray.add("-Huawei");
        brandsArray.add("-Lenovo");
        brandsArray.add("-Monster");
        brandsArray.add("-Samsung");
        brandsArray.add("-Xiaomi");

        System.out.println("The brands we have: ");
        for (String brand : brandsArray){
            System.out.println(brand);
        }
    }
}

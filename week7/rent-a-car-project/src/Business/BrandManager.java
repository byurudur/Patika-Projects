package Business;

import Core.Helper;
import DAL.BrandDAL;
import DAL.UserDAL;
import Entities.Brand;

import java.util.ArrayList;

public class BrandManager {
    private final BrandDAL brandDao;

    public BrandManager() {
        this.brandDao = new BrandDAL();
    }
    public ArrayList<Object[]> getForTable(int size){
        ArrayList<Object[]> brandRowList = new ArrayList<>();
        for (Brand brand : this.findAll()){
            Object[] rowObject = new Object[size];
            int i = 0;
            rowObject[i++] = brand.getBrand_id();
            rowObject[i++] = brand.getBrand_name();
            brandRowList.add(rowObject);
        }
        return brandRowList;
    }
    public ArrayList<Brand> findAll(){
        return this.brandDao.findAll();
    }
    public boolean save(Brand brand){
        if (brand.getBrand_id() != 0){
            Helper.msg("ERROR");
        }
        return this.brandDao.save(brand);
    }
    public Brand getById(int id){
        return this.brandDao.getById(id);
    }
    public boolean update(Brand brand){
        if (this.getById(brand.getBrand_id()) == null){
            Helper.msg("Cannot save.");
        }
        return this.brandDao.update(brand);
    }
    public boolean delete(int id){
        if (this.getById(id) == null){
            Helper.msg("ID Cannot found.");
            return false;
        }
        return this.brandDao.delete(id);
    }
}

package com.myapp.app49;

import android.app.Application;

import com.myapp.mylibrary.DB.DatabaseLeHoi;
import com.myapp.mylibrary.DB.DatabaseNgayLe;
import com.myapp.mylibrary.DB.DatabaseNgonTinh;
import com.myapp.mylibrary.DB.LeHoi;
import com.myapp.mylibrary.DB.NgayLe;
import com.myapp.mylibrary.boitinhyeu.ModelDanhNgon;

import java.util.List;

public class SubApp extends Application {

    public  String DB_PATH= "/data/data/com.myapp.app49/databases/";
    public  String DATABASE_BOIPHUONGDONG = "datatonghop.db";

    public DatabaseNgonTinh databaseNgonTinh;
    public DatabaseLeHoi databaseLeHoi;
    public DatabaseNgayLe databaseNgayLe;

    public SubApp(){
        //databaseNgonTinh =
    }

    public void getDatabaseNgonTinh() {
        databaseNgonTinh = DatabaseNgonTinh.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
    }

    public void initDb() {
        databaseNgonTinh = DatabaseNgonTinh.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
        databaseLeHoi = DatabaseLeHoi.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
        databaseNgayLe = DatabaseNgayLe.getInstance(this,DB_PATH,DATABASE_BOIPHUONGDONG);
    }

    public List<ModelDanhNgon> getDanhNgon() {
        return databaseNgonTinh.getDanhNgon();
    }

    public List<LeHoi> getLeHoi() {
        return databaseLeHoi.getLeHoi();
    }

    public List<NgayLe> getNgayLe(){
        return databaseNgayLe.getNgayLe();
    }


}

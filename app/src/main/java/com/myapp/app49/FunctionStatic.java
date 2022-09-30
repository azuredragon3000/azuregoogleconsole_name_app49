package com.myapp.app49;

import android.content.Context;

import com.myapp.mylibrary.DB.DatabaseNgonTinh;
import com.myapp.mylibrary.DB.LeHoi;
import com.myapp.mylibrary.DB.NgayLe;
import com.myapp.mylibrary.boitinhyeu.ModelDanhNgon;

import java.util.List;

public class FunctionStatic {
    public static List<ModelDanhNgon> getListDanhNgon(Context context) {
        return ((SubApp)context.getApplicationContext()).getDanhNgon();
    }

    public static List<LeHoi> getListLeHoi(Context context) {
        return ((SubApp)context.getApplicationContext()).getLeHoi();
    }

    public static List<NgayLe> getListNgayLe(Context context) {
        return ((SubApp)context.getApplicationContext()).getNgayLe();
    }
}

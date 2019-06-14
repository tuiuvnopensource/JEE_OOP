package jp.ivs.model;

import java.util.*;

public class DBNhanVien {
    List<NhanVien> dsNhanVien;

    public List<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    public DBNhanVien()
    {
        initData();
    }
    public void initData()
    {
        this.dsNhanVien = new ArrayList<NhanVien>();
        for (int i=0; i<10; i++)
        {
            NhanVien nv = new NhanVien();
            nv.setMaNV("" + (1+i));
            nv.setTenNV("Lê Hoài Anh");
            nv.setGioiTinh(true);
            dsNhanVien.add(nv);
        }
    }
}

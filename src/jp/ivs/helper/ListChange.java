package jp.ivs.helper;

import jp.ivs.model.NhanVien;

import java.util.ArrayList;

public class ListChange
{
    public static void addNhanVien(ArrayList<NhanVien> list, NhanVien nv)
    {
        int i=0;
        for (NhanVien element : list)
        {
            if (element.getMaNV().equals(nv.getMaNV()))
            {
                list.remove(i);
                break;
            }
            i++;
        }
        list.add(nv);
    }
    //region chức năng Thêm
    public static void editById(ArrayList<NhanVien> list, NhanVien nv)
    {
        int leng = list.size();
        for (int i=0; i<leng; i++)
            if (list.get(i).getMaNV().equals(nv.getMaNV())) //ID của nvien thứ i trùng với ID của nvien thêm vào
            {
                editAtIndex(list, nv, i);
                break;
            }
        //
    }
    public static void editAtIndex(ArrayList<NhanVien> list, NhanVien nv, int index)
    {
        list.remove(index);
        list.add(index, nv);
    } //endregion
    public static void deleteByID(ArrayList<NhanVien> list, String id)
    {
        int i=0;
        for (NhanVien element : list)
        {
            if (element.getMaNV().equals(id))
            {
                list.remove(i);
                break;
            }
            i++;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyCD {

    private final ArrayList<CD> danhSachCD;

    public QuanLyCD() {
        danhSachCD = new ArrayList<>();
        danhSachCD.add(new CD("CD01", "Noi buon gac tro", "Quang Linh", 195000, 2018));
        danhSachCD.add(new CD("CD02", "Bai tinh ca dem", "Duc Tuan", 185000, 2021));
        danhSachCD.add(new CD("CD03", "Cau ho chieu que", "Nhieu ca si", 172000, 2022));
        danhSachCD.add(new CD("CD04", "Tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        danhSachCD.add(new CD("CD05", "Thanh pho mua bay", "Dan Nguyen", 182000, 2019));
    }

    public void xuatDanhSachCD() {
        double tongTriGia = 0;
        for (CD cd : danhSachCD) {
            System.out.println(cd);
            tongTriGia += cd.getGiaban();
        }
        System.out.println("Tong tri gia CD: " + tongTriGia);
    }

    public void cdTruocNam2020() {
        for (CD cd : danhSachCD) {
            if (cd.getNamphathanh() < 2020) {
                System.out.println(cd);
                System.out.println("---------------------------");
            }
        }
    }

    public void cdTenChuaTinh() {
        for (CD cd : danhSachCD) {
            if (cd.getTenCD().toLowerCase().contains("tinh")) {
                System.out.println(cd);
                System.out.println("---------------------------");
            }
        }
    }

    public void sapXepTheoGia() {
        Collections.sort(danhSachCD, new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD cd2) {
                return Double.compare(cd2.getGiaban(), cd1.getGiaban());
            }
        });
    }

    public boolean xoaCD(String maSoXoa) {
        return danhSachCD.removeIf(cd -> cd.getMaso().equals(maSoXoa));
    }

    public boolean suaGiaCD(String maSoSua, double giaMoi) {
        for (CD cd : danhSachCD) {
            if (cd.getMaso().equals(maSoSua)) {
                cd.setGiaban(giaMoi);
                return true;
            }
        }
        return false;
    }

    public double tinhTongTriGia() {
        return danhSachCD.stream().mapToDouble(CD::getGiaban).sum();
    }

}

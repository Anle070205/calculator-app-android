/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class CanBo {
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    
    public CanBo(){
       
    }
    public CanBo(String hoTen,String gioiTinh,String ngaySinh, String diaChi){
        this.hoTen = hoTen;
        this.gioiTinh= gioiTinh;
        this.ngaySinh= ngaySinh;
        this.diaChi= diaChi;
    }
    
    public void nhapThongTin(Scanner sc){
        System.out.println("\tnhap ten:");
        hoTen=sc.nextLine();
        System.out.println("\tnhap gioi tinh (nam/nu):");
        gioiTinh=sc.nextLine();
        System.out.println("\tnhap ngay sinh :");
        ngaySinh=sc.nextLine();
        System.out.println("\tnhap dia chi:");
        diaChi=sc.nextLine();
    }
    
    public void hienThi(){
        System.out.println("\tho ten :"+hoTen);
        System.out.println("\tgioi tinh :"+gioiTinh);
        System.out.println("\tngay sinh :"+ngaySinh);
        System.out.println("\tdia chi :"+diaChi);
    }
    
    public String getHoTen(){
        return this.hoTen;
    }
}

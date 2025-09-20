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
public class NhanVien extends CanBo{
    private String congViec;
    
    public NhanVien(){
        
    }
    
    public NhanVien(String hoTen,String gioiTinh,String ngaySinh, String diaChi,String congViec){
        super(hoTen,gioiTinh,ngaySinh,diaChi);
        this.congViec=congViec;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\tnhap cong viec : ");
        congViec=sc.nextLine();
    }
    
    public void hienThi(){
        super.hienThi();
        System.out.println("\tcong viec : "+congViec);
    }
}

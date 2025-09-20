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
public class CongNhan extends CanBo{
    private String bac;
    
    public CongNhan(){
        
    }
    public CongNhan(String hoTen,String gioiTinh,String ngaySinh, String diaChi,String bac){
        super(hoTen,gioiTinh,ngaySinh,diaChi);
        this.bac=bac;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        bac=sc.nextLine();
    }
    
    public void hienThi(){
        super.hienThi();
        System.out.println("\tbac :"+bac);
    }
}

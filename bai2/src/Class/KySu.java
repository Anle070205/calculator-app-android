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
public class KySu extends CanBo{
    private String nganhDaoTao;
    
    public KySu(){
        
    }
    
    public KySu(String hoTen,String gioiTinh,String ngaySinh, String diaChi,String nganhDaoTao){
        super(hoTen,gioiTinh,ngaySinh,diaChi);
        this.nganhDaoTao=nganhDaoTao;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.println("\tnhap nganh dao tao : ");
        nganhDaoTao=sc.nextLine();
    }
    
    public void hienThi(){
        super.hienThi();
        System.out.println("\tnganh dao tao : "+nganhDaoTao);
    }
}

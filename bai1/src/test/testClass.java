/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import Class.PhanSo;
import java.util.Scanner;

/**
 *
 * @author Hi
 */
public class testClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        PhanSo ps1201 = new PhanSo();
        PhanSo ps2201 = new PhanSo();
=======
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
        int choice;
        do{
            
            System.out.println("\n========= MENU =========");
            System.out.println("1. Cong hai phan so");
            System.out.println("2. Tru hai phan so");
            System.out.println("3. Nhan hai phan so");
            System.out.println("4. Chia hai phan so");
            System.out.println("5. Rut gon 2 phan so");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            choice = sc.nextInt();
        switch(choice){
            case 1 :
                PhanSo psTong=new PhanSo();
                System.out.println("\tnhap phan so thu nhat :");
<<<<<<< HEAD
                ps1201.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2201.NhapPS(sc);
                psTong = ps1201.CongPS(ps2201);
=======
                ps1.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2.NhapPS(sc);
                psTong = ps1.CongPS(ps2);
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
                psTong.ToiGian();
                psTong.HienThi();
                break;
            
            case 2 :
                PhanSo psHieu=new PhanSo();
                System.out.println("\tnhap phan so thu nhat :");
<<<<<<< HEAD
                ps1201.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2201.NhapPS(sc);
                psHieu = ps1201.TruPS(ps2201);
=======
                ps1.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2.NhapPS(sc);
                psHieu = ps1.TruPS(ps2);
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
                psHieu.ToiGian();
                psHieu.HienThi();
                break;
            
            case 3 :
                PhanSo psTich=new PhanSo();
                System.out.println("\tnhap phan so thu nhat :");
<<<<<<< HEAD
                ps1201.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2201.NhapPS(sc);
                psTich = ps1201.NhanPS(ps2201);
=======
                ps1.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2.NhapPS(sc);
                psTich = ps1.NhanPS(ps2);
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
                psTich.ToiGian();
                psTich.HienThi();
                break;
            
            case 4 :
                PhanSo psThuong=new PhanSo();
                System.out.println("\tnhap phan so thu nhat :");
<<<<<<< HEAD
                ps1201.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2201.NhapPS(sc);
                psThuong = ps1201.ChiaPS(ps2201);
=======
                ps1.NhapPS(sc);
                System.out.println("\tnhap phan so thu hai :");
                ps2.NhapPS(sc);
                psThuong = ps1.ChiaPS(ps2);
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
                psThuong.ToiGian();
                psThuong.HienThi();
                break;
            
            case 5 :
                System.out.println("\tnhap phan so :");
<<<<<<< HEAD
                ps1201.NhapPS(sc);
                
                ps1201.ToiGian();
                ps1201.HienThi();
=======
                ps1.NhapPS(sc);
                
                ps1.ToiGian();
                ps1.HienThi();
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
                break;
            }
        
        }while(choice!=0);
        
        
        
        sc.close();
    }
}

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
public class PhanSo {
    private int tuSo;
    private int mauSo;
       
    public PhanSo(){
        tuSo = 0;
        mauSo = 1;
    }
    public PhanSo(int tuSo,int mauSo ){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void NhapPS(Scanner sc){
        int a;
        int b;
        do{
            System.out.println("\tnhap tu so:");
            a=sc.nextInt();
            System.out.println("\tnhap mau so");
            b=sc.nextInt();
            if(b==0){
                System.out.println("mau so khong duoc bang 0. Hay nhap lai");
            }else{
                tuSo = a;
                mauSo = b;
            }
        }while(b==0);
    }
    public void HienThi(){
        if(tuSo*mauSo<0){
            System.out.println("\tket qua :-"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
        }else{
            System.out.println("\tket qua :"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
        }
    }
    
    public PhanSo CongPS(PhanSo ps2){
        int a=tuSo*ps2.mauSo+mauSo*ps2.tuSo;
        int b=mauSo*ps2.mauSo;
        return new PhanSo(a,b);
    }
    public PhanSo TruPS(PhanSo ps2){
        int a=tuSo*ps2.mauSo-mauSo*ps2.tuSo;
        int b=mauSo*ps2.mauSo;
        return new PhanSo(a,b);
    }
    public PhanSo NhanPS(PhanSo ps2){
        int a=tuSo*ps2.tuSo;
        int b=mauSo*ps2.mauSo;
        return new PhanSo(a,b);
    }
    public PhanSo ChiaPS(PhanSo ps2){
        int a=tuSo*ps2.mauSo;
        int b=mauSo*ps2.tuSo;
        return new PhanSo(a,b);
    }
    public int timUSCLN(int a,int b){
        int r=a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    public boolean kiemTraToiGian(){
        if(timUSCLN(tuSo, mauSo)==1){
            return true;
        }
        return false;
    }
    public void ToiGian(){
        int temp=timUSCLN(tuSo, mauSo);
        tuSo =tuSo / temp;
        mauSo = mauSo / temp;
    }
}

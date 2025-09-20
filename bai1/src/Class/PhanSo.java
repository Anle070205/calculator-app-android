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
<<<<<<< HEAD
    private int tuSo201;
    private int mauSo201;
       
    public PhanSo(){
        tuSo201 = 0;
        mauSo201 = 1;
    }
    public PhanSo(int tuSo201,int mauSo201 ){
        this.tuSo201 = tuSo201;
        this.mauSo201 = mauSo201;
    }
    public void NhapPS(Scanner sc){
        int a201;
        int b201;
        do{
            System.out.println("\tnhap tu so:");
            a201=sc.nextInt();
            System.out.println("\tnhap mau so");
            b201=sc.nextInt();
            if(b201==0){
                System.out.println("mau so khong duoc bang 0. Hay nhap lai");
            }else{
                tuSo201 = a201;
                mauSo201 = b201;
            }
        }while(b201==0);
    }
    public void HienThi(){
        if(tuSo201*mauSo201<0){
            System.out.println("\tket qua :-"+Math.abs(tuSo201)+"/"+Math.abs(mauSo201));
        }else{
            System.out.println("\tket qua :"+Math.abs(tuSo201)+"/"+Math.abs(mauSo201));
=======
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
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
        }
    }
    
    public PhanSo CongPS(PhanSo ps2){
<<<<<<< HEAD
        int a201=tuSo201*ps2.mauSo201+mauSo201*ps2.tuSo201;
        int b201=mauSo201*ps2.mauSo201;
        return new PhanSo(a201,b201);
    }
    public PhanSo TruPS(PhanSo ps2){
        int a201=tuSo201*ps2.mauSo201-mauSo201*ps2.tuSo201;
        int b201=mauSo201*ps2.mauSo201;
        return new PhanSo(a201,b201);
    }
    public PhanSo NhanPS(PhanSo ps2){
        int a201=tuSo201*ps2.tuSo201;
        int b201=mauSo201*ps2.mauSo201;
        return new PhanSo(a201,b201);
    }
    public PhanSo ChiaPS(PhanSo ps2){
        int a201=tuSo201*ps2.mauSo201;
        int b201=mauSo201*ps2.tuSo201;
        return new PhanSo(a201,b201);
=======
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
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
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
<<<<<<< HEAD
        if(timUSCLN(tuSo201, mauSo201)==1){
=======
        if(timUSCLN(tuSo, mauSo)==1){
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
            return true;
        }
        return false;
    }
    public void ToiGian(){
<<<<<<< HEAD
        int temp=timUSCLN(tuSo201, mauSo201);
        tuSo201 =tuSo201 / temp;
        mauSo201 = mauSo201 / temp;
=======
        int temp=timUSCLN(tuSo, mauSo);
        tuSo =tuSo / temp;
        mauSo = mauSo / temp;
>>>>>>> 4134c1ee374d0ec9d1693159f1f00da58d0d212a
    }
}

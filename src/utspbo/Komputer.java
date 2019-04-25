/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author ASUS
 */
public class Komputer {
    private CPU cpu;
    public Komputer (CPU cpu){
        this.cpu=cpu;
    }
    public void memasang (CPU cpu){
        this.cpu=cpu;
        System.out.println("CPU :"+this.cpu.getCPUData()+" GHz"+ " dipasang");
    }
     public void mencabut (CPU cpu){
        this.cpu=cpu;
        System.out.println("CPU :"+this.cpu.getCPUData()+" GHz"+ " dicabut");
    }
     public void cetakInfo (){
        System.out.println("Spesifikasi :"+this.cpu.getCPUData()+" GHz");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;
import java.util.Scanner;
/**
 *
 * @author Naufal
 */
public class Array2D {
    public static void main(String[] args){
        int [] [] nums= new int[3] [2];
        isiMatrix(nums);
        printMatrix(nums);
    }
    
    static void isiMatrix(int m[][]){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<m.length;i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.println("Masukkan nilai pada baris"+ i+ ", kolom"+ j);
                m[i][j] = in.nextInt();
            }
        }
    }
    
    static void printMatrix(int m[][] ){
        System.out.println("======================");
        for(int i = 0; i < m[i].length; i++){
            for(int j = 0; j < m[i].length; i++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

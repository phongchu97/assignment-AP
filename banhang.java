/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign4;

/**
 *
 * @author Phuc
 */
public class banHang {
    public static void main(String[] args) {
        bill hoaDon1 = new bill();
        product sp1 = new product(5);
        product sp2 = new product(2,30);
        product sp3 = new product(0,50);

        hoaDon1.addProduct(sp1);
        hoaDon1.addProduct(sp2);
        hoaDon1.addProduct(sp3);

        hoaDon1.printBill();


    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign4;
import java.util.ArrayList;
/**
 *
 * @author Phuc
 */
public class bill {
    String id;
    int totalMoney;
    ArrayList<product> danhSachSP = new ArrayList<>();
    bill(){
        this.id = (int)(Math.random()*9) +"00" + (int)(Math.random()*999);

    }
    void addProduct(product SP){
        if (SP.qty > 0 ){
            danhSachSP.add(SP);
            if (SP.promotion != 0){
                this.totalMoney += (SP.price * (100-SP.promotion)/100);
            }
            else{this.totalMoney+=SP.price;}
        }
        else {
            System.out.println("sản phẩm đã hết hàng !");
        }
    }
    void printBill(){
        for(product bill:this.danhSachSP){
            System.out.println(bill.name+ " ,id: "+bill.id);
            System.out.println("giá : "+ bill.price + "được giảm giá" + bill.promotion + "%");
        }
        System.out.println("tổng tiền : " + this.totalMoney);
    }
}
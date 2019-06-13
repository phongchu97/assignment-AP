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
public class product {
    String id;
    String name;
    int price;
    int qty;
    int promotion;
    int getQty(){
        return this.qty;
    }
    product(int Qty){
        if(Qty == 0){
            System.out.println("sản phẩm đã hết hàng !");
        }
        else{
            this.qty= Qty;
            this.price = (int)(Math.random()*999999+10000);
            this.id = (int)(Math.random()*9) +"00" + (int)(Math.random()*999);
            this.name = "ProductNo" + (int)(Math.random()*9)+(int)(Math.random()*9)+(int)(Math.random()*9) ;
            System.out.println("bạn mới tạo: " + this.name+ "        ,id: "+this.id);
            System.out.println("số lượng: " +this.qty +"       ,giá mặc định là: "+this.price);
        }


    }
    product(int Qty ,int Promotion){
        if(Qty == 0){
            System.out.println("sản phẩm đã hết hàng !");
        }
        else{
            this.qty= Qty;
            this.promotion = Promotion;
            this.price = (int)(Math.random()*999999+10000);
            this.id = (int)(Math.random()*9) +"00" + (int)(Math.random()*999);
            this.name = "ProductNo" + (int)(Math.random()*9)+(int)(Math.random()*9)+(int)(Math.random()*9) ;
            System.out.println("bạn mới tạo: " + this.name+ "      ,id: "+this.id);
            System.out.println("số lượng: " +this.qty +"       ,giá mặc định là: "+this.price);
            System.out.println("được giảm giá: " + this.promotion +"%");
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }
}
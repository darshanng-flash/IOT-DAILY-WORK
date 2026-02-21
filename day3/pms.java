//payment management system by using java
package day3;
class User{
    String name;
    void showUser(){
        System.out.println("User Name:"+name);
    }
}
class Customer extends User{
    void makePayment(double amount){
        System.out.println("Customer Paids:"+amount);
    }
}
class PremiumCustomer extends Customer{
    @Override
    void makePayment(double amount){
        double discount=amount*10/100;
        double finalAmount=amount-discount;
        System.out.println("Premium Customer Payment");
        System.out.println("Original Amount: "+amount);
        System.out.println("Discount 10%: "+discount);
        System.out.println("FInal Amount Paid: "+finalAmount);
    }
}
class DeliveryPartner extends User{
    void receiveIncentive(double incentive){
        System.out.println("Delivery Partner receive: "+incentive);
    }
}

public class pms {
    public static void main(String[] args) {
        System.out.println("===Normal User===");
        Customer c1=new Customer();
        c1.name="Ram";
        c1.showUser();
        c1.makePayment(1000);
        System.out.println("===Premium User===");
        Customer c2=new PremiumCustomer();
        c2.name="Kumar";
        c2.showUser();
        c2.makePayment(1000);
        System.out.println("====Delivery partner====");
        DeliveryPartner dl=new DeliveryPartner();
        dl.name="Raushan2";
        dl.showUser();
        dl.receiveIncentive(100);
    }

}

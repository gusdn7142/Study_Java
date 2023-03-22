package vendingMachine;

public class VendingMachine {

    //field
    //생성자
    //method
    public String pushProductButton(int menuId){
        System.out.println(menuId + "을 전달받았습니다. ");
        return "Cola";
    }

    public static void printVersion(){
        System.out.println("v1.0");
    }

}

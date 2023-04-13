package Jeneric;


public class ObjectBox {

    private Object object;   //Object 타입 사용

    public void set(Object object){
        this.object = object;
    }

    public Object get(){
        return this.object;
    }

}

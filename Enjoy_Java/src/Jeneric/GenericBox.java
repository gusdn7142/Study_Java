package Jeneric;

public class GenericBox<T> {
    private T t;   //Generic 타입 사용

    public void set(T obj){
        this.t = obj;
    }

    public T get(){
        return this.t;
    }
}

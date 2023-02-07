package java_test;

public class Study {

    private StudyStatus status = StudyStatus.DRAFT;
    private int limit;
    private String name;

    public Study(int limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    public Study(int limit) {   //throws IllegalAccessException{
//        if(limit<0){
//            throw new IllegalAccessException("limit은 0보다 커야 한다.");
//        }
        this.limit = limit;
    }


    public String getName() {
        return name;
    }

    public StudyStatus getStatus(){
        return this.status;
    }

    public int getLimit(){
        return limit;
    }


    @Override
    public String toString() {
        return "Study{" +
                "status=" + status +
                ", limit=" + limit +
                ", name='" + name + '\'' +
                '}';
    }

}

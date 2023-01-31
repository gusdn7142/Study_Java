package java_test;

public class Study {

    private StudyStatus status = StudyStatus.DRAFT;
    private int limit;

    public Study(int limit) {   //throws IllegalAccessException{
//        if(limit<0){
//            throw new IllegalAccessException("limit은 0보다 커야 한다.");
//        }
        this.limit = limit;
    }

    public StudyStatus getStatus(){
        return this.status;
    }

    public int getLimit(){
        return limit;
    }


}

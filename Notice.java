public class Notice extends UserClass {
    private Integer importance;

    public void setImportance(Integer importance){
        this.importance = importance;
    }

    public Integer getImportance(){
        return importance;
    }


@Override
    public void printInfo(){
        System.out.println("제목: " + this.title + " 내용: " + this.content + " 작성자: " + this.user + " 작성일: " + this.date + " 조회수: " + this.importance);
    }
}

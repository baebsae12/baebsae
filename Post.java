public class Post extends UserClass {
    private Integer viewCount;

    public void setViewCount(Integer viewCount){
        this.viewCount = viewCount;
    }

    public Integer getViewCount(){
        return viewCount;
    }

@Override
public void printInfo(){
    System.out.println("제목: " + this.title + "내용: " + this.content + " 작성자: " + this.user + " 작성일: " + this.date + " 조회수: " + this.viewCount);
}
    
    
}


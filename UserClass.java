public abstract class UserClass { 
   protected String user;
   protected String date;
   protected String title;
   protected String content;


    
   
   public String getUser(){
      return user;
   }
   public void setUser(String user){
      this.user = user;
   };
   
   public String getDate(){
      return date;
   }
   public void setDate(String date){
      this.date = date;
   };

   public String getTitle(){
      return title;
   }
   public void setTitle(String title){
      this.title = title;
   };

   public String getContent(){
      return content;
   }
   public void setContent(String content){
      this.content = content;
   };

   public abstract void printInfo();
}


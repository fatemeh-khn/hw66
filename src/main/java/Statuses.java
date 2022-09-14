public enum Statuses {
    WIN("1"),
    LOST("-1"),
    EQUAL("0");

   public  final  String lable;

   private Statuses(String lable){
       this.lable=lable;
   }
}

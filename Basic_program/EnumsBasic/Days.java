package EnumsBasic;

public enum Days {

    
    MONDAY , TUESDAY ,WEDNESDAY , THURSDAY , FRIDAY ,SUNDAY;

//    private Days(String lower){
//     this.lower = lower;
//    }
private String lower;
    public void display(){
        System.out.println("Enum = "+this.name());
    }
}

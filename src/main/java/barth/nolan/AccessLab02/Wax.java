package barth.nolan.AccessLab02;

/**
 * Created by Nolan Barth on 1/25/16.
 */
public class Wax {
    private String waxType;
    private String snowCond;
    public String getWaxType(){
        return this.waxType;
    }
    public String getSnowCond(){
        return this.snowCond;
    }
    void setWaxType(String type){
        this.waxType = type;
    }
    void setSnowCond(String cond){
        this.snowCond = cond;
    }
}

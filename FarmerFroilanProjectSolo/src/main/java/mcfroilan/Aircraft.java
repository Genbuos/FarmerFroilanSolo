package mcfroilan;

public abstract class Aircraft {
    public int modelNo;
    public String modelName;


    public Aircraft(String modelName, int modelNo){
        this.modelName = modelName;
        this.modelNo = modelNo;
    }

}

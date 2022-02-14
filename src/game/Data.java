package game;


public class Data {
    private static Data data;
    static{
        data = new Data();
    }
    public static Data getData()
    {
        return data;
    }
    public int arr[][] =new int[4][4];
    
}

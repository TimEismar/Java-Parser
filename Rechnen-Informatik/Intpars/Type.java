public class Type
{
    private String typ;
    private char value;

    

    public Type(String ttyp, char tvalue)
    {
     //Constructor
     typ = ttyp;
     value =  tvalue;
    }

    public String getTyp(){
        return typ;
    }

    public char getValue(){
        return value;
    }
}

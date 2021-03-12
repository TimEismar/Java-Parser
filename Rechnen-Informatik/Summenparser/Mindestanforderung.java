
public class Mindestanforderung
{

    public Mindestanforderung()
    {

    }

    public void checker(String term){
        boolean u = pruefeTerm(wordToArray(term));

        if(u == true){
            System.out.println("Der Term stimmte mit der Grammatik überein");
        }else{System.out.println("Der Term stimmte nicht  mit der Grammatik überein");}
    }

    public char[] wordToArray(String term){
        char[] arr = new char[term.length()]; 
        for(int i = 0; i < term.length(); i++){
            arr[i] = term.charAt(i); 
        }
        return arr;
    }

    public boolean pruefeTerm(char[] arT){
        int zustand = 0;
        boolean check = false;

        switch (arT[zustand]){
            case '+':  {return false;}
            case '1':  {zustand = 1;}break;
            case '2':  {zustand = 1;}break;
            case '3':  {zustand = 1;}break;
            case '4':  {zustand = 1;}break;
            case '5':  {zustand = 1;}break;
            case '6':  {zustand = 1;}break;
            case '7':  {zustand = 1;}break;
            case '8':  {zustand = 1;}break;
            case '9':  {zustand = 1;}break;

        }
        switch (arT[zustand]){
            case '+':  {zustand = 2;}break;
            case '1':  {return false;}
            case '2':  {return false;}
            case '3':  {return false;}
            case '4':  {return false;}
            case '5':  {return false;}
            case '6':  {return false;}
            case '7':  {return false;}
            case '8':  {return false;}
            case '9':  {return false;}
        }
        switch (arT[zustand]){
            case '+':  {return false;}
            case '1':  {return true;}
            case '2':  {return true;}
            case '3':  {return true;}
            case '4':  {return true;}
            case '5':  {return true;}
            case '6':  {return true;}
            case '7':  {return true;}
            case '8':  {return true;}
            case '9':  {return true;}
        }

        return check;
    }

}

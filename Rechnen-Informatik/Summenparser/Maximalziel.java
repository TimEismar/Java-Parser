public class Maximalziel
{
   
    public Maximalziel()
    {
        //Constructor
    }

    public void checker(String term){
        if(term.length() > 2 && plus(wordToArray(term)) == true){//Damit der Term lang genug ist
            boolean u = pruefeTerm(wordToArray(term));

            if(u == true){
                System.out.println("Der Term stimmte mit der Grammatik überein");
            }else{System.out.println("Der Term stimmte nicht  mit der Grammatik überein");}
        }
        else{System.out.println("Der Term passt nicht zu der Grammatik");}
    }

    public char[] wordToArray(String term){
        char[] arr = new char[term.length()]; 
        for(int i = 0; i < term.length(); i++){
            arr[i] = term.charAt(i); 
        }
        return arr;
    }

    public boolean pruefeTerm(char[]  arT){
        int zustand =  0;
        int count = 0;
        boolean check = true;


        for(int i = 0; i < arT.length; i++){
            switch  (zustand){

                case 0: {

                    switch (arT[i]){
                        case '+':  {return false;}
                        case '-':  {return false;}
                        case '/':  {return false;}
                        case '*':  {return false;}
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

                }

                case 1:{

                    switch (arT[i]){
                        case '+':  {zustand = 0;}break;
                        case '-':  {zustand = 0;}break;
                        case '/':  {zustand = 0;}break;
                        case '*':  {zustand = 0;}break;
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

                }

            }
    }

        return check;
    }
    
    
    public boolean plus(char[] arr){//Ob mindestesn ein Operator vorhandne ist
        
        for(int i = 0; i  < arr.length; i++){
            switch (arr[i]){
                case '+': {return true;}
                case '-': {return true;}
                case '/': {return true;}
                case '*': {return true;}
            }
        }
        
        return false;
    }

}
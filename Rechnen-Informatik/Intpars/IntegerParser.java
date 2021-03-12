public class IntegerParser
{

    public IntegerParser()
    {
        //Constructor
    }

    public void parse(String term){
        if(scanner(strToList(term), term) == true){
            System.out.println("Der Term stimmte mit der Grammatik überein");
        }
        else{System.out.println("Der Term stimmte nicht mit der Grammatik überein");}
    }

    public boolean scanner(List<Type> tList, String s){
        int zustand = 0;
        tList.toFirst();
        for(int i =  0; i < s.length(); i++){
            switch (zustand){
                case 0:{
                    switch (tList.getContent().getTyp()){
                        case "Operator": {zustand = 1;}break;
                        case "Null": {zustand = 1;}break;
                        case "Zahl": {zustand = 2;}break;
                        case "Error": {return false;}
                    }
                    tList.next();
                }break;
                case 1:{
                    switch (tList.getContent().getTyp()){
                        case "Operator": {return false;}
                        case "Null": {zustand = 1;}break;
                        case "Zahl": {zustand = 2;}break;
                        case "Error": {return false;}
                    }  
                    tList.next();
                }break;
                case 2:{
                    switch (tList.getContent().getTyp()){
                        case "Operator": {return false;}
                        case "Null": {zustand = 2;}break;
                        case "Zahl": {zustand = 2;}break;
                        case "Error": {return false;}
                    }  
                    tList.next();
                }break;
            }
        }
        return true;
    }

    public List<Type> strToList(String str){
        List<Type> tokList = new List<Type>();
        for(int i = 0; i < str.length(); i++){

            if(i == 0) {//Erster Punkt der Liste muss per Insert eingefügt werden
                switch (str.charAt(i)){
                    case '+': {tokList.insert(new Type("Operator", '+'));}break;
                    case '-': {tokList.insert(new Type("Operator", '-'));}break;
                    case '0': {tokList.insert(new Type("Null", '0'));}break;
                    case '1': {tokList.insert(new Type("Zahl", '1'));}break;
                    case '2': {tokList.insert(new Type("Zahl", '2'));}break;
                    case '3': {tokList.insert(new Type("Zahl", '3'));}break;
                    case '4': {tokList.insert(new Type("Zahl", '4'));}break;
                    case '5': {tokList.insert(new Type("Zahl", '5'));}break;
                    case '6': {tokList.insert(new Type("Zahl", '6'));}break;
                    case '7': {tokList.insert(new Type("Zahl", '7'));}break;
                    case '8': {tokList.insert(new Type("Zahl", '8'));}break;
                    case '9': {tokList.insert(new Type("Zahl", '9'));}break;
                    default: {tokList.insert(new Type("Error", 'n'));}break;
                }
            }
            else{
                switch (str.charAt(i)){//Die Restlichen werden angehangen
                    case '+': {tokList.append(new Type("Operator", '+'));}break;
                    case '-': {tokList.append(new Type("Operator", '-'));}break;
                    case '0': {tokList.append(new Type("Null", '0'));}break;
                    case '1': {tokList.append(new Type("Zahl", '1'));}break;
                    case '2': {tokList.append(new Type("Zahl", '2'));}break;
                    case '3': {tokList.append(new Type("Zahl", '3'));}break;
                    case '4': {tokList.append(new Type("Zahl", '4'));}break;
                    case '5': {tokList.append(new Type("Zahl", '5'));}break;
                    case '6': {tokList.append(new Type("Zahl", '6'));}break;
                    case '7': {tokList.append(new Type("Zahl", '7'));}break;
                    case '8': {tokList.append(new Type("Zahl", '8'));}break;
                    case '9': {tokList.append(new Type("Zahl", '9'));}break;
                    default: {tokList.append(new Type("Error", 'n'));}break;
                }
            }
        }
        
        return tokList;
    }
}


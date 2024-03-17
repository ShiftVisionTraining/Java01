import java.util.Arrays;

public class StringTestMain {

    public static void main(String[] args) {
        String myName = "Iftekhar A Ivaan";

        if(myName.toLowerCase().trim().contentEquals( "iftekhar ivaaN".toLowerCase())){
            System.out.println("Print: " + true);
        } else {
            System.out.println("Print: " + false);
        }

        System.out.println("String Length: " + myName.length());
        char[] nameArray = myName.toCharArray();
        System.out.println(Arrays.toString(nameArray));
        int count = 0;
        for(char c : nameArray){
            if(c == 'a'){
                count++;
            }
        }
        System.out.println("Number of a: " + count);

        System.out.println("String toLowerCase: " + myName.toLowerCase());
        System.out.println("String toUpperCase: " + myName.toUpperCase());
        System.out.println("String is: " + myName);
        System.out.println("String trim: " + myName.trim());
        int space = myName.indexOf(" ");
        System.out.println("Index opf space: " +  space);
        int space2 = myName.indexOf(" ", space + 1);
        System.out.println("Index opf space2: " +  space2);
        System.out.println("String LastName: " + myName.substring(space2 + 1));
        System.out.println("String substring: " + myName.substring(3,6));
        if(space > 0) {
            System.out.println("String FirstName: " + myName.substring(0, space));
        }
        System.out.println("String startsWith: " + myName.startsWith("Ift"));
        System.out.println("String endsWith: " + myName.endsWith("Ivaan"));
        System.out.println("String contains: " + myName.toUpperCase().contains("IVA"));

        if(myName.compareToIgnoreCase("iftekhar a ivaan") == 0){
            System.out.println("compareToIgnoreCase: " + true);
        }


        char oneChar = 'a';
        int x = oneChar;
        System.out.println("a:" + x);

        System.out.println((int)oneChar);

        int y = 98;
        System.out.println((char)y);

        System.out.println("String startsWith: " + myName.lastIndexOf(" "));

        String myValue = "";
        if(myValue.isEmpty()){
            System.out.println("isEmpty");
        } else{
            System.out.println("Not isEmpty");
        }

        String myBlank = " ";
        if(myBlank.isBlank()){
            System.out.println("isBlank");
        } else{
            System.out.println("Not isBlank");
        }

        String name = "Simrohn Iftekhar";
        int nameLength = name.length();
        System.out.println("Name: " + name);
        for(int i = 0; i < nameLength; i++){
           char myChar = name.charAt(i);
           System.out.println("Char: " + myChar + " Ascii: " + (int)myChar);

        }

        System.out.println("Name: " + name);
        char[] nameCharArray = name.toCharArray();
        for(char c : nameCharArray){
            System.out.println("Char: " + c + " Ascii: " + (int)c);
        }

        System.out.println(name.concat(" Hi"));

        regex();
    }


    public static void regex(){
        String name = "ahgvdhg@gmail.com";

        boolean isMatch = name.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        System.out.println("My name with regex: " + isMatch);

    }
}

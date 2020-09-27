package homeWork;

import java.util.Arrays;

public class homeWork_3 {
    public static void main(String[] args) {


        //Name
        String name = "Eduart ZiNa";
        name = name.replace(" ","");
        System.out.println(name);
        int nameLength = name.length();
        System.out.println("I have "+nameLength+" letters in my name.");
        boolean nameChar = name.startsWith("K");
        System.out.println("Does my name start with letter K ? : "+nameChar);
        String subName = name.substring(0,1);
        System.out.println("My name start with: "+subName);
        boolean endWith = name.endsWith("M");
        System.out.println("Does my last name end with letter M? "+endWith);

        //I am a good programmer
        String myStatement = "I am a good programmer";
        int statementLength = myStatement.length();
        System.out.println("I just count "+statementLength+" characters.");
        String replaceString = myStatement.replace('r', 'f');
        System.out.println("Replace r with f: "+replaceString);

        //Storing name
        String identification = "eduart";
        int count = identification.lastIndexOf("");
        System.out.println("My name have "+count+" letters.");

        //hello dear, how are you?
        String hello = "hello my dear, how are you?";
        int count2 = hello.lastIndexOf("");
        String resultCount = count2>10?"This is true, more than 10. ":"This is less than 10.";
        System.out.println(resultCount);

        //hello dear, how are you? # 2
        String hello2 = "hello my dear, how are you?";
        int countM = hello2.length();
        boolean helloboo = (countM>10);
        System.out.println("Word count is more than 10 - "+helloboo+".");

        // haPpY nEw yeAR
        String theWordStatement = "haPpY nEw yeAR";
        theWordStatement = theWordStatement.toLowerCase();
        String[] words = theWordStatement.split(" ");
        //first Array
        String firstLetter = words[0].substring(0,1);
        firstLetter= firstLetter.toUpperCase();
        String restLetters = words[0].substring(1);
        String statement = firstLetter + restLetters;
        //Second Array
        String firstLetter1 = words[1].substring(0,1);
        firstLetter1= firstLetter1.toUpperCase();
        String restLetters1 = words[1].substring(1);
        String statement1 = firstLetter1 + restLetters1;
        //Third Array
        String firstLetter2 = words[2].substring(0,1);
        firstLetter2= firstLetter2.toUpperCase();
        String restLetters2 = words[2].substring(1);
        String statement2 = firstLetter2 + restLetters2;

        String theStatementUpdated = statement+" "+statement1+" "+statement2;
        System.out.println(theStatementUpdated);

        //abbriviation
        String name5 = "Lab seSSion cLAsses";
        name5 = name5.toUpperCase();
        String[] selectOne = name5.split(" ");
        String findFirst = selectOne[0].substring(0,1);
        String findSecond = selectOne[1].substring(0,1);
        String findThree = selectOne[2].substring(0,1);
        String findAll = findFirst+findSecond+findThree;
        System.out.println("Inicials for today "+ findAll);

        //Thank you for your help
    }
}

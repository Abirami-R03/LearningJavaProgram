package ex_09_Strings;

public class Interview_Question {
    public static void main(String[] args) {
        //String Constant Pool -- it will create only one "Hello" but refer by S1,S10,S15,S16
        //it will Create "He llo" refer by S17
        //it will  Created "hello" refer by S19 but 1 time it will create
        String S1 = "Hello";
        String S10 = "Hello";
        String S15 = "Hello";
        String S16 = "Hello";
        String S17 = "He llo";
        String S19 = "hello";

        //Object Area --it will create newly everytime even though for same word
        String s2= new String("Hello");
        String s3= new String("Hello");
        String s4= new String("hello");

        // operator == comparison -- String -- this check the ref location
        System.out.println(S1==s2);//S1 in SCP nd s2 in Object area so false
        System.out.println(S1==s3);//S1 in SCP nd s2 in Object area so false
        System.out.println(s4==s2);//both are in Object area but with different reference so false
        System.out.println(S1==S10);//both are in SCP refering common one true
        System.out.println(S10==S17);//both are in SCP but with diff referene so false
        System.out.println(S19==S17);//both are in SCP but with diff referene so false
        //same word with space and case sensitive is not considerable as same reference

        // equals content -->value
        System.out.println(S1.equals(s2));//both string are matching"Hello" so true
        System.out.println(S1.equals(s3));//both string are matching"Hello" so true
        System.out.println(s4.equals(s2));//case sensitive false
        System.out.println(s4.equals(S19));//both are "hello" true
    }
}
//equalsIgnoreCase -> abirami.Abirami, ABIRAMI, abirAmi, abiramI -- abirami
//  == - check for the ref
// = assignment the value

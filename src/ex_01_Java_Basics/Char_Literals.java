package ex_01_Java_Basics;

public class Char_Literals
{
    public static void main(String[] args) {
        char a = 'A';
        int A = (int)a;//To convert char to int we have to Typecast it
        char my_laugh_smiley = '\u1f60';
        char rupees = '₹';
        char a1 = '@';
        char a2 = '_';
        char a3 = '(';
        char a4 = ',';
        char a5 = ' ';//blank space
        //literal - c, literal_Datatype = char, variable_name = a
        System.out.println(A);
        System.out.println(my_laugh_smiley);
        System.out.println(rupees);
        //Escape Char
        char new_line ='\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';


        System.out.println("AbiramiRavichandran");
        System.out.println("Abirami"+new_line+"Ravichandran");
        System.out.println("Abirami"+tab_line+"Ravichandran");
        System.out.println("Abirami."+back_space+"Ravichandran");
        System.out.println("-----");
        System.out.println("Abirami"+carriage_return+"Ravichandran");
    }
}

import java.util.Scanner;                       //Java package - Class


public class main {
    public static void main(String[] args) {
        float width;
        float height;


        Scanner scanner = new Scanner(System.in); //Classname OBJECTNAME = new Classname(arguements)

        System.out.println("Enter width: ");
        width = scanner.nextFloat();                //nextDATATYPE() : Lấy giá trị nhập vào từ bàn ph

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is : "+ area);

    }
}

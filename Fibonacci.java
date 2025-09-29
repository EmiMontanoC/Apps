import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        while (true){
            System.out.println("|---------------|");
            System.out.println("|   Fibonacci   |");
            System.out.println("|---------------|");
            System.err.println("Quieres salir(Si=1,No=cualquier num): ");
            int brk=scn.nextInt();
            if (brk==1){
                break;
            }
            System.err.println("Ingrese un numero: ");
            int num=scn.nextInt();
            fib_seq(num);
            scn.close();
        }
    }
    public static int Full_fib(int x){
        if (x>0){
            if(x==1) return 1;
            else if(x<=0) return 0;
            else{
                return Full_fib(x-1)+Full_fib(x-2);
            }
        }
        else{
            if(x==-1) return 1;
            else if(x>=0) return 0;
            else{
                return  Full_fib(x+2)-Full_fib(x+1);
            }
        }
    }
    public static void fib_seq(int x){
        if(x<0){
            int y=Math.abs(x);
            for (int i = x; i<=y; i++) {
                System.out.println("Posicion(" + i +"): " + Full_fib(i));
            }
        }
        else{
            for (int i = 0; i <= x; i++) {
                System.out.println("Posicion(" + i +"): " + Full_fib(i));
            }
        }
    }





}


package loops;

public class JumpStatementsDemo {
    public static void main(String[] args) {
        //break
        //continue

        for(int i=1;i<=10;i++){
            if(i==5){
               continue;
            }
            System.out.println(i);
        }
        System.out.println("*************************************");
        for(int i=50;i<=60;i++){
            if(i==57){
                break;
            }
            System.out.println(i);
        }
    }
}

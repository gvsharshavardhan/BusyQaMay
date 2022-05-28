package loops;

public class PatternDemo {
    public static void main(String[] args) {
        //1
        int r = 5;
        int c = 5;
        for(int i=1;i<=r;i++)
        {
            if(i%2==1)
            {
                for(int j=1;j<=c;j++)//Will print the odd rows
                {
                    if(j%2==1)
                        System.out.print("*");
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
            else
            {
                for(int j=1;j<=c;j++) ////Will print the even rows
                {
                    if(j%2==1)
                        System.out.print("#");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
        }
        //2

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}

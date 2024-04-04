package patterns;
public class BasicPattern {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern4a(5);
        pattern5(5);
        pattern28(5);
        pattern39(5);
        pattern17(5);
        pattern31(5);
        
    }

static void pattern1(int n){
    for(int row=1; row<=n; row++){
        for(int col=1; col<=n; col++){
            System.out.print("* ");
            
        }
        System.out.println();

    }
    System.out.println("----------------------------------------------------------------");
}

static void pattern2(int n){
    for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
            System.out.print("* ");
            
        }
        System.out.println();

    }
    System.out.println("----------------------------------------------------------------");

}
static void pattern3(int n){
    for(int row=1; row<=n; row++){
        for(int col=1; col<=n-row+1; col++){
            System.out.print("* ");
            
        }
        System.out.println();

    }
    System.out.println("----------------------------------------------------------------");

}
static void pattern4(int n){
    for(int row=1; row<=n; row++){ 
        for(int col=1; col<=row; col++){
            System.out.print(col+ " ");
            
        }
        System.out.println();

    }
    System.out.println("----------------------------------------------------------------");

}
static void pattern4a(int n){
    for(int row=n; row>=1; row--){
        for(int col=1; col<=row; col++){
            System.out.print(col +" ");
        }
        System.out.println();

    }
    System.out.println("----------------------------------------------------------------");

}

static void pattern5(int n){
    for(int row=1;row<=2*n;row++){
        int totalRowCount=row>n ?2*n-row:row;

        for(int col=1;col<=totalRowCount;col++){
            System.out.print("* ");
        }
        System.out.println();

    }
    System.out.println("----------------------------------------------------");
}

static void pattern28(int n){
    for(int row=1;row<=2*n;row++){
        int totalRowCount=row>n ?2*n-row:row;
        int noofSpaces=n-totalRowCount;
        for(int space=0;space<noofSpaces;space++){
            System.out.print(" ");
        }
        for(int col=1;col<=totalRowCount;col++){
            System.out.print("* ");
        }
        System.out.println();

    }
}

static void pattern39(int n){
    for(int row=1;row<=n;row++){

        for(int space=0;space<=n-row;space++){
            System.out.print("  ");

        }

        for(int col=row;col>=1;col--){
            System.out.print(col+" ");
        }
        for(int col=2;col<=row;col++){
            System.out.print(col+" ");

        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------");


}

static void pattern17(int n){
    for(int row=1;row<=2*n-1;row++){
        int totalRowCount=row>n?2*n-row:row;
        int noofSpaces=n-totalRowCount;
        for(int space=0;space<=noofSpaces;space++){
            System.out.print("  ");
        }
        for(int col=totalRowCount;col>=1;col--) {
            System.out.print(col+ " ");
        }
        for(int col=2;col<=totalRowCount;col++){
            System.out.print(col+ " ");
        }
        System.out.println();

    }
    System.out.println("----------------------------------------------------------------");

}


static void pattern31(int n){
    int OrginalValue=n;
    n=2*n;
    for(int row=0;row<=n;row++){
        for(int col=0;col<=n;col++){
            int atEveryIndex=OrginalValue-Math.min(Math.min(row, col), Math.min(n-row, n-col));
            System.out.print(atEveryIndex+" ");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");

}





}

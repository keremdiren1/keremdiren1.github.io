public class Diamond{

    public void HalfDiamond(){
        for (int i = 1; i <= 5; i++){
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }

    public void InvertedHalfDiamond(){
        for (int i = 5; i >= 1; i--){
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }

    public void FullDiamond(){
        for (int i = 4; i >= -4; i--){
            for (int k = 0; k < Math.abs(i); k++){
                System.out.print(" ");
            }
            for (int p = 8; p > Math.abs(i) * 2; p--){
                System.out.print("*");
            }
            System.out.println("*");
            System.out.println();
        }
    }

    public void HalfPlusFullDiamond(){
        for (int i = 4; i >= 0; i--){
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int p = 8; p > i * 2; p--){
                System.out.print("*");
            }
            System.out.print("*");
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int n = 5; n > i; n--){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }

    public void HalfStringDiamond(){
        for (int i = 1; i <= 5; i++){
            for (int k = 0; k < i; k++){
                if (i == 1){
                    System.out.print("A");
                }
                else if (i == 2){
                    System.out.print("B");
                }
                else if (i == 3){
                    System.out.print("C");
                }
                else if (i == 4){
                    System.out.print("D");
                }
                else{
                    System.out.print("E");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public void FullStringDiamond(){
        for (int i = 4; i >= -4; i--){
            for (int k = 0; k < Math.abs(i); k++){
                System.out.print(" ");
            }
            for (int p = 8; p > Math.abs(i) * 2; p--){
                if (i == 3){
                    System.out.print("B");
                }
                else if (i == 2){
                    System.out.print("C");
                }
                else if (i == 1){
                    System.out.print("D");
                }
                else if (i == 0){
                    System.out.print("E");
                }
                else if (i == -1){
                    System.out.print("F");
                }
                else if (i == -2){
                    System.out.print("G");
                }
                else if (i == -3){
                    System.out.print("H");
                }
            }
            if (i == 4){
                System.out.println("A");
            }
            else if (i == 3){
                System.out.println("B");
            }
            else if (i == 2){
                System.out.println("C");
            }
            else if (i == 1){
                System.out.println("D");
            }
            else if (i == 0){
                System.out.println("E");
            }
            else if (i == -1){
                System.out.println("F");
            }
            else if (i == -2){
                System.out.println("G");
            }
            else if (i == -3){
                System.out.println("H");
            }
            else if (i == -4){
                System.out.println("I");
            }
            System.out.println();
        }
    }

    public void FlexibleDiamond(int n){
        for (int i = n; i >= -n; i--){
            for (int k = 0; k < Math.abs(i); k++){
                System.out.print(" ");
            }
            for (int p = n * 2; p > Math.abs(i) * 2; p--){
                System.out.print("*");
            }
            System.out.println("*");
            System.out.println();
        }
    }


    public static void main(String[] args){
        Diamond elmas = new Diamond();
        elmas.HalfDiamond();
        System.out.println();
        System.out.println();
        elmas.InvertedHalfDiamond();
        System.out.println();
        System.out.println();
        elmas.FullDiamond();
        System.out.println();
        System.out.println();
        elmas.HalfPlusFullDiamond();
        System.out.println();
        System.out.println();
        elmas.HalfStringDiamond();
        System.out.println();
        System.out.println();
        elmas.FullStringDiamond();
        System.out.println();
        System.out.println();
        elmas.FlexibleDiamond(7);
    }
}
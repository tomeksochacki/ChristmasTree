package Science;

public class HelloWorld {
    /**
     * public static void main(String s) {
     * System.out.println(s);
     * }
     */
    public void printTriangle(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0; j<i+1;j++){
                System.out.print("*");}
                System.out.println();
            }
        }
    
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printTriangle(4);


    }
}


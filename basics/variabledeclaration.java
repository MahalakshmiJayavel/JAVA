public class variabledeclaration {
    int age = 25;
    String name= "Maha";
    float height= 5.1f;
    char initial= 'J';
    boolean liketowatchmovies= false;
    

    public static void main(String[] args) { 
        variabledeclaration vd = new variabledeclaration();
        System.out.println("age:" + vd.age );
        System.out.println("name: "+ vd.name);
        System.out.println("height:" + vd.height);
        System.out.println("Initia: "+ vd.initial);
        System.out.println("like to watch movies:" + vd.liketowatchmovies);


    }

}
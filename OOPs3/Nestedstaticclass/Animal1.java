package OOPs3.Nestedstaticclass;

class Animal{

    class Reptile{

        public void displayinfo()
        {
            System.out.println("Iam reptile");
        }
    }



    static class mammel{

        public void displayinfo()
        {
            System.out.println("iam mammel");
        }
    }

}



public class Animal1 {
    

    public static void main(String[] args) {
        

        Animal animal = new Animal();

        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayinfo();

        Animal.mammel mam = new Animal.mammel();
        mam.displayinfo();



    }



}

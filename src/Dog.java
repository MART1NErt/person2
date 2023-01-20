public class Dog {
    String Name;
    int Age;
    String Breed;
    String Color;
    Boolean Hungry;

    public Dog(String n,int a,String b,String c){
        this.Name = n;
        this.Age = a;
        this.Breed = b;
        this.Color = c;
        this.Hungry = false;
    }

    public String toString(){
        return this.Name + " " + this.Age + " " + this.Breed + " " + this.Color + " " + this.Hungry;

    }
}

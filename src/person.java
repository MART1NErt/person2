public class person {
    String Name;
    String Surname;
    int Age;
    int Weight;
    int Height;
    public Dog x;
    public person(String n,String s,int a,int w,int h) {
        this.Name = n;
        this.Surname = s;
        this.Age = a;
        this.Weight = w;
        this.Height = h;
    }
    public String toString(){
        return this.Name + " " + this.Surname + " " + this.Age + " years " + this.Weight + "kg " + this.Height + "sm." + this.x.toString();
    }
}

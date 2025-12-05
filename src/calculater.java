public class calculater {
    public double X;
    public double y;

    public calculater(double num1,double num2){
            this.X=num1;
            this.y=num2;
            
    }

    public double add(){
            return this.X + this.y;

    }
    public double sub(){
            return this.X - this.y;
}
    public double mul(){
            return this.X * this.y;

    }
    public double div(){
            return this.X / this.y;

    }
}
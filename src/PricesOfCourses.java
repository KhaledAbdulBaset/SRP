public class PricesOfCourses {
    private double Subject1Price;
    private double Subject2Price;
    private double Subject3Price;



    public void setPriceOfSub1(String s1) {
        if (s1.equals("arabic"))
        {this.Subject1Price=1000;}
        else{this.Subject1Price=0;}
    }

    public double getSubject1Price() {return Subject1Price;}


    public void setPriceOfSub2(String s2) {
        if (s2.equals("math"))
        {this.Subject2Price=1500;}
        else{this.Subject2Price=0;}
    }


    public double getSubject2Price() {return Subject2Price;}


    public void setPriceOfSub3(String s3) {
        if (s3.equals("english"))
        {this.Subject3Price=2000;}
        else{this.Subject3Price=0;}
    }
    public double getSubject3Price() {return Subject3Price;}

    public void validation(){
        if ((Subject2Price==Subject1Price)||(Subject2Price==Subject3Price))
            System.out.println("Error");
    }


}

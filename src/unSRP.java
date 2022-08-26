public class unSRP {
    /*
    consequences of not using SRP
   
    1- UnExplicit Name of class
    2- Functions is not in line with the purpose
    3- Everything is not focused



     */
    private String Name1;
    private int Id1;
    private String sub1;
    private String sub2;
    private String sub3;
    private double Subject1Price;
    private double Subject2Price;
    private double Subject3Price;

    public String getName1() {
        return Name1;
    }

    public void setName1(String name1) {
        Name1 = name1;
    }

    public int getId1() {
        return Id1;
    }

    public void setId1(int id1) {
        Id1 = id1;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public double getSubject1Price() {
        return Subject1Price;
    }

    public void setSubject1Price(String s1) {

        if (s1.equals("arabic"))
        {this.Subject1Price=1000;}
        else{this.Subject1Price=0;}
    }

    public double getSubject2Price() {
        return Subject2Price;
    }

    public void setSubject2Price(String s2) {
        if (s2.equals("math"))
        {this.Subject2Price=1500;}
        else{this.Subject2Price=0;}
    }

    public double getSubject3Price() {
        return Subject3Price;
    }

    public void setSubject3Price(String s3) {
        if (s3.equals("english"))
        {this.Subject3Price=2000;}
        else{this.Subject3Price=0;}
    }
}

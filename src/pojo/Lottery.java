package pojo;

import java.text.SimpleDateFormat;

public class Lottery {
    SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
    public String time;
    public float price;
    public int countNums;//笔数,一笔等于100股；
    public int orders;//单数，表示每个价格有多少人成交；
    public String will;//buy还是sell

    public Lottery(String time,float price,int countNums,int orders,String will){
    this.time=time;
    this.price=price;
    this.countNums=countNums;
    this.orders=orders;
    this.will=will;
    }

}

/* 
* @Author: 马磊  
* @Date: 2019-03-01 15:14:03  
* @Last Modified by:   马磊  * @Last Modified time: 2019-03-01 15:14:03  */
//设计模式-代理模式
public class DL{
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("jiaojiao");
        Proxy proxy = new Proxy(girl);
        proxy.GiveFlowers();
        proxy.GiveMoney();
    }
}
//被追求者
class Girl{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
//接口-公用方法
interface IGiveGift{
    //方法-送花
    void GiveFlowers();
    //方法-送钱
    void GiveMoney();
}
//想要送礼物的人（类）
class ZQZ implements IGiveGift{
    //被追求着对象
    Girl girl;
    //构造方式
    public ZQZ(){

    }
    public ZQZ(Girl girl){
        this.girl = girl;
    }
    public void GiveFlowers(){
        System.out.println("送你花");
    }
    public void GiveMoney(){
        System.out.println("送你钱");
    }
}
//代理类
class Proxy implements IGiveGift{
    //送礼物的人（对象）
    ZQZ zqz;
    //构造方法
    public Proxy(Girl girl){
        zqz = new ZQZ(girl);
    }
    public void GiveFlowers(){
        zqz.GiveFlowers();
    }
    public void GiveMoney(){
        zqz.GiveMoney();
    }
}
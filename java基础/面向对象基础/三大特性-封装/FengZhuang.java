/* 
* @Author: 马磊  
* @Date: 2019-02-27 14:25:55  
* @Last Modified by:   马磊  * @Last Modified time: 2019-02-27 14:25:55  */
//封装子类的属性，关键词 private
public class FengZhuang{
    public static void main(String[] args) {
        //实例化new
        Animal animal = new Animal();
        animal.shut();
        animal.setName("张三");
        animal.shut();
    }
}
class Animal{//一个java文件中只能有一个public修饰的类方法
    private String name;
    public void shut(){
        String name = "李四";
        System.out.println("姓名1："+name+"  姓名2："+this.name);
        //name是局部变量，this.name是类的属性也就是成员变量
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
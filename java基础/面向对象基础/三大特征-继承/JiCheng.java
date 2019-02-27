/* 
* @Author: 马磊  
* @Date: 2019-02-27 14:45:58  
* @Last Modified by:   马磊  * @Last Modified time: 2019-02-27 14:45:58  */
//继承 关键字 entends
public class JiCheng{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shut();
    }
}
//设计模式-模板方法
class AnimalJC{
    String name;
    Integer age;
    public void shut(){
        System.out.println("主类");
    }
}
class Cat extends AnimalJC{

}
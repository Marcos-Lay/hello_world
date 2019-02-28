import java.util.Scanner;

/* 
* @Author: 马磊  
* @Date: 2019-02-28 10:51:58  
* @Last Modified by:   马磊  * @Last Modified time: 2019-02-28 10:51:58  */
/*
    设计模式-简单工厂模式-实现计算器
*/
//vscode实现从控制台输入需要在配置中加入 "console": "integratedTerminal"
public class JDGC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入第一个数");
            double num1 = sc.nextDouble();
            System.out.println("请输入操作符");
            String oper = sc.next();
            System.out.println("请输入第二个数");
            double num2 = sc.nextDouble();
            JSQ jsq1 = JSQFactory.createJSQ(oper);
            jsq1.setNum1(num1);
            jsq1.setNum2(num2);
            double result = jsq1.getResult();
            System.out.println("结果为："+result);
        }
        finally{
            //由于Scanner实例化会使用InputStream流来做参数，所以需要关闭防止占用内存
            sc.close();
        }
    }
}
//创建父类-计算器
abstract class JSQ{//当方法或属性是抽象类是，主类一定也是抽象类 关键字abstract
    private double num1;//封装属性，只能通过set/get
    private double num2;
    public abstract double getResult();
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public Double getNum1(){
        return num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }
    public Double getNum2(){
        return num2;
    }
}
//创建子类（加法）继承父类（计算器）
class Add extends JSQ{
    public double getResult(){
        return getNum1()+getNum2();
    }
}
//创建工厂类
class JSQFactory{
    public static JSQ createJSQ(String oper){//使用static后可以不用实例化类直接调用方法
        JSQ jsq = null;
        switch(oper){
            case "+":
                jsq = new Add();
                break;
        }
        return jsq;
    }
}
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
            System.out.println("请输入一个数");
            String age = sc.next();
            System.out.println("age"+age);
        }
        finally{
            //由于Scanner实例化会使用InputStream流来做参数，所以需要关闭防止占用内存
            sc.close();
        }
    }
}
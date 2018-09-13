import java.util.Scanner; //引用文字读取API

//这只是activity2其中的一个尝试，和最终代码无关

public class errortest  //类名称
{
   public static void main(String[] args) //子类
   {
   Scanner userInput = new Scanner(System.in); //配置文字读取基本信息
   int age = 0;  //设定变量 “age” 基础设定值是0
   int gender = 0; //设定变量 “gender” 基础设定值是0

   //Activity2 还要求设定2个其他的变量 分别是 “name” 和 “maxHeartRate"
   //其中 变量 ”maxHeartRate" 的类型是双倍数类. 变量 “name” 类型是字符串类
   
   System.out.print("Years: "); 
   age = userInput.nextInt();  //等待用户输入一个值 并且把这个值回传到变量 “age” 中
   System.out.println("\tIn min: " + age * 525600 + "m."); //计算
   System.out.println("\tIn centuries: " + (double) age / 100 + "c.");
   System.out.print("Gender(0 for male and 1 for female): ");
   gender = userInput.nextInt(); // 等待一个值，回传至变量 “gender”
   System.out.print("Your MHR: ");
   if (gender == 1) { //判断变量 “gender” 是否等于 1
      System.out.print(209 - (0.7 * age)); //女性
   }
   else {
      System.out.print(214 - (0.8 * age));
   } 
   System.out.println("/m."); //最后补单位
   
   } 

}
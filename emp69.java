import java.io.*;
class Emp
{
  int code=0;
  String name, gd;
  double bs=0f, da=0f, ta=0f, hra=0f, pf=0f, gs=0f;
  void getdata() throws IOException{
    DataInputStream inp=new DataInputStream(System.in);
      System.out.println("Enter Code:");
      code=Integer.parseInt(inp.readLine());
      System.out.println("Enter the name:");
      name=inp.readLine();
      System.out.println("Enter Basic Salary:");
      bs=Double.valueOf(inp.readLine()).doubleValue();
  }
  public void caldata(){
    da=(bs*150)/100;
    ta=(bs*20)/100;
    hra=(bs*40)/100;
    pf=(bs*10)/100;
    gs=bs+da+ta+hra-pf;
    if(gs<20000){
      gd="C";
    }else if(gs<30000){
      gd="B";
    }else {
      gd="A";
    }
  }
  public void putdata(){
    System.out.println(code+"\t"+name+"\t"+bs+"\t"+da+"\t"+ta+"\t"+hra+"\t"+pf+"\t"+gs+"\t"+gd);
  }
}
public class emp69
{
  public static void main(String[] args)throws IOException{
    Emp e[] = new Emp[20];
    for(int x=0;x<2;x++)
    {
      e[x] = new Emp();
    }
    int i;
    for(i=0;i<2;i++)
    {
      System.out.println("Enter Data of the Employee no."+(i+1)+":");
      e[i].getdata();
      e[i].caldata();
    }
    System.out.println("\t\tANUP COMPANY Ltd.");
    System.out.println("\t\tSALARY SHEET");
    System.out.println("\t\tMonth DEC.2020");
    System.out.println("-----------------------------------------");
    System.out.println("CODE\tNAME\tBASIC\tDA\tTA\tHRA\tPF\tGross\tGrade\t");
    System.out.println("------------------------------ -----------");
    for(i=0;i<2;i++)
    {
      e[i].putdata();
    }
    System.out.println("-----------------------------------------");
  }
  }
